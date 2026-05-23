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

// Iniciamos la aplicacion desde el metodo main, punto de entrada del programa
public class App {

    public static void main(String[] args) {

        // Creamos el refugio que controlara toda la logica del sistema
        Refugio refugio = new Refugio();

        // ---- REGISTRAMOS ANIMALES ----

        // Registramos animales validos de distintos tipos
        refugio.registrarAnimal(new Perro(1, "Firulais", 3, "ACTIVO"));
        refugio.registrarAnimal(new Gato(2, "Michi", 5, "ACTIVO"));
        refugio.registrarAnimal(new Perro(3, "Osito", 7, "ACTIVO"));
        refugio.registrarAnimal(new Gato(4, "Luna", 2, "ACTIVO"));

        // Registramos con ID igual a 0 (debe mostrar error)
        refugio.registrarAnimal(new Perro(0, "Rex", 2, "ACTIVO"));

        // Registramos con edad negativa (debe mostrar error)
        refugio.registrarAnimal(new Gato(5, "Sombra", -1, "ACTIVO"));

        // ---- MOSTRAMOS TODOS LOS ANIMALES ----
        refugio.mostrarAnimales();

        // ---- BUSCAMOS UN ANIMAL POR ID ----
        refugio.buscarPorId(2);

        // ---- BUSCAMOS UN ID QUE NO EXISTE ----
        refugio.buscarPorId(99);

        // ---- CAMBIAMOS EL ESTADO DE UN ANIMAL ----
        refugio.cambiarEstado(1, "ADOPTADO");

        // ---- EJECUTAMOS EL SONIDO DE UN ANIMAL ----
        refugio.ejecutarSonido(3);

        // ---- MOSTRAMOS LA LISTA FINAL CON EL ESTADO ACTUALIZADO ----
        refugio.mostrarAnimales();
    }
}
