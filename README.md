# UD01_Actividad06_AdivinaNumero

Juego de consola desarrollado en **Kotlin** en el que el programa genera un número aleatorio entre 1 y 100 y el usuario debe adivinarlo introduciendo intentos por teclado.

> **Módulo:** PMDM (Programación Multimedia y Dispositivos Móviles)
> **Actividad:** 06 – Juego: Adivina el número en Kotlin
> **Autor/a:** _Raúl Talbi Daza_
> **Motivo:** Actividad académica

---

## Descripción

El programa elige un número secreto al azar y va pidiendo números al usuario. Tras cada intento indica si el número secreto es mayor o menor que el introducido. El juego no termina hasta que el usuario acierta, y al final muestra cuántos intentos ha necesitado.

Con esta práctica se trabajan:

- Generación de números aleatorios.
- Entrada de datos por teclado.
- Estructuras condicionales (`if` / `when`).
- Bucles (`while`).
- Contadores.
- Validaciones básicas y control de errores.

## Requisitos

| Herramienta | Versión recomendada |
|---|---|
| IntelliJ IDEA | Community o Ultimate |
| JDK | 17 o superior |
| Kotlin | 1.9 o superior |
| Gradle | Incluido con el proyecto (wrapper) |

## Estructura del proyecto

```
UD01_Actividad06_AdivinaNumero/
├── src/
│   └── main/
│       └── kotlin/
│           └── Main.kt
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

> Ajusta este árbol si tu proyecto tiene archivos o nombres distintos.

## Cómo ejecutarlo

### Desde IntelliJ IDEA

1. Clona el repositorio:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   ```
2. Abre la carpeta del proyecto en IntelliJ IDEA (`File > Open`).
3. Espera a que Gradle sincronice las dependencias.
4. Abre `Main.kt` y pulsa el botón ▶ junto a la función `main`.

### Desde la terminal

```bash
./gradlew run
```

En Windows:

```bash
gradlew.bat run
```

## Reglas del juego

1. El programa genera un número secreto entre **1 y 100** (no se muestra durante la partida).
2. El usuario introduce un número.
3. El programa responde:
   - `El número secreto es mayor.`
   - `El número secreto es menor.`
   - `¡Correcto! Has adivinado el número.`
4. Se repite hasta que el usuario acierta.
5. Al acertar, se muestra el total de intentos.

## Validaciones implementadas

- El número debe estar entre 1 y 100.
- No se aceptan valores negativos.
- No se aceptan valores superiores a 100.
- No se aceptan entradas que no sean números (letras, texto vacío, etc.).
- Los intentos no válidos **no** se cuentan como intentos.
- El programa no finaliza hasta que se acierta el número.

Ejemplo de mensaje de error:

```
Error: el número debe estar entre 1 y 100.
```

## Ejemplo de ejecución

```
Introduce un número entre 1 y 100: 50
El número secreto es mayor.
Introduce un número entre 1 y 100: 150
Error: el número debe estar entre 1 y 100.
Introduce un número entre 1 y 100: 75
El número secreto es menor.
Introduce un número entre 1 y 100: 62
¡Correcto! Has adivinado el número.
Has adivinado el número en 3 intentos.
```
