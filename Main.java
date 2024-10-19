package com.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

    
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605, "978-3-16-148410-0", 700);
        Revista revista1 = new Revista("National Geographic", "Varios", 2021, 12, "Diciembre");
        Audiovisual audiovisual1 = new Audiovisual("Inception", "Christopher Nolan", 2010, "Blu-ray", 148);

    
        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(revista1);
        biblioteca.agregarMaterial(audiovisual1);

    
        System.out.println("Catálogo de la Biblioteca:");
        biblioteca.mostrarCatalogo();

    
        Material materialBuscado = biblioteca.buscarMaterial("El Quijote");
        if (materialBuscado != null) {
            materialBuscado.prestar();
        }

    
        materialBuscado.devolver();
    }
}