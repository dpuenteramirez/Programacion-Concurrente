package pg01.c03;

import java.util.concurrent.TimeUnit;

public class MyThread implements Runnable {

    char character;
    int repetitions;
    int waitTime;

    public MyThread(char c, int reps, int pause) {
        this.character = c;
        this.repetitions = reps;
        this.waitTime = pause;
    }


    @Override
    public void run() {
        for(int i = 0; i < repetitions; i++){
            System.out.println(character);
            if(i % 2 == 0)
                Thread.yield();
            try {
                TimeUnit.MILLISECONDS.sleep(waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
