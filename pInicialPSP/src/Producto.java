public abstract class Producto {
    private String titulo;
    private float precio;
    private int anyo_publicacion;
    private int descuentoProducto;

    public Producto(String titulo, float precio, int anyo_publicacion) {
        this.titulo = titulo;
        this.precio = precio;
        this.anyo_publicacion = anyo_publicacion;
    }

    int obtenerDescuento() {
        return descuentoProducto;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setDescuentoProducto(int descuentoProducto) {
        this.descuentoProducto = descuentoProducto;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public int getAnyo_publicacion() {
        return anyo_publicacion;
    }

    public int getDescuentoProducto() {
        return descuentoProducto;
    }
}
