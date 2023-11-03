import app.ListaTareasApp;
import controlador.TareasController;
import modelo.ListaTareas;
import vistas.Menu;

public class Main {
    public static void main(String[] args) {
        ListaTareasApp app = new ListaTareasApp(3);
        app.ejecutar();
    }
}