package com.openbootcamp;

public class Main {
    public static void main(String[] args) {

        suma(1,2,3);

        Coche miCoche = new Coche();
        miCoche.sumaPuertas();
        System.out.println("La cantidad de puertas actual de miCoche es de: " +miCoche.numeroDePuertas);


    }
    public static void suma (int a, int b, int c){
        int resultado = a+b+c;
    }
}

class Coche {

    int numeroDePuertas = 3;

    public void sumaPuertas(){
        this.numeroDePuertas++;
    }

}
