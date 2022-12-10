import java.util.Arrays;


public class Vogels {
    //demanda[] es para almacenar las demandas

    static int demand[] = {170,50,30};

    //supply[] es para almacenar los suministros
    static int supplly[] = {140,50,60};

    //noOfDemands para almacenar el número de demandas
    static	int noOfDemands=demand.length;

    //noOfSupplies para almacenar el número de suministros
    static int noOfSupplies=supplly.length;

    //mathMatrix[][] para almacenar los costes
    static int mathMatrix[][]={{20,7,10},{5,0,8},{6,10,9}};

    //totalSupplly es la suma de todos los suministros
    static int totalSupplly=250;

    //rowPenalty es para almacenar la diferencia entre dos valores mínimos en una fila
    static int rowPenalty[]=new int[noOfSupplies];
    //colPenalty es para almacenar la diferencia entre dos valores mínimos en una columna
    static int colPenalty[]=new int[noOfDemands];

    //totalCost para almacenar el coste total. totalcost = cost*(supply || demand)
    static int totalCost=0;

    //colIndexOfMinValueInRow almacena los índices de los valores mínimos en cada fila . Al revés, con rowIndexOfMinValueInCol
    static int colIndexOfMinValueInRow[]=new int[noOfSupplies];
    static	int rowIndexOfMinValueInCol[]=new int[noOfDemands];


    static int max , maxIndex;

    //penaltyRow es verdadero si esa fila contiene el valor máximo de la sanción
    //penaltyCol es verdadero si esa columna contiene el valor máximo de la sanción
    static boolean penaltyRow = false,penaltyCOl=false;

    /*
     * if rowCOunt=0 entonces toda la matriz tiene una fila para calcular.
     * if colCOunt=0 entonces toda la matriz tiene una columna que calcular.
     * en ambos casos no se debe calcular la penalización.
     */
    static int rowCount=noOfSupplies-1, colCount=noOfDemands-1;

    /*
     * rowOver almacena true if su fila ha sido completamente asignada
     * colOver almacena true if su col ha sido completamente asignada
     */
    static boolean rowOver[]=new boolean[noOfSupplies];
    static boolean colOver[]=new boolean[noOfDemands];

    static int countDown=10;

    public static void main(String[] args) {

        Arrays.fill(rowOver, false);
        Arrays.fill(colOver, false);

        System.out.println("demanda = "+noOfDemands);
        System.out.println("oferta/suministro = "+noOfSupplies);
        System.out.println("los costos de la matriz matemática");


        while (totalSupplly!=0){
            int rowPosition=0,colPosition=0;

            if ( (rowCount==0) || (colCount==0) ) {
                printMatrix();
            }

            if(rowCount==0) {


                for(int i=0;i<noOfSupplies;i++) {

                    if(rowOver[i]) {
                        continue;
                    }
                    rowPosition=i;
                }//end of for

                boolean dec=true;
                while(dec) {
                    int  tempMin=Integer.MAX_VALUE;
                    for(int i=0;i<noOfDemands;i++){
                        if(colOver[i]){
                            continue;
                        }
                        if(mathMatrix[rowPosition][i]<tempMin) {
                            tempMin=mathMatrix[rowPosition][i];
                            colPosition=i;
                        }
                    }//end of for
                    cal(rowPosition,colPosition);
                    colOver[colPosition]=true;
                    tempMin=Integer.MAX_VALUE;

                    if(totalSupplly==0) {
                        dec=false;
                    }
                }//end of while
                return ;
            }// if(rowCount==0)

            if(colCount==0) {



                for(int i=0;i<noOfDemands;i++) {

                    if(colOver[i]) {
                        continue;
                    }
                    colPosition=i;
                }//end of for


                boolean dec=true;
                while (dec) {
                    int tempMin=Integer.MAX_VALUE;
                    for(int i=0;i<noOfSupplies;i++){
                        if(rowOver[i]){
                            continue;
                        }
                        if(mathMatrix[i][colPosition]<tempMin) {
                            tempMin=mathMatrix[i][colPosition];
                            rowPosition=i;
                        }
                    }//end of for
                    cal(rowPosition,colPosition);
                    rowOver[rowPosition]=true;

                    tempMin=Integer.MAX_VALUE;
                    printMatrix();
                    if(totalSupplly==0) {
                        dec=false;
                    }
                }//end of while
                System.out.println("..............");
                printMatrix();
                return ;
            } //if(colCount==0)
            pen();



            if(penaltyRow) {
                //encontrar el coste total y reducir el valor de la fila/columna de penalización
                rowPosition=maxIndex; colPosition=colIndexOfMinValueInRow[maxIndex];
                cal(rowPosition,colPosition);
            }else {
                //encontrar el menor coste en la col
                rowPosition=rowIndexOfMinValueInCol[maxIndex]; colPosition=maxIndex;
                cal(rowPosition,colPosition);
            }


            if(demand[colPosition]==0) {
                colCount--;
                colOver[colPosition]=true;
            }
            if(supplly[rowPosition]==0) {
                rowCount--;
                rowOver[rowPosition]=true;
            } // end of if

            if(countDown<0) {
                return;
            }
        }//end of while

    }	//end of main()

