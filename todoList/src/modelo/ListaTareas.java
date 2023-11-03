package modelo;

public final class ListaTareas {
    private Tarea[] tareas;
    private static int numTareas;

    public ListaTareas(int capacidad) {
        tareas = new Tarea[capacidad];
        numTareas = 0;
    }

    public void agregarTarea(String nombre) {
        if (numTareas < tareas.length) {
            Tarea nuevaTarea = new Tarea(nombre);
            tareas[numTareas] = nuevaTarea;
            numTareas++;
        } else {
            System.out.println("La lista de tareas está llena.");
        }
    }

    public void marcarTareaComoCompletada(int indice) {
        indice--;
        if (indice >= 0 && indice < numTareas) {
            tareas[indice].EstaCompletada();
        } else {
            System.out.println("Índice de tarea no válido.");
        }
    }


    public Tarea getOne(int index) {
        return tareas[index];
    }

    public void editarTarea(int indice, String tareaEditada) {
        Tarea tarea = this.getOne(indice - 1);
        tarea.setNombre(tareaEditada);
    }

    public void eliminarTarea(int indice) {
        indice--;
        if (indice >= 0 && indice < numTareas) {
            tareas[indice] = null;
            for (int i = indice; i < numTareas - 1; i++) {
                tareas[i] = tareas[i + 1];
            }
            numTareas--;
        } else {
            System.out.println("Índice de tarea no válido.");
        }
    }

    public void mostrarTareas() {
        if (numTareas == 0) {
            System.out.println("No se han creado tareas");
            System.out.println("=======================");
            System.out.println("    LISTA DE TAREAS    ");
            System.out.println("=======================");
            System.out.println("=====No hay tareas=====");
            System.out.println("=======================");
            System.out.println("");
            return;
        }
        System.out.println("Lista de tareas:");
        System.out.println("=======================");
        System.out.println("    LISTA DE TAREAS    ");
        System.out.println("=======================");
        for (int i = 0; i < numTareas; i++) {
            System.out.println(i + 1 + ". " + tareas[i]);
        }
        System.out.println("=======================");
        System.out.println("");
        System.out.println("");
    }
}

