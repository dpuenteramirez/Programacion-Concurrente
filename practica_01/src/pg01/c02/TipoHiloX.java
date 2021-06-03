package pg01.c02;

public class TipoHiloX implements  Runnable{
    @Override
    public void run() {
        for(long i = 0; i < 100000; i++) {

            System.out.print('x');
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
