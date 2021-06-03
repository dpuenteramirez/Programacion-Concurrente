package p02.c01;

import java.util.Hashtable;
import java.util.Map;

public class Parque implements IParque{

    // Atributos
    private int personasTotales;
    private Hashtable<String, Integer> contadorPersonasPuerta;

    // Constructor
    public Parque(){
        this.personasTotales = 0;
        this.contadorPersonasPuerta = new Hashtable<>();
    }


    @Override
    public  void entrarAlParque(String puerta) {
        // Incrementar contadores
        personasTotales++;
        if (contadorPersonasPuerta.get(puerta) != null) {
            contadorPersonasPuerta.put(puerta, contadorPersonasPuerta.get(puerta) + 1);
        } else {
            contadorPersonasPuerta.put(puerta, 1);
        }
        // Mensaje
        imprimirMensaje(puerta);
        // Comprobar el invariante de los contadores
        comprobarInvariante();

    }

    public  void imprimirMensaje(String puerta) {
        System.out.println("Entrada al parque por puerta " + puerta);
        System.out.println("Personas en parque " + personasTotales);
        for(Map.Entry<String, Integer> e : contadorPersonasPuerta.entrySet()) {
            System.out.println("----> Por puerta " + e.getKey()  + " " + e.getValue());
        }
        System.out.println("");
    }

    public  void comprobarInvariante() {
        int personasDentro = 0;
        for(Map.Entry<String, Integer> e : contadorPersonasPuerta.entrySet()) {
            personasDentro += e.getValue();
        }
        assert personasDentro == personasTotales : "No coincide el número de personas dentro con el calculado.";
    }

}
