public class TestProductorConsumidor {
    public static void main(String[] args) {
        Dato r = new Dato();
        Productor p = new Productor(r);
        Consumidor c = new Consumidor(r);
        c.start();
        p.start();
    }
}
