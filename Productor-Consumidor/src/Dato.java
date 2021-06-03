public class Dato {

    private int dato = -1;
    private boolean sepuedeescribir = true;

    public synchronized void setDato(int val){
        while(!sepuedeescribir) {
            try {
                //System.err.println("Pausa de escritura, se está poniendo un dato.\n");
                wait();
            } catch(InterruptedException ex) {
                System.err.println(ex.toString());
            }
        }
        dato = val;
        sepuedeescribir = false;
        notify();
    }

    public synchronized int getDato() {
        while (sepuedeescribir){
            try {
                //System.err.println("Pausa de lectura, se está recuperando un dato.\n");
                wait();
            } catch (InterruptedException ex) {
                System.err.println(ex.toString());
            }
        }
        sepuedeescribir = true;
        notify();
        return dato;
    }
}
