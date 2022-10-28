import javax.xml.transform.Transformer;

public class HiloThread extends Thread {//extiende de THREAD

    //parte 1 constructores
    // como se va a configurar el hilo
    public HiloThread(String name){
        this.setName(name);
    }
    // prioridad de ejecución
    public HiloThread(String name, int priority){
        this.setName(name);
        this.setPriority(priority);
    }
    // Ejecución (RUN)
    public void run(){
        int contador=0;
        for (int i = 1; i < 101; i++) {
            contador++;
            /*
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("hilo reactivado");
            }
            finally {
                System.out.println("Final Iteración");
            }

             */
        }
        System.out.println("Soy un hilo - creado Thread y mi nombre es: "+getName());
    }

    public void dormir (int tiempo) throws InterruptedException {
        Thread.sleep(tiempo);
    }
}
