import java.util.ArrayList;

/**
 * Clase Caretaker del patron
 * Consiste en guardar todos los memento
 */
public class Caretaker {
    private ArrayList<Memento> estados;
    public Caretaker(){
        estados = new ArrayList<Memento>();
    }

    /**
     *  Metodo que insertara un nuevo memento al caretaker
     * @param memento
     */
    public void addMemento(Memento memento){
        estados.add(memento);
    }

    /**
     * Metodo que devolvera un memento a partir de un indice
     * @param indice
     * @return
     */
    public Memento getMemento(int indice){
        return estados.get(indice);
    }

}
