package pg01.c02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CasoEstudio2 {

    public static void main(String[] args) {
        Thread hiloX = new Thread(new TipoHiloX());
        Thread hiloO = new Thread(new TipoHiloO());
        Thread hilo_ = new Thread(new TipoHilo_());

        try {
            // al tener en cada uno un join, lo hemos convertido en secuencial
        hiloX.start();
            hiloX.join(); // hasta que el hilo no termine, no pasa a lo siguiente
        hiloO.start();
           // hiloO.join();
        hilo_.start();
            hilo_.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
