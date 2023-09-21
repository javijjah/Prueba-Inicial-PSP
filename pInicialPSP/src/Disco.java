public class Disco extends Producto {

    public Disco(String titulo, float precio, int anyo_publicacion, Genero_Musica genero, String grupo, int stock) {
        super(titulo, precio, anyo_publicacion);
        Genero = genero;
        Grupo = grupo;
        Stock = stock;
    }

    private Genero_Musica Genero;
    private String Grupo;
    int Stock;

    public Genero_Musica getGenero() {
        return Genero;
    }

    public void setGenero(Genero_Musica genero) {
        Genero = genero;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "Genero=" + Genero +
                ", Grupo='" + Grupo + '\'' +
                ", Stock=" + Stock +
                '}';
    }
}
