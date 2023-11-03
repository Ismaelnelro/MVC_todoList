package app;

import controlador.TareasController;
import vistas.Menu;

public class ListaTareasApp {

    private Menu menu;
    private TareasController controller;

    public ListaTareasApp(int capacidad) {
        menu = new Menu();
        controller = new TareasController(capacidad);
    }

    public void ejecutar() {
        int opcion , tareaIndice;

        do {
            menu.mostrarMenu();
            opcion = menu.obtenerOpcion();

            switch (opcion) {
                case 1:
                    controller.mostarTareas();
                    break;
                case 2:
                    controller.agregarTarea(menu.obtenerDescripcionTarea());
                    break;
                case 3:
                    controller.mostarTareas();
                     tareaIndice = menu.obtenerIndiceTarea();
                    controller.marcarCompletada(tareaIndice);
                    break;
                case 4:
                    controller.mostarTareas();
                    tareaIndice = menu.obtenerIndiceTarea();
                    controller.editarTarea(tareaIndice, menu.obtenerDescripcionTarea());
                    break;
                case 5:
                    controller.mostarTareas();
                    tareaIndice = menu.obtenerIndiceTarea();
                    controller.eliminarTarea(tareaIndice);
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 6);
    }

}
