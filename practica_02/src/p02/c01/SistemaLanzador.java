package p02.c01;

public class SistemaLanzador {

    public static void main(String[] args) {
        IParque parque = new AdaptadorParqueSincronizado.getInstancia();
        Thread puertaA = new Thread(new ActividadDeEntradaAPuerta("A", parque));
        Thread puertaB = new Thread(new ActividadDeEntradaAPuerta("B", parque));

        puertaA.start();
        puertaB.start();
    }

}
