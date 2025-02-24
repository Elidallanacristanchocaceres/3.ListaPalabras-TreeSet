# Lista de Palabras en Java TreeSet

Este proyecto permite ingresar palabras en una lista ordenada alfabéticamente y buscar si una palabra está presente en la lista.

### 🚀 Funcionalidades

- Permite ingresar palabras y almacenarlas en un TreeSet.

- Orden automático de palabras alfabéticamente.

- Evita palabras duplicadas y muestra un mensaje si se intenta ingresar una repetida.

- Permite buscar una palabra en la lista y confirma si está registrada.

### 🛠 Tecnologías utilizadas

- Java

- Colecciones (Set, TreeSet)

- Entrada de datos con Scanner

### 📌 Uso

- Ejecuta el programa en un entorno compatible con Java.

- Ingresa palabras (escribiendo fin para finalizar la entrada).

- Se mostrarán las palabras en orden alfabético.

- Ingresa una palabra para buscar si está en la lista.

### 📂 Estructura del Código
````bash
Set<String> palabras = new TreeSet<>();
````
Se utiliza TreeSet para almacenar palabras en orden alfabético sin permitir duplicados.
````bash
if (!palabras.add(palabra)) {
    System.out.println("⚠ La palabra '" + palabra + "' ya está en la lista.");
}
````
Verifica si una palabra ya ha sido ingresada.
````bash
if (palabras.contains(palabraBuscar)) {
    System.out.println("✅ La palabra '" + palabraBuscar + "' está en la lista.");
} else {
    System.out.println("❌ La palabra '" + palabraBuscar + "' no está registrada.");
}
````
Busca una palabra dentro del TreeSet.

### 📝 Notas

- Se deben ingresar palabras sin espacios.

- Para finalizar la entrada, se debe escribir fin.