    public static int pen(){
        //calcular la penalización en filas
        int minValueInRow[]=new int[noOfSupplies], minValueInCol[]=new int[noOfDemands];
        for(int i=0;i<noOfSupplies;i++){
            if(rowOver[i]){
                continue;
            }
            int firstMin=Integer.MAX_VALUE, secondMin=Integer.MAX_VALUE;

            for(int j=0;j<noOfDemands;j++) {
                if(colOver[j]) {
                    continue;
                }

                if(mathMatrix[i][j]<=secondMin){
                    secondMin=mathMatrix[i][j];
                    if(secondMin<=firstMin ) {
                        int temp=firstMin;
                        firstMin=secondMin;
                        secondMin=temp;
                        colIndexOfMinValueInRow[i]=j;
                    }//first if
                } //second if

            }//end of 1st for loop
            rowPenalty[i]=secondMin-firstMin;
            minValueInRow[i]=firstMin;
        } //end of 2nd for loop


        for (int value : rowPenalty) {
            System.out.println("Penalización de valor en fila = " + value);
        }

        // cálculo de la penalización en cols.
        for (int i=0;i<noOfDemands;i++){
            if(colOver[i]){
                continue;
            }
            int firstMin=Integer.MAX_VALUE, secondMin=Integer.MAX_VALUE;

            for(int j=0;j<noOfSupplies;j++){
                if(rowOver[j]){
                    continue;
                }
                if(mathMatrix[j][i]<=secondMin) {
                    secondMin=mathMatrix[j][i];
                    if(secondMin<=firstMin) {
                        int temp=firstMin;
                        firstMin=secondMin;
                        secondMin=temp;
                        rowIndexOfMinValueInCol[i]=j;
                    }//second if
                }//first if
            }	//end of 1st for loop
            colPenalty[i]=secondMin-firstMin;	//calcular la penalización
            minValueInCol[i]=firstMin;
        }//end of 2nd for loop


        for ( int value : colPenalty) {
            System.out.println("Penalización de valor en fila= " + value);
        }


        int rowMaxValue = rowPenalty[0];
        int rowMaxValueIndex = 0;
        for (int i = 0; i < rowPenalty.length; i++) {
            if(rowOver[i]){
                continue;
            }
            if (rowPenalty[i] >= rowMaxValue) {
                rowMaxValue = rowPenalty[i];
                rowMaxValueIndex=i;
            }//end of if
        }//end of for loop

        int colMaxValue = colPenalty[0];
        int colMaxValueIndex = 0;
        for (int i = 0; i < colPenalty.length; i++) {
            if(colOver[i]) {
                continue;
            }
            if (colPenalty[i] >= colMaxValue) {
                colMaxValue = colPenalty[i];
                colMaxValueIndex=i;
            }//end of if
        }//end of for loop

        penaltyRow = false; penaltyCOl=false;
        if(rowMaxValue>colMaxValue) {
            maxIndex = rowMaxValueIndex;
            penaltyRow=true;
            int maxValue=rowMaxValue;
            int firstMin=minValueInRow[0];
            for(int i=0;i<noOfSupplies;i++){
                if(rowOver[i]) {
                    continue;
                }
                if(maxValue==rowPenalty[i]) {
                    if(minValueInRow[i]<=firstMin) {
                        maxIndex=i;
                        firstMin=minValueInRow[i];
                    }

                }//end of if
            }//end of for

        } else {
            maxIndex = colMaxValueIndex;
            penaltyCOl=true;
            int maxValue=colMaxValue;
            int firstMin=minValueInCol[0];
            for(int i=0;i<noOfDemands;i++) {
                if(colOver[i]) {
                    continue;
                }

                if(maxValue==colPenalty[i]){
                    if(minValueInCol[i]<=firstMin){
                        firstMin=minValueInCol[i];
                        maxIndex=i;
                    }
                }
            }//end of if
        }	//end of far

        return 0;
    }
    public static void cal(int rowPosition, int colPosition) {
        countDown=countDown-1;

        if(supplly[rowPosition]<demand[colPosition]){
            demand[colPosition]=demand[colPosition]-supplly[rowPosition];
            totalCost = mathMatrix[rowPosition][colPosition]*supplly[rowPosition] + totalCost;
            totalSupplly = totalSupplly - supplly[rowPosition];
            supplly[rowPosition]=0;
        } else {
            supplly[rowPosition]=supplly[rowPosition]-demand[colPosition];
            totalCost = mathMatrix[rowPosition][colPosition] * demand[colPosition] + totalCost;
            totalSupplly = totalSupplly - demand[colPosition];
            demand[colPosition]=0;
        }
        System.out.println("Costo Total = "+totalCost );
    }
    public static void printMatrix(){
        for(int i=0;i<noOfSupplies;i++) {
            for(int j=0;j<noOfDemands;j++) {
                System.out.print("["+mathMatrix[i][j]+"]" );
            }
            System.out.println();
        }
    }

//final del programa de la clase de Vogel
}
