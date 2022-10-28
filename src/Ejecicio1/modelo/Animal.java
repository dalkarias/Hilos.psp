package Ejecicio1.modelo;

public class Animal extends Thread {
    private String nombre;

    public Animal(String nombre, int priority) {
        this.nombre = nombre;
        this.setPriority(priority);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre ;
    }

    public void run(){
       
        System.out.println("Soy " + this.getNombre());
    }

    public void dormir (int tiempo) throws InterruptedException {
        Thread.sleep(tiempo);
    }
}
