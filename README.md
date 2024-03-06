# Proyecto de Diseño de Compiladores

Este repositorio contiene el código fuente de un proyecto desarrollado para la asignatura de Diseño de Compiladores. El objetivo principal del proyecto es implementar un compilador utilizando el lenguaje Java y la herramienta Yacc, que traduce código de un lenguaje definido por su gramática a código en lenguaje ensamblador utilizando la técnica del triplete.

## Descripción del Proyecto

El compilador implementado en este proyecto toma como entrada un programa escrito en un lenguaje definido por una gramática específica y produce como salida el equivalente en lenguaje ensamblador. Para lograr esto, se sigue el enfoque del triplete, que consiste en dividir el proceso de compilación en tres fases principales: análisis léxico, análisis sintáctico y generación de código.

El análisis léxico se encarga de dividir el código fuente en tokens, el análisis sintáctico verifica que la estructura del programa cumpla con la gramática definida y la generación de código produce el código en lenguaje ensamblador a partir de la estructura sintáctica del programa de entrada.

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
