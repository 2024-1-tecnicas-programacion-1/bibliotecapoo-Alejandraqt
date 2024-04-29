package com.mycompany.bibliotecapoo;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
   /**
     * @param args
     *
     * Complejidad temporal: O(N) Tiempo Lineal
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca miBiblioteca = new Biblioteca(); 
        
        boolean continuar = true; 
        
        while (continuar) {
            System.out.println("\n-- Menú --\n");
            System.out.println("1. Ingresar libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Marcar libro como leído");
            System.out.println("5. Mostrar libros no leídos");
            System.out.println("6. Salir\n");
            System.out.print("Seleccione una opción: ");
            
            int opcion = sc.nextInt();
            sc.nextLine(); 
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el título del libro:");
                    String titulo = sc.nextLine();
                    System.out.println("Ingrese el autor del libro:");
                    String autor = sc.nextLine();
                    System.out.println("Ingrese el año de publicacion del libro:");
                    int anioPublicacion = sc.nextInt();
                    System.out.println("Ingrese el genero del libro:");
                    String genero = sc.nextLine();
                    Libro nuevoLibro = new Libro(titulo, autor, anioPublicacion, genero);

                    miBiblioteca.registrarLibro(nuevoLibro); 
                    System.out.println("Libro ingresado con éxito.");
                    break;
                
                case 2:
                    miBiblioteca.mostrarLibros();
                    break;
                
                case 3:
                    System.out.println("Ingrese una palabra clave para buscar libros:");
                    String palabraBusqueda = sc.nextLine();
                    LinkedList<Libro> resultadosBusqueda = miBiblioteca.buscarLibro(palabraBusqueda);
                    if (resultadosBusqueda.isEmpty()) {
                        System.out.println("No se encontraron libros con esa palabra clave.");
                    } else {
                        System.out.println("Resultados de la búsqueda:");
                        for (Libro libro : resultadosBusqueda) {
                            System.out.println(libro.mostrarInformacion());
                        }
                    }
                    break;
                
                case 4:                    
                     System.out.println("Ingrese el título del libro que desea marcar como leído:");
                    String tituloParaMarcar = sc.nextLine();
                    boolean marcado = miBiblioteca.marcarLibroComoLeido(tituloParaMarcar);
                    if (marcado) {
                        System.out.println("Libro marcado como leído.");
                    } else {
                        System.out.println("No se encontró el libro con ese título.");
                    }
                    break;
                
                case 5:
                    miBiblioteca.mostrarLibrosNoLeidos();
                    break;
                
                case 6:
                    continuar = false;
                    break;
                
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        }
    }
}
