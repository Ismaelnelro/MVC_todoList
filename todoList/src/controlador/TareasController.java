package controlador;

import modelo.ListaTareas;

public class TareasController {
    ListaTareas listaTareas;

    public TareasController(int capacidad) {
        listaTareas = new ListaTareas(capacidad);
    }


    public void mostarTareas() {
        listaTareas.mostrarTareas();
    }

    public void agregarTarea(String nuevaTarea) {
        listaTareas.agregarTarea(nuevaTarea);
    }


    public void marcarCompletada(int tareaIndice) {
        listaTareas.marcarTareaComoCompletada(tareaIndice);
    }

    public void editarTarea(int indice, String tareaEditada){
        listaTareas.editarTarea(indice, tareaEditada);
    }

    public void eliminarTarea(int indice){
        listaTareas.eliminarTarea(indice);
    }

}
