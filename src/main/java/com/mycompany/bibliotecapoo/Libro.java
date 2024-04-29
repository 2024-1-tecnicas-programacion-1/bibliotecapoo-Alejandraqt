package com.mycompany.bibliotecapoo;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String genero;
    private boolean leido;
        
    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/
    /**
     *
     * Constructor de la clase Libro: Inicializa los atributos de la clase
     *
     * @param titulo
     * @param autor
     * @param anioPublicacion
     * @param genero
     * @param leido
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Libro(String titulo, String autor, int anioPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.leido = false;
    }

    /**
     * Método para retornar la informacion de los libros registrados
     * @return String: Retorna la informacion de los libros que han sido registrados anteriormente
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public String mostrarInformacion() {
        String respuesta = "Libro: " + titulo + " publicado por " + autor + " en " + anioPublicacion /* + " de genero " + genero*/;
        return respuesta;
    }
        
    /**
     * Método para retornar el titulo del libro
     * @return String: Retorna el titulo del libro
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public String getTitulo(){
        return titulo;
    }
    
    /**
     * Método para retornar el nombre del autordel libro
     * @return String: Retorna el nombre del autor del libro
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public String getAutor(){
        return autor;
    }
    
    /**
     * Método para marcar como leido
     * @return void: Valida la marcacion de un libro como leido
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public void marcarLeido(){
        leido = true;
    }
    
    /**
     * Método que permite retornar si un libro ya fue leido
     * @return boolean: true si el libro ya fue leido, false si no ha sido leido
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public boolean isLeido(){
        return this.leido;
    }
    
    /**
     * Método para validar la antiguedad de un libro
     * @return void: Valida si un libro tiene mas de 50 años de antiguedad
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public void esAntiguo(){
        if (2024-anioPublicacion>50){
            System.out.println("antiguo");
        }
    }
}
