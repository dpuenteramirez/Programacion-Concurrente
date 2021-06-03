package p02.c01;

public class AdaptadorParqueSincronizado implements IParque{

    // Declaración de variables
    private IParque parque;
    private static AdaptadorParqueSincronizado instancia = new AdaptadorParqueSincronizado();

    // Constructor
    private AdaptadorParqueSincronizado(){
        this.parque = new Parque();
    }

    public static AdaptadorParqueSincronizado getInstancia() {
        return instancia;
    }

    @Override
    public synchronized void entrarAlParque(String puerta) {
        parque.entrarAlParque(puerta);
    }

}
