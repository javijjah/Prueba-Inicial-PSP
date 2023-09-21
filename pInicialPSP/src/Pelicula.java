public class Pelicula extends Producto{
    Genero_Pelicula Genero;
    String Director;

    public Pelicula(Genero_Pelicula genero, String director,String titulo, float precio, int anyo_publicacion) {
        super(titulo,precio,anyo_publicacion);
        Genero = genero;
        Director = director;
    }

    public Genero_Pelicula getGenero() {
        return Genero;
    }

    public void setGenero(Genero_Pelicula genero) {
        Genero = genero;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "Genero=" + Genero +
                ", Director='" + Director + '\'' +
                '}';
    }
}
