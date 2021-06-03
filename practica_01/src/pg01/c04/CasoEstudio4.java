package pg01.c04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CasoEstudio4 {

    public static void main(String[] args) {

        Thread hiloX = new Thread(new MyThread('x', 1000, 10));
        Thread hiloO = new Thread(new MyThread('o', 1000, 10));
        Thread hilo_ = new Thread(new MyThread('_', 1000, 10));

        //ExecutorService exec = Executors.newCachedThreadPool();
        //ExecutorService exec = Executors.newSingleThreadExecutor();
        ExecutorService exec = Executors.newFixedThreadPool(5);

        //ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);

        // Planificar la tarea que se repite cada 5 segundos.
        //exec.scheduleAtFixedRate(hiloX, 0, 5, TimeUnit.SECONDS);
        //exec.schedule(hiloX, 0, TimeUnit.SECONDS);

        exec.execute(hiloX);
        exec.execute(hiloO);
        exec.execute(hilo_);

        //exec.shutdown();

    }

}
