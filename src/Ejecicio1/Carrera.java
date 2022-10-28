package Ejecicio1;

import Ejecicio1.modelo.Animal;

public class Carrera {
    public static void main(String[] args) throws InterruptedException {
        Animal a1 = new Animal("Tortuga",10);
        Animal a2 = new Animal("Liebre",5);
        Animal a3 = new Animal("Guepardo",1);


            a3.run();
            a2.run();
            a1.run();

            a3.join();
            a2.join();
            a1.join();
        System.out.println("Carrera Terminada");
    }
}
