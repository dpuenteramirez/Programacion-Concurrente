package bloqueo;

public class Consumidor_bloqueo extends Thread{

    private Dato_bloqueo recurso;

    public Consumidor_bloqueo(Dato_bloqueo r) {
        super("Consumidor");
        recurso = r;
    }

    @Override
    public void run() {
        int val, sum = 0;

        do {
            try {
                Thread.sleep((int) (Math.random() * 15000));
            } catch (InterruptedException ex) {
                System.err.println(ex.toString());
            }
            val = recurso.getDato();
            System.out.println("El consumidor " + Thread.currentThread().getId() +" recuperó " + val + " del recurso compartido.\n");
            sum++;
        } while (val != 14);
        System.err.println("Fin del consumidor. El número total de valores consumidos es: " + sum);
    }
}
