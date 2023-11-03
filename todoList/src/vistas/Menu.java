package vistas;

import java.util.Scanner;

public class Menu {

    private Scanner sc = new Scanner(System.in);
    private Scanner scLine = new Scanner(System.in);
    public void mostrarMenu() {
        System.out.println("=== Menú ===");
        System.out.println("1. Ver tareas");
        System.out.println("2. Agregar tarea");
        System.out.println("3. Marcar tarea como completada");
        System.out.println("4. Editar Tareas");
        System.out.println("5. Eliminar Tareas");
        System.out.println("6. Salir");
    }

    public int obtenerOpcion() {
        System.out.print("Elije una opción: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    public String obtenerDescripcionTarea() {
        System.out.println("Descripción de la tarea:");
        String descripcion = scLine.nextLine();
        return descripcion;
    }

    public int obtenerIndiceTarea() {
        System.out.println("Selecciona el numero de tarea a modificar");
        int numeroTarea =sc.nextInt();
        return numeroTarea;
    }


    public int eliminarTarea() {
        System.out.println("Selecciona el numero de tarea que desea eliminar");
        int numeroTarea =sc.nextInt();
        return  numeroTarea;
    }
}
