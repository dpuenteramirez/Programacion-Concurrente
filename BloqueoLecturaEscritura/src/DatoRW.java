import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class DatoRW {

    private int dato;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public DatoRW(int dato) {
        super();
        this.dato = dato;
    }

    public int getDato() {
        lock.readLock().lock();
        int datoAux = dato;
        lock.readLock().unlock();
        return datoAux;
    }

    public void setDato(int dato) {
        lock.writeLock().lock();
        this.dato = dato;
        lock.writeLock().unlock();
    }
}
