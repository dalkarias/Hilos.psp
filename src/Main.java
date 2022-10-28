public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*
          HiloThread hiloThread = new HiloThread("Hijo de puta");
        System.out.println("Voy a crear un bastado");
        hiloThread.start();//creamos hilos en paralelo
        //hilo.join();//esperamos a que uno termine para dale paso al otro
        Thread.sleep(500);//el main es el hijo principal
        hiloThread.interrupt();

        System.out.println("Main terminado");
         */
        /*
        for (int i = 1; i <10 ; i++) {
            int prioridad = i%2 ==0 ? 1:10;
            HiloThread hiloThread = new HiloThread("hilo "+i,prioridad);
            hiloThread.start();
            hiloThread.dormir(1000);
        }

         */

       HiloRunnable hiloRunnable = new HiloRunnable("Hilo 1");

       //hiloRunnable.join();
        Thread.sleep(1000);//hilo principal main
        hiloRunnable.interrupt();//despertar al hijo

       System.out.println("Terminado Main");
    }
}
