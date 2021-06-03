package p02.c02;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Parque implements IParque{

    // Variables
    private int personasTotales;
    private Hashtable<String, Integer> contadorPersonasPuerta;

    private static Random generadorAleatorios = new Random();

    public Parque() {
        personasTotales = 0;
        contadorPersonasPuerta = new Hashtable<>();
    }

    @Override
    public synchronized void entrarAlParque(String puerta) {
        personasTotales++;

        try {
            TimeUnit.MILLISECONDS.sleep(generadorAleatorios.nextInt(3000));
        } catch (InterruptedException ex) {
            Logger.getGlobal().log(Level.INFO,"Interrupción de hilos que utiliza el objeto parque.");
        }

        if(contadorPersonasPuerta.get(puerta) == null)
            contadorPersonasPuerta.put(puerta, 0);

        contadorPersonasPuerta.put(puerta, contadorPersonasPuerta.get(puerta) + 1);


        imprimirInfo(puerta);

        comprobarInvariante();
    }

    private void imprimirInfo(String puerta) {
        System.out.println("Entrada al parque por puerta " + puerta);
        System.out.println("--> Personas en el parque " + personasTotales);

        for(Map.Entry<String, Integer> e : contadorPersonasPuerta.entrySet()) {
            System.out.println("----> Por puerta " + e.getKey()  + " " + e.getValue());
        }
        System.out.println("");
    }

    private void comprobarInvariante() {
        int personasDentro = 0;
        for(Map.Entry<String, Integer> e : contadorPersonasPuerta.entrySet()) {
            personasDentro += e.getValue();
        }
        assert personasDentro == personasTotales : "No coinciden el numero de personas.";
    }

}
