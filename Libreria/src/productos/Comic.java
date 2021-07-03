package productos;

public class Comic extends Libro {
    private String dibujante;
    private String colorista;

    public Comic(String nombreComic, String autorNombre, float precioLibro, String genero, String editorial, int añoPublacion, String dibujante, String colorista) {
        this.titulo = nombreComic;
        this.autorNombre = autorNombre;
        this.precio = precioLibro;
        this.genero = genero;
        this.aniopublicacion = añoPublacion;
        this.editorial = editorial;
        this.dibujante = dibujante;
        this.colorista = colorista;
    }

    public Comic() {

    }




    @Override
    public String toString() {
        return "Listado de Comics: " +
                "Nombre de comic: '" + titulo + '\'' +
                ", Escritor: '" + autorNombre + '\'' +
                ", Precio: " + precio +
                ", Genero: '" + genero + '\'' +
                ", Editorial: '" + editorial + '\'' +
                ", Año de publicación: " + aniopublicacion +
                ", Dibujante: '" + dibujante + '\'' +
                ", Colorista: '" + colorista + '\'';
    }
}
