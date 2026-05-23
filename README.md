# Sistema de Refugio de Animales

## Autor
Frederick Lema

## Descripción del sistema
Sistema en consola desarrollado en Java que permite gestionar un pequeño refugio de animales.
El programa permite registrar perros y gatos, ver la lista completa de animales registrados,
buscar un animal por su ID, cambiar su estado (ACTIVO o ADOPTADO) y escuchar el sonido
que hace cada animal según su tipo.

---

## Estructura de clases

### Animal.java — Clase base (clase padre)
Es la clase principal de la que heredan Perro y Gato. Representa a cualquier animal del refugio.

**Atributos que guarda:**
| Atributo | Tipo | Para qué sirve |
|---|---|---|
| id | int | Identificador único de cada animal |
| nombre | String | Nombre del animal |
| edad | int | Edad en años del animal |
| estado | String | Puede ser "ACTIVO" o "ADOPTADO" |

**Métodos que tiene:**
```java
// Constructor: crea el objeto con todos sus datos iniciales
public Animal(int id, String nombre, int edad, String estado)

// Getters: permiten leer los atributos privados desde fuera de la clase
public int getId()
public String getNombre()
public int getEdad()
public String getEstado()

// Setter: permite cambiar el estado del animal
public void setEstado(String estado)

// Muestra en consola todos los datos del animal
public void mostrarInfo()

// Retorna el sonido del animal (las subclases lo sobreescriben)
public String hacerSonido()
```

---

### Perro.java — Subclase que hereda de Animal
Representa específicamente a un perro dentro del refugio.
Usa `extends Animal` para heredar todos los atributos y métodos de la clase padre.

```java
public class Perro extends Animal {

    // Llama al constructor del padre con super(...)
    public Perro(int id, String nombre, int edad, String estado) {
        super(id, nombre, edad, estado);
    }

    // Sobreescribe hacerSonido() con el sonido propio del perro
    @Override
    public String hacerSonido() {
        return "Guau guau!";
    }
}
```

---

### Gato.java — Subclase que hereda de Animal
Representa específicamente a un gato dentro del refugio.
Funciona igual que Perro pero con su propio sonido.

```java
public class Gato extends Animal {

    // Llama al constructor del padre con super(...)
    public Gato(int id, String nombre, int edad, String estado) {
        super(id, nombre, edad, estado);
    }

    // Sobreescribe hacerSonido() con el sonido propio del gato
    @Override
    public String hacerSonido() {
        return "Miau!";
    }
}
```

---

### Refugio.java — Clase gestora del sistema
Es la clase que contiene toda la lógica del programa.
Usa un `ArrayList<Animal>` para guardar todos los animales registrados.
Aquí se aplica el polimorfismo: los objetos Perro y Gato se guardan como tipo Animal,
pero cada uno responde con su propio sonido al llamar a `hacerSonido()`.

```java
// Lista que almacena todos los animales (guarda Perro y Gato como tipo Animal)
ArrayList<Animal> animales = new ArrayList<>();
```

**Métodos que tiene:**
```java
// Recibe un objeto Animal, lo valida y lo agrega a la lista
public void registrarAnimal(Animal animal)

// Recorre la lista y muestra la informacion de todos los animales
public void mostrarAnimales()

// Busca un animal por ID y muestra su informacion si existe
public void buscarPorId(int idBuscado)

// Busca un animal por ID y cambia su estado a ACTIVO o ADOPTADO
public void cambiarEstado(int idBuscado, String nuevoEstado)

// Busca un animal por ID y ejecuta su hacerSonido() (polimorfismo)
public void ejecutarSonido(int idBuscado)
```

**Validaciones que aplica:**
- El ID debe ser mayor a 0
- La edad no puede ser negativa
- Si se busca un ID que no existe, muestra "Animal no encontrado"

---

### Main.java — Punto de entrada del programa
Es la clase principal donde arranca el programa.
Aquí se crean los objetos y se llaman los métodos del Refugio para probar el sistema.

```java
// Creamos el refugio
Refugio refugio = new Refugio();

// Registramos animales pasando objetos directamente
refugio.registrarAnimal(new Perro(1, "Firulais", 3, "ACTIVO"));
refugio.registrarAnimal(new Gato(2, "Michi", 5, "ACTIVO"));

// Mostramos, buscamos, cambiamos estado y ejecutamos sonidos
refugio.mostrarAnimales();
refugio.buscarPorId(2);
refugio.cambiarEstado(1, "ADOPTADO");
refugio.ejecutarSonido(3);
```

---

## Conceptos de POO aplicados

| Concepto | Dónde se aplica |
|---|---|
| Encapsulamiento | Atributos `private` en `Animal`, accedidos con getters y setter |
| Herencia | `Perro` y `Gato` usan `extends Animal` y `super(...)` |
| Polimorfismo | `ArrayList<Animal>` guarda Perros y Gatos; cada uno responde con su propio `hacerSonido()` |
| Colecciones | `ArrayList<Animal>` en la clase `Refugio` |
| Validaciones | El método `registrarAnimal()` valida ID y edad antes de registrar |

---

## Instrucciones de compilación y ejecución

### Compilar
Desde la carpeta `src/`, ejecutar en la terminal:
```
javac Animal.java Perro.java Gato.java Refugio.java Main.java
```

### Ejecutar
```
java Main
```

### Con IntelliJ IDEA o Eclipse
Abrir la carpeta del proyecto y ejecutar directamente el archivo `Main.java`.
