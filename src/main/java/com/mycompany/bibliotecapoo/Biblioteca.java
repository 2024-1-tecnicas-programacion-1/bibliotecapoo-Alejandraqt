package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<Libro> libros;
    
    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/
    /**
    
     * Constructor de la clase Biblioteca: Inicializa los atributos de mi clase
     * 
     * @param libros
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Biblioteca(){
        this.libros = new LinkedList<>();
    }
    
    /**
     * Método para registrar la informacion de un libro
     * @return void: Regustra/Agrega la informacion del libro ingresado
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public void registrarLibro(Libro nuevoLibro){
        libros.add(nuevoLibro);
    }
    
    /**
     * Método para buscar coincidencia de un libro
     * @return LinkedList: Busca un libro ya registrado con la coincidencia ingresada
     *
     * Complejidad temporal: O(N) Tiempo Lineal
     */
    public LinkedList<Libro> buscarLibro(String palabraBusqueda) {
        LinkedList<Libro> resultados = new LinkedList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(palabraBusqueda.toLowerCase()) ||
                libro.getAutor().toLowerCase().contains(palabraBusqueda.toLowerCase())) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    /**
     * Método para listar todos los libros ingresados
     * @return void: Retorna la informacionde todos lo libros que han sido ingresados
     *
     * Complejidad temporal: O(N) Tiempo Lineal
     */
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            System.out.println("Libros disponibles:");
            for (Libro libro : libros) {
                System.out.println(libro.mostrarInformacion());
            }
        }
    }

    /**
     * Método para listar los libros que no han sido leidos
     * @return void: Retorna la informacion de todos lo libros que no han sido marcados como leidos
     *
     * Complejidad temporal: O(N) Tiempo Lineal
     */
    public void mostrarLibrosNoLeidos() {
        System.out.println("Libros no leídos:\n");
        for (Libro libro : libros) {
            if (!libro.isLeido()) {
                System.out.println(libro.mostrarInformacion());
            }
        }
    }
    
    /**
     * Método para marcar un libro como leido
     * @return boolean: Retorna si un libro ya fue leido
     *
     * Complejidad temporal: O(N) Tiempo Lineal
     */
    public boolean marcarLibroComoLeido(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.marcarLeido();
                return true;  
            }
        }
        return false;
    }
}
