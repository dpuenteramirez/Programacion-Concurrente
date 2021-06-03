package p02.c02;

import java.util.Hashtable;
import java.util.Map;

public class SistemaLanzador {

    public static void main(String[] args) {
        IParque parque = new Parque();
        int NUMERODEPUERTAS = 20;
        char[] alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Hashtable<String, Thread> misPuertas = new Hashtable<>();

        for(int i = 0; i < NUMERODEPUERTAS; i++) {
            String letra = Character.toString(alfabeto[i]);
            misPuertas.put(letra, new Thread(new ActividadDeEntradaPorPuerta(letra, parque)));
        }


        for(Map.Entry<String, Thread> e : misPuertas.entrySet())
            e.getValue().start();
        for(Map.Entry<String, Thread> e : misPuertas.entrySet()) {
            try {
                e.getValue().join();
            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
        }

    }

}