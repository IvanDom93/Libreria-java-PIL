package paquete;

public class Libros extends Productos {
    protected String autorNombre;
    protected String genero;
    protected String editorial;
    protected int añoPublicacion;

    public  Libros(){

    }
    public Libros(String nombreLibro, String autorNombre, float precioLibro, String genero, String editorial, int añoPublicacion) {
        this.titulo = nombreLibro;
        this.autorNombre = autorNombre;
        this.precio = precioLibro;
        this.genero = genero;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
    }

    public String getAutorNombre() {
        return this.autorNombre;
    }

    public  String getGenero(){
        return this.genero;
    }

    @Override
    public String toString() {
        return "Listado de libros: " +
                "Nombre de libro: '" + titulo + '\'' +
                ", Autor: '" + autorNombre + '\'' +
                ", Precio: " + precio +
                ", Genero: '" + genero + '\'' +
                ", Editorial: '" + editorial + '\''+
                ", Año de publiación: "+añoPublicacion;
    }
}

