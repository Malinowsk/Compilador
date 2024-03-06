# Proyecto de Diseño de Compiladores

Este repositorio contiene el código fuente de un proyecto desarrollado para la asignatura de Diseño de Compiladores. El objetivo principal del proyecto es implementar un compilador utilizando el lenguaje Java y la herramienta Yacc, que traduce código de un lenguaje definido por su gramática a código en lenguaje ensamblador utilizando la técnica tercetos.

## Descripción del Proyecto

El compilador implementado en este proyecto toma como entrada un programa escrito en un lenguaje definido por una gramática específica y produce como salida el equivalente en lenguaje ensamblador. Para lograr esto, se sigue el enfoque de los tercetos.

## Técnica de los Tercetos

La técnica de los tercetos es una estrategia utilizada en el diseño de compiladores para representar las operaciones en un programa de manera más abstracta. Consiste en organizar las operaciones en estructuras de datos llamadas "tercetos", que contienen información sobre las operaciones a realizar y los operandos involucrados.

Cada terceto consta de tres partes: un operador y dos operandos. Estos tercetos se generan durante la fase de análisis semántico del compilador y se utilizan en la fase de generación de código para representar las operaciones de manera más simple antes de ser traducidas al lenguaje ensamblador final.

En el contexto de este proyecto, la técnica de los tercetos se emplea para representar las operaciones del programa antes de ser traducidas al código en lenguaje ensamblador. Esto permite una separación clara entre el análisis del programa y la generación de código, facilitando el proceso de compilación y optimización.


## Fases Principales del Compilador

1. **Análisis Léxico:** Esta fase se encarga de dividir el código fuente en tokens, los elementos más básicos del lenguaje.

2. **Análisis Sintáctico:** Verifica que la estructura del programa cumpla con la gramática definida para el lenguaje. Se asegura de que la secuencia de tokens tenga sentido y esté correctamente estructurada.

3. **Generación de Código:** Produce el código en lenguaje ensamblador a partir de la estructura sintáctica del programa de entrada. Se utiliza la técnica de los tercetos para representar las operaciones antes de traducirlas al lenguaje ensamblador final.

## Estructura del Repositorio

El repositorio está organizado de la siguiente manera:

- `/src`: Contiene el código fuente del compilador implementado en Java.
- `/cosas`: Documentación relacionada con el proyecto, como diagramas, informes, y manuales de usuario.
- `/casosdeprueba`: Ejemplos de programas de entrada en el lenguaje soportado por el compilador.
- `README.md`: Este archivo que proporciona una descripción general del proyecto.

## Requisitos y Dependencias

Para ejecutar el compilador, se requiere tener instalado Java en el sistema. Además, se deben seguir las instrucciones específicas de configuración proporcionadas en la documentación del proyecto.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir al proyecto, por favor sigue estos pasos:

1. Realiza un fork del repositorio.
2. Crea una rama nueva para tu funcionalidad (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commits explicativos (`git commit -am 'Agrega nueva funcionalidad: descripción corta'`).
4. Sube tus cambios a tu fork (`git push origin feature/nueva-funcionalidad`).
5. Crea un pull request para que tus cambios sean revisados.


## Demostración

¡Mira una demostración del software en acción!

[![Demostración del Software](https://img.youtube.com/vi/fgFy4ipxoTg/maxresdefault.jpg)](https://youtu.be/fgFy4ipxoTg)
