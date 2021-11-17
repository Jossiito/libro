
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
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;
    
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro, boolean libroDeTexto) {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = libroDeTexto;
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
        System.out.println(" Título: " + titulo + "," 
            + " Autor: " + autor + "," + " Páginas: " 
            + numeroPaginas +", " + " Este libro se ha prestado: "
            + vecesPrestado + " veces. ");
        if (numeroReferencia == "") {
            System.out.println(" Numero de referencia: ZZZ " + ".");
        }
        else {
            System.out.println(" Numero de referencia: " + numeroReferencia + ".");
        }
        if (esLibroDeTexto == true) {
            System.out.println(" Es un libro de texto.");
        }
        else {
            System.out.println(" No es un libro de texto.");
        }
    }
    
    public String getDetalles() {
        String detalles = " Título: " + titulo + "," + 
                " Autor: " + autor + "," + " Páginas " 
                + numeroPaginas + "," + " Este libro se ha prestado: "
                + vecesPrestado + " veces. ";
        if (numeroReferencia == "") {
            detalles = detalles + " Numero de referencia: ZZZ " + ".";
        }
        else {
            detalles = detalles + " Numero de referencia: " + numeroReferencia + ".";
        }
        if (esLibroDeTexto == true) {
            detalles = detalles + " Es un libro de texto.";
        }
        else {
            detalles = detalles + " No es un libro de texto.";
        }
        return detalles;
    }
    
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    public void setNumeroReferencia(String numeroReferenciaLibro) {
        if (numeroReferenciaLibro.length() < 3) {
            System.out.println("La longitud del numero de referencia es demasiado corta");
        }
        else {
            numeroReferencia = numeroReferenciaLibro;
        }
    }
    
    public void prestar(){
        vecesPrestado = vecesPrestado + 1;
    }
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    public boolean esLibroDeTexto(){
        return esLibroDeTexto;
    }
}
