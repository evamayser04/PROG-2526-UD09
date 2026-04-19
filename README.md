# 👨‍💻 Unidad 9 - Excepciones y Ficheros de Texto en Java

## 📌 Descripción

Este repositorio está dedicado al estudio del tratamiento de excepciones y la gestión de ficheros de texto en Java.

Estos conceptos son fundamentales en programación, ya que permiten controlar errores durante la ejecución de los programas y trabajar con almacenamiento de información en archivos, haciendo las aplicaciones más robustas y útiles.

---

## 📚 ¿Qué son las excepciones?

Una excepción es un evento que ocurre durante la ejecución de un programa y que interrumpe su flujo normal.

En Java, las excepciones se representan como objetos que contienen información sobre el error producido.

Gracias a ellas, es posible:

* Detectar errores
* Evitar que el programa se cierre inesperadamente
* Gestionar situaciones imprevistas

---

## 🎯 Objetivos del tema

* Comprender el funcionamiento de las excepciones en Java
* Aprender a controlar errores con `try`, `catch`, `finally` y `throws`
* Diferenciar tipos de excepciones
* Crear excepciones personalizadas
* Trabajar con ficheros de texto
* Leer y escribir archivos correctamente
* Gestionar recursos de forma segura

---

## ⚠️ Tipos de excepciones

En Java existen principalmente dos tipos:

### ✔️ Excepciones comprobadas (checked)

Son aquellas que el compilador obliga a controlar.

Ejemplos:

* `IOException`
* `FileNotFoundException`

### ❌ Excepciones no comprobadas (unchecked)

No es obligatorio controlarlas, pero suelen indicar errores en el código.

Ejemplos:

* `ArithmeticException`
* `NumberFormatException`

---

## 🧩 Estructura try-catch-finally

El control de excepciones se realiza mediante:

* `try` → bloque donde puede producirse el error
* `catch` → captura y gestiona la excepción
* `finally` → se ejecuta siempre (haya error o no)

Esto permite mantener el control del programa incluso cuando ocurre un fallo.

---

## 🔁 Uso de throws

La palabra clave `throws` se utiliza para indicar que un método puede lanzar una excepción.

En lugar de gestionarla directamente, se delega su control al método que lo llama.

Esto facilita la organización del código y su reutilización.

---

## 🧱 Excepciones personalizadas

Java permite crear excepciones propias heredando de la clase `Exception`.

Esto es útil cuando queremos controlar errores específicos de nuestro programa, adaptando los mensajes y comportamientos a nuestras necesidades.

---

## 📄 Ficheros de texto

El trabajo con archivos permite guardar y recuperar información desde el sistema.

En Java se utilizan diferentes clases para ello:

### 📥 Lectura

* `FileReader`
* `BufferedReader`

Permiten leer archivos carácter a carácter o línea a línea.

### 📤 Escritura

* `FileWriter`
* `BufferedWriter`

Permiten escribir información en archivos de texto.

---

## 🔄 Gestión de recursos

Es importante cerrar correctamente los archivos para evitar errores.

Para ello se puede usar:

* Bloque `finally`
* Estructura `try-with-resources` (más moderna y segura)

Esto garantiza que los recursos se liberen correctamente.

---

## ⚙️ Tecnologías utilizadas

* Java ☕
* Programación Orientada a Objetos (POO)

---

## 📚 Autora

Eva Katherine Mayser Vanea DAM / SMR 💻
Curso 2025/2026

<p align="center">
  <img src="https://media.giphy.com/media/v1.Y2lkPWVjZjA1ZTQ3a3dqMW5sdzB3MGkxNDVkcHo1a3kzMzN3NzhxNWlqZXJpbHJncmgxbiZlcD12MV9naWZzX3NlYXJjaCZjdD1n/6arSJwtKZBtWCRzg6d/giphy.gif" width="500" height="300"/>
</p>
