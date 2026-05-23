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

// Definimos la clase base que representa a cualquier animal del refugio
public class Animal {

    // Declaramos los atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private int edad;
    private String estado;

    // Construimos el objeto Animal con sus datos iniciales
    public Animal(int id, String nombre, int edad, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }

    // Retornamos el id del animal
    public int getId() {
        return id;
    }

    // Retornamos el nombre del animal
    public String getNombre() {
        return nombre;
    }

    // Retornamos la edad del animal
    public int getEdad() {
        return edad;
    }

    // Retornamos el estado del animal
    public String getEstado() {
        return estado;
    }

    // Asignamos un nuevo estado al animal
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Mostramos la informacion general del animal en consola
    public void mostrarInfo() {
        System.out.println("ID     : " + id);
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad   : " + edad + " anio(s)");
        System.out.println("Tipo   : " + this.getClass().getSimpleName());
        System.out.println("Estado : " + estado);
    }

    // Retornamos un sonido generico, las subclases lo sobreescriben
    public String hacerSonido() {
        return "...";
    }
}