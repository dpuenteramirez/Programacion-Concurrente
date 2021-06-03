package estatico;

public class Consumidor_static extends Thread{

    private Dato_static recurso;

    public Consumidor_static(Dato_static r) {
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
