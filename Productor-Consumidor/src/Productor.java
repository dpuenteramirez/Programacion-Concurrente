public class Productor extends Thread{

    private Dato recurso;

    public Productor(Dato r) {
        super("Productor");
        recurso = r;
    }

    @Override
    public void run() {
        for (int contador = 1; contador <= 14; contador++){
            try {
                Thread.sleep((int) Math.random() *15000);
            } catch (InterruptedException ex) {
                System.err.println(ex.toString());
            }
            recurso.setDato(contador);
            System.out.println("El productor puso " + contador + " en el recurso compartido.\n");
        }
        System.err.println("\n**** Fin del productor.");
    }
}
