package p02.c01;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActividadDeEntradaAPuerta implements Runnable {

    // Declarar variables
    private static final int NUMEROENTRADAS = 20;
    private String puerta;
    private IParque parque;

    // Constructor
    public ActividadDeEntradaAPuerta(String puerta, IParque parque) {
        this.puerta = puerta;
        this.parque = parque;
    }


    @java.lang.Override
    public void run() {
        for (int i = 0; i < NUMEROENTRADAS; i++) {
            // Entrar al parque (par puerta puerta)
            this.parque.entrarAlParque(this.puerta);
            // Dormir tiempo aleatorio (1000-5000)
            try {
                Thread.sleep(new Random().nextInt(5) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Logger.getGlobal().log(Level.INFO,"Finalizada entrada por la puerta " + puerta);
    }
}
