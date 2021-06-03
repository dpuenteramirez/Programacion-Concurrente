package bloqueo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Dato_bloqueo {

    private int dato = -1;
    private Lock sepuedeescribir = new ReentrantLock();

    public void setDato(int val){
        sepuedeescribir.lock();
        dato = val;
        sepuedeescribir.unlock();
    }

    public synchronized int getDato() {
        sepuedeescribir.lock();
        int dat = dato;
        sepuedeescribir.unlock();
        return dat;
    }
}
