# 💻 Ejercicio – Getronics Argentina (Somos PNT)

Este repositorio contiene la solución al ejercicio propuesto por **Getronics Argentina** en el marco de la convocatoria para sumarse al equipo de desarrollo "Somos PNT".

## 🧠 Consigna

Crear un programa en Java que imprima por consola información de distintos productos simulando un supermercado de barrio. La impresión no debe depender de la cantidad ni tipo de productos.

Además, se requiere:

- Programación orientada a objetos.
- Uso de `Comparable` para identificar el producto más caro y el más barato.
- Sobrescritura del método `toString()` para mostrar la información por consola.
- Sin ingreso por pantalla, los productos deben cargarse en un único método.
- Solo se deben usar clases provistas por Java 8.

## 🛠️ Tecnologías usadas

- Java 8
- Programación Orientada a Objetos (POO)
- IDE: NetBeans

## 🗃️ Estructura del proyecto

- `Producto`: clase base abstracta con atributos comunes (`nombre`, `precio`) e implementación de `Comparable`.
- `Bebida`, `Higiene`, `Fruta`: subclases que extienden a `Producto` con atributos específicos y su propio `toString()`.
- `EjercicioSomosPNT`: clase principal con el método `main`, donde se cargan los productos, se imprime la lista y se detectan el más caro y el más barato.

## ▶️ Cómo ejecutar

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/TecnoZoni/Ejercicio-SomosPNT.git
   ```
2. Importar el proyecto en tu IDE favorito.
3. Ejecutar la clase `EjercicioSomosPNT` que contiene el `main`.

## 📌 Salida esperada por consola

```
Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18
Nombre: Shampoo Sedal /// Contenido: 500 /// Precio: $19
Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
=============================
Producto más caro: Frutillas
Producto más barato: Coca-Cola
```

## 🙋 Sobre mí

Mi nombre es **Agustín Minzoni**, soy Técnico Superior en Desarrollo de Software, con experiencia en Java SE, Swing y Spring Boot.  
Estoy entusiasmado por formar parte de equipos donde se compartan buenas prácticas, aprendizaje continuo y trabajo colaborativo 💪

🌐 [agustinminzoni.com](https://agustinminzoni.com)  
🐙 [github.com/TecnoZoni](https://github.com/TecnoZoni)
