/**
 * Clase que ejecutara todos los metodos
 */
public class Principal {
    public static void main(String[] args){
        Principal principal = new Principal();
        principal.ejecutar();
    }

    private void ejecutar() {
        //Crear caretaker y el usuario
        Caretaker caretaker = new Caretaker();
        Usuario usr = new Usuario();
        //Cambiar la propiedad del usuario
        usr.setNombre("Rafa");
        usr.setNombre("Javi");
        //Guardar estado
        caretaker.addMemento(usr.saveToMemento());
        //Cambiar la propiedad al usuario
        usr.setNombre("Antonio");
        //Guardar estado
        caretaker.addMemento(usr.saveToMemento());

        usr.setNombre("Diego");
        //Creamos un objeto memento con el estado del objeto guardado
        Memento m1 = caretaker.getMemento(0);
        Memento m2 = caretaker.getMemento(1);
        //Imprimimos el estado por pantalla
        System.out.println(m1.getSavedState());
        System.out.println(m2.getSavedState());
    }
}
