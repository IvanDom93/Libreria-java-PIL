package paquete;

public class Comics extends Libros {
    private String dibujante;
    private String colorista;

    public Comics(String nombreComic,String autorNombre,float precioLibro,String genero, String editorial,int añoPublacion, String dibujante, String colorista) {
        this.titulo = nombreComic;
        this.autorNombre = autorNombre;
        this.precio = precioLibro;
        this.genero = genero;
        this.añoPublicacion = añoPublacion;
        this.editorial = editorial;
        this.dibujante = dibujante;
        this.colorista = colorista;
    }

    public Comics() {

    }





    @Override
    public String toString() {
        return "Listado de Comics: " +
                "Nombre de comic: '" + titulo + '\'' +
                ", Escritor: '" + autorNombre + '\'' +
                ", Precio: " + precio +
                ", Genero: '" + genero + '\'' +
                ", Editorial: '" + editorial + '\'' +
                ", Año de publicación: "+ añoPublicacion +
                ", Dibujante: '" + dibujante + '\'' +
                ", Colorista: '" + colorista + '\'';
    }
}
