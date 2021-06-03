package pg01.c02;

public class TipoHiloO implements  Runnable{
    @Override
    public void run() {
        for(long i = 0; i < 100000; i++) {
            System.out.print('o');
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
