/* SISTEMA SIMPLE REFUGIO DE ANIMALES
Mini-proyecto de JavaPOO — Bootcamp "Programación de Cero a POO"
  
Autor: Frederick Lema
Fecha: 23 de mayo del 2026

Enunciado: Desarrollar un programa en Java consola que permita gestionar un pequeño refugio
de animales.
El sistema debe trabajar con una colección de animales registrados. No todos los
animales son iguales. Como mínimo, deberán existir dos tipos específicos de
animales que hereden de una clase base general.
El programa deberá permitir registrar animales, mostrar la información almacenada,
ejecutar una acción propia de cada tipo de animal y realizar una operación adicional
sencilla sobre un animal específico.

El objetivo no es hacer un sistema profesional ni extenso, sino un programa
ordenado, funcional y coherente, donde se note claramente la aplicación de los
temas vistos en clase.
*/

import java.util.ArrayList;

// Gestionamos toda la logica del refugio: registro, busqueda y operaciones
public class Refugio {

    // Inicializamos la lista que almacenara todos los animales registrados
    ArrayList<Animal> animales = new ArrayList<>();

    // Registramos un animal nuevo y lo agregamos a la lista
    public void registrarAnimal(Animal animal) {

        // Validamos que el ID sea mayor a 0
        if (animal.getId() <= 0) {
            System.out.println("Error: el ID debe ser mayor a 0. Registro cancelado.");
            return;
        }

        // Validamos que la edad no sea negativa
        if (animal.getEdad() < 0) {
            System.out.println("Error: la edad no puede ser negativa. Registro cancelado.");
            return;
        }

        // Agregamos el animal a la lista si paso las validaciones
        animales.add(animal);
        System.out.println("Animal registrado: " + animal.getNombre());
    }

    // Mostramos todos los animales registrados recorriendo la lista
    public void mostrarAnimales() {
        System.out.println("\n--- LISTA DE ANIMALES ---");

        // Verificamos si la lista no tiene ningun animal registrado
        if (animales.size() == 0) {
            System.out.println("No hay animales registrados.");
            return;
        }

        // Recorremos la lista y mostramos la informacion de cada animal
        // Aplicamos polimorfismo: cada objeto ejecuta su propio hacerSonido()
        for (Animal a : animales) {
            a.mostrarInfo();
            System.out.println("Sonido : " + a.hacerSonido());
            System.out.println("----------------------");
        }
    }
     // Buscamos un animal por su ID y mostramos su informacion
    public void buscarPorId(int idBuscado) {
        System.out.println("\n--- BUSCAR ANIMAL POR ID: " + idBuscado + " ---");

        // Recorremos la lista buscando el animal con ese ID
        boolean encontrado = false;

        for (Animal a : animales) {
            if (a.getId() == idBuscado) {
                // Mostramos la informacion del animal encontrado
                a.mostrarInfo();
                System.out.println("Sonido : " + a.hacerSonido());
                encontrado = true;
            }
        }

        // Informamos si no se encontro ningun animal con ese ID
        if (encontrado == false) {
            System.out.println("Animal no encontrado.");
        }
    }

    // Cambiamos el estado de un animal buscandolo por ID
    public void cambiarEstado(int idBuscado, String nuevoEstado) {
        System.out.println("\n--- CAMBIAR ESTADO ---");

        // Recorremos la lista buscando el animal con ese ID
        boolean encontrado = false;

        for (Animal a : animales) {
            if (a.getId() == idBuscado) {
                // Asignamos el nuevo estado al animal encontrado
                a.setEstado(nuevoEstado);
                System.out.println("Estado de " + a.getNombre() + " actualizado a: " + nuevoEstado);
                encontrado = true;
            }
        }

        // Informamos si no se encontro ningun animal con ese ID
        if (encontrado == false) {
            System.out.println("Animal no encontrado.");
        }
    }

    // Ejecutamos el sonido de un animal buscandolo por ID
    public void ejecutarSonido(int idBuscado) {
        System.out.println("\n--- EJECUTAR SONIDO ---");

        // Recorremos la lista buscando el animal con ese ID
        boolean encontrado = false;

        for (Animal a : animales) {
            if (a.getId() == idBuscado) {
                // Ejecutamos el sonido del objeto encontrado (polimorfismo)
                System.out.println(a.getNombre() + " dice: " + a.hacerSonido());
                encontrado = true;
            }
        }

        // Informamos si no se encontro ningun animal con ese ID
        if (encontrado == false) {
            System.out.println("Animal no encontrado.");
        }
    }
}