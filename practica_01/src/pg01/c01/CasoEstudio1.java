package pg01.c01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CasoEstudio1 {

    public static void main(String[] args) {
        Thread hiloX = new Thread(new TipoHiloX());
        Thread hiloO = new Thread(new TipoHiloO());
        Thread hilo_ = new Thread(new TipoHilo_());

        ExecutorService exec = Executors.newCachedThreadPool();
        // El video aparentemente es el caso de estudio 4
        exec.execute(new TipoHilo_());
        hiloX.start();
        hiloO.start();
        hilo_.start();

        /*
        Respuesta 1: NO CADA VEZ QUE SE EJECUTA ES DISTINTO
        RESPUESTA 2: RECOGE TODOS LOS HILOS Y EN FUNCIÓN DE LAS NECESIDADES QUE TENGA EL SISTEMA
        Y LA CARGA, IRÁ DANDO RESPUESTA.
        RESPUESTA 3:
         */
    }
}
