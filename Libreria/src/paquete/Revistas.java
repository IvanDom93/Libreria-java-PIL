package paquete;



public class Revistas extends Productos {
    private String fechaPublicacion;

    public Revistas(String titulo, float precio, String fechaPublicacion) {
        this.titulo = titulo;
        this.precio = precio;
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Listado de Revistas: " +
                "Nombre de revista: '" + titulo + '\'' +
                ", precio: " + precio +
                ", Fecha de publicación: '" + fechaPublicacion + '\'';
    }
}
