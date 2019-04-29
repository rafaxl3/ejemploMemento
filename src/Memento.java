/**
 * Clase que engloba el patron
 */
public class Memento {
    private String estado;
    public Memento(String estado){
        this.estado = estado;
    }

    /**
     * Metodo que devuelve el estado del memento
     * @return
     */
    public String getSavedState(){
        return estado;
    }
}