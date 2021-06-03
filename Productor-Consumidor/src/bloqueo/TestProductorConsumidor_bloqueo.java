package bloqueo;

public class TestProductorConsumidor_bloqueo {
    public static void main(String[] args) {
        Dato_bloqueo r = new Dato_bloqueo();
        Productor_bloqueo p = new Productor_bloqueo(r);
        Consumidor_bloqueo c = new Consumidor_bloqueo(r);
        c.start();
        p.start();
    }
}
