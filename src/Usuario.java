/**
 * Clase Usuario
 * Creara un usuario con su nombre
 */
public class Usuario {
    private String nombre;
    public Usuario(){
        this.nombre = "Rafa";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre;
    }

    /**
     * Guarda el estado del objeto en un memento
     * @return
     */
    public Memento saveToMemento(){
        System.out.println("Guardando memento...");
        Memento memento = new Memento(nombre);
        return memento;
    }

    /**
     * Restaura el estado de un objeto a partir de un memento
     * @param memento
     */
    public void restoreFromMemento(Memento memento){
        nombre = memento.getSavedState();
    }
}
