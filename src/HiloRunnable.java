public class HiloRunnable implements Runnable{

    private Thread thread;

    public HiloRunnable(String nombre) {
        this.thread = new Thread(this,nombre);
        thread.start();
    }

    public HiloRunnable (String nombre, int prioriodad){
        this.thread = new Thread(this,nombre);
        this.thread.setPriority(prioriodad);
    }
    //impide que el hilo del main termine
    public void join() throws InterruptedException {
        this.thread.join();
    }

    public void interrupt(){
        this.thread.interrupt();
    }


    @Override
    public void run (){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("DESPERTADO");
        }
        System.out.println("hijoRunable: "+this.thread.getName());

    }
}
