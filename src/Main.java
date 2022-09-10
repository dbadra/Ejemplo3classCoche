import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();

        miCoche.agregarPuerta();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puerta);
    }

}

    class Auto {

        public int puerta = 0;


        public void agregarPuerta() {
            this.puerta++;

            //this.puerta = puerta++;
        }


    }



