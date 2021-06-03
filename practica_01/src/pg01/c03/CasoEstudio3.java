package pg01.c03;

public class CasoEstudio3 {

    public static void main(String[] args) {

        Thread hiloX = new Thread(new MyThread('x', 100000, 1000));
        Thread hiloO = new Thread(new MyThread('o', 100000, 1000));
        Thread hilo_ = new Thread(new MyThread('_', 100000, 1000));

        hiloX.setPriority(10); // Máxima prioridad
        hiloX.start();

        hiloO.setPriority(5); // Prioridad media
        hiloO.start();

        hilo_.setPriority(1); // Mínima prioridad
        hilo_.start();
    }

}
