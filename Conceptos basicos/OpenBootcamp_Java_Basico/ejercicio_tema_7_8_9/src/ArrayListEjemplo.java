import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEjemplo {
    public static void main(String[] args) {
        arrayList();
        arrayList1();
    }

    public static void arrayList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        //copiar en una linkedList
        LinkedList<Integer> linkedList = new LinkedList<Integer>(arrayList);

        for (Integer list : arrayList) {
            System.out.println(list);
        }

        for(Integer list: linkedList){
            System.out.println(list);
        }
    }

    public static void arrayList1() {
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        //añadir 10 elementos con un for
        for(int i = 1; i<=10; i++){
            arrayList2.add(i);
        }

        //recorrer con un for y eliminar los pares
        for(int i = 0; i<arrayList2.size(); i++){
            if(i%2 == 0){
                arrayList2.remove(i);
                continue;
            }
            System.out.println(arrayList2.get(i));
        }


    }
}
