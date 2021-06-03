package estatico;

public class TestProductorConsumidor_static {
    public static void main(String[] args) {
        Dato_static r = new Dato_static();
        Productor_static p = new Productor_static(r);
        Consumidor_static c = new Consumidor_static(r);
        c.start();
        p.start();
    }
}
