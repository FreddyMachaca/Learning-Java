package eventos;

import java.util.ArrayList;

//es un contrato que obliga a que las clases que lo implementen
interface Mensajero{
    void hanSaludado();
}

//la clase Receptor que implementa el contrato Mensajero
class Receptor implements Mensajero{
    @Override
    public void hanSaludado() {
        System.out.println("Hola en clase receptor");
    }
}

class ReceptorMusical implements Mensajero{
    @Override
    public void hanSaludado(){
        System.out.println("Sonando música");
    }
}

//la clase emisora que tiene un método que llama a un evento
class Emisor{
    private ArrayList<Mensajero> receptores = new ArrayList<>(); //lista de receptores

    public void meteReceptor(Mensajero receptor){ //mete un receptor en la lista
        receptores.add(receptor); //añade el receptor a la lista
    }

    public void saluda(){
        for (Mensajero ml : receptores) {        //recorre la lista de receptores
            ml.hanSaludado();                    //llama al evento
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Emisor emisor = new Emisor(); //crea un emisor
        Receptor receptor = new Receptor(); //crea un receptor
        ReceptorMusical receptorMusical = new ReceptorMusical(); //crea un receptor musical

        emisor.meteReceptor(receptor); //añade el receptor al emisor
        emisor.meteReceptor(receptorMusical); //añade el receptor musical al emisor

        emisor.saluda(); //llama al evento
    }
}
