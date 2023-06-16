public class Array {
    public static void main(String[] args) {
        arrayUnidimensional();
        arrayBidimensional();
    }

    public static void arrayUnidimensional(){
        String[] nombres = {
            "Carlos",
            "Rafael",
            "Pedro",
            "Edinaldo",
        };

        for (String nombre: nombres) {
            System.out.println(nombre);
        }
    }

    public static void arrayBidimensional(){
        int[][] numeros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        for(int i = 0; i<numeros.length;i++){
            for(int j=0; j<numeros[i].length;j++){
                System.out.println("Estoy en J: " + j+ " y estoy en I: " + i);
                System.out.println(numeros[i][j]);
            }
        }
    }
}
