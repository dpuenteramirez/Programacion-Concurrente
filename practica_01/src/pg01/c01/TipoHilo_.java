package pg01.c01;

public class TipoHilo_ implements  Runnable{
    @Override
    public void run() {
        for(long i = 0; i < 10000000; i++) {
            System.out.println('_');
        }
        System.out.println();
    }
}
