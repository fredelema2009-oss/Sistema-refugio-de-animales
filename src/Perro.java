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

// Heredamos de Animal para representar especificamente a un Perro
public class Perro extends Animal {

    // Construimos el objeto Perro pasando los datos al constructor padre
    public Perro(int id, String nombre, int edad, String estado) {
        super(id, nombre, edad, estado);
    }

    // Sobreescribimos el sonido especifico que hace un perro
    @Override
    public String hacerSonido() {
        return "Guau guau!";
    }
}
