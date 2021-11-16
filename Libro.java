
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro) {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
    }
    
    public String getAutorLibro() {
        return autor;
    }
    
    public String getTituloLibro() {
        return titulo;
    }
    
    public void imprimeAutor() {
        System.out.println(" El auutor del libro es: " + autor);
    }
    
    public void imprimeTitulo() {
        System.out.println(" El título del libro es: " + titulo);
    }
    
    public int getNumeroPaginasLibro() {
        return numeroPaginas;
    }
    
    public void imprimirDetalles() {
        System.out.println(" Título: " + titulo + "," + " Autor: " + autor + "," + " Páginas " + numeroPaginas + ".");
    }
    
    public String getDetalles() {
        String detalles = " Título: " + titulo + "," + " Autor: " + autor + "," + " Páginas " + numeroPaginas + ".";
        return detalles;
    }
}
