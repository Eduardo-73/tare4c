/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjetos;

/**
 * Titulo, Género{"Acción", "comedia", "Scifi", "Drama"}, sinopsis,
 * Nºtemporadas, productor
 */
//Declaración de la clase
public class Serie {

    //Atributos de clase(Static)
    //Atributos de instancia(no Static)
    private String titulo;
    private String genero;
    private String sinopsis;
    private String productor;
    private int temporadas;
    private int numLikes;

    public Serie() {
        //Los atributos quedan inicializados con valores por defectos 
        //Objetos apuntan a null
        //Números a cero
        //Boolean a false
    }

    public Serie(String titulo, String genero, String sinopsis, String productor, int temporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productor = productor;
        this.temporadas = temporadas;
    }

    public Serie(String titulo, String genero, String sinopsis, String productor, int temporadas, int numLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productor = productor;
        this.temporadas = temporadas;
        this.numLikes = numLikes;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", sinopsis=" + sinopsis + ", productor=" + productor + ", temporadas=" + temporadas +", numLikes=" + numLikes + '}';
    }
    
    public void darLike(){
     this.numLikes++;   
    }
}
