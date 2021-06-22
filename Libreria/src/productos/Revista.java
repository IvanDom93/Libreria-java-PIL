package productos;


public class Revista extends Producto {
    private String fechaPublicacion;

    public Revista(String titulo, float precio, String fechaPublicacion) {
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
