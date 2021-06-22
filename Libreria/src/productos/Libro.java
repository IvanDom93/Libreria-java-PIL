package productos;

public class Libro extends Producto {
    protected String autorNombre;
    protected String genero;
    protected String editorial;
    protected int aniopublicacion;

    public Libro() {

    }

    public Libro(String nombreLibro, String autorNombre, float precioLibro, String genero, String editorial, int aniopublicacion) {
        this.titulo = nombreLibro;
        this.autorNombre = autorNombre;
        this.precio = precioLibro;
        this.genero = genero;
        this.editorial = editorial;
        this.aniopublicacion = aniopublicacion;
    }

    public String getAutorNombre() {
        return this.autorNombre;
    }

    public String getGenero() {
        return this.genero;
    }


    @Override
    public String toString() {
        return "Listado de libros: " +
                "Nombre de libro: '" + titulo + '\'' +
                ", Autor: '" + autorNombre + '\'' +
                ", Precio: " + precio +
                ", Genero: '" + genero + '\'' +
                ", Editorial: '" + editorial + '\'' +
                ", Año de publiación: " + aniopublicacion;
    }
}

