package productos;

public abstract class Producto {
    protected String titulo;
    protected float precio;

    public String getTitulo() {
        return titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
