package pg01.c04;

import java.util.concurrent.TimeUnit;

public class MyThread implements Runnable {

    char character;
    long repetitions;
    int waitTime;

    public MyThread(char c, long reps, int pause) {
        this.character = c;
        this.repetitions = reps;
        this.waitTime = pause;
    }


    @Override
    public void run() {
        for(long i = 0; i < repetitions; i++){
            System.out.println(character);
            for (long k = 0; k < repetitions; k++){
            }
            try {
                Thread.currentThread().sleep(waitTime);
                System.out.println(Thread.currentThread().getName() + " es su nombre.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
