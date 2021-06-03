package p02.c02;


import java.util.logging.Level;
import java.util.logging.Logger;

public class ActividadDeEntradaPorPuerta implements Runnable{

    // Declarar variables
    private static final int NUMEROENTRADAS = 20;
    private String puerta;
    private IParque parque;

    // Constructor
    public ActividadDeEntradaPorPuerta(String puerta, IParque parque) {
        this.puerta = puerta;
        this.parque = parque;
    }


    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for(int i = 0; i < NUMEROENTRADAS; i++) {
            parque.entrarAlParque(puerta);
        }
        Logger.getGlobal().log(Level.INFO,"Finalizada entrada por la puerta " + puerta);
    }
}
