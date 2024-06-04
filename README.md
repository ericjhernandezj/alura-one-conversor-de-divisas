# Conversor de Divisas

Programa hecho con el fin de reforzar lo aprendido en cursos de [Oracle Next Education](https://www.oracle.com/mx/education/oracle-next-education/) y [Alura Latam](https://www.aluracursos.com/) sobre manejo de datos con Java y consumo de APIs.

## Tech Stack

- Java 17 SE
- Gson 2.11.0
- IntelliJ IDEA
- Data and API from [ExchangeRate-API](https://www.exchangerate-api.com/)

## Cómo Usarlo

:exclamation: Importante
Antes de intentar ejecutar el programa, asegurese de tener instalado Java 17 o superior en su dispositivo.

Antes de compilar el código, ir a src/CurrencyConverter.java y agregar tu propia API Key.

También se debe descargar la librería [Gson desde MVN Repository](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0) como jar ([Descarga directa aquí](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.11.0/gson-2.11.0.jar)).

(Agrega la librería a tu proyecto)

Resalto que este proyecto fue desarrollado en Linux + IntelliJ IDEA Ultimate y no se probó en otros sistemas operativos ni IDEs/editores.

1. Clonar el repositorio
    ```
   ~$ git clone https://github.com/ericjhernandezj/alura-one-conversor-de-divisas.git
    ```
   
2. Acceder al código del proyecto clonado local
    ```
   ~$ cd alura-one-conversor-de-divisas/src/
    ```
   
3. Compilando el código
   ```
   javac -cp '.:/ruta/al/gson-2.11.0.jar' *.java
   ```

4. Corriendo el programa
   ```
   java -cp '.:/ruta/al/gson-2.11.0.jar' Main
   ```
   
## Cómo Contribuir

Si no quieres desarrollar y probar tú mismo el programa, abre un Issue

Si quieres desarrollar y probar tú mismo el programa, haz un fork del repositorio, haz los cambios, abre un Pull Request