import java.util.ArrayList;
import java.util.List;

public class Subasta implements Subject{
    private double monto;
    private List<Observer> obsevers;
    public Subasta(double montoInicial){
        this.obsevers=new ArrayList<>();
        this.monto=montoInicial;

    }


    @Override
    public void agregarOferente(Observer o) {
        this.obsevers.add(o);
    }

    @Override
    public void quitarOferente(Observer o) {
        this.obsevers.remove(o);
    }

    @Override
    public void notificarOferente() {
        for(Observer observer:this.obsevers){
            observer.update(this.monto);
        }
    }
}
