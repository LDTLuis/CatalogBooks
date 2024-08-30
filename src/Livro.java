public class Livro {

    private String titulo;
    private String autor;
    private int AnoPublicado;

    public Livro(String titulo, String autor, int anoPublicado) {
        this.titulo = titulo;
        this.autor = autor;
        AnoPublicado = anoPublicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicado() {
        return AnoPublicado;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", AnoPublicado=" + AnoPublicado +
                '}';
    }
}
