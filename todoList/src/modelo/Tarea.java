package modelo;

public final class Tarea {
    private String nombre;
    private boolean completada;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.completada = false;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void EstaCompletada() {
        if (completada) {
            completada = false;
        }else{ completada = true;}
    }

    @Override
    public String toString() {
        return (completada ? "[X] " : "[ ] ") + nombre;
    }
}
