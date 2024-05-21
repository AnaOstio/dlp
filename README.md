# DISEÑO Y LENGUAJES DE PROGRAMACIÓN

Simula lo que es el código en Go

## COSAS IMPORTANTES A REALIZAR EN EL EXAMEN

- CADA VEZ QUE SE CAMBIE EL .G4 ACORDARSE DE REGENERAR
- SI SE AÑADE UN TIPO NUEVO Y TIENE LITERAL METERLO EN EL TYPECHEKING PARA ASIGNARLE EL TIPO CORRESPONIENTE


## Lab 01
Programa tiene una lista de definiciones para los métodos y las variables

Además, vamos a añadir una lista de sentencias que para este caso, se va a hacer uso para el tema del `main`. 

- En los métodos va primero una lista de variables y luego métodos
- El if-else y while si el del tipo `while(a) { print b; }` no necesita los `{}`

## Lab 03
El `lexer` analiza diferentes entradas de forma que nos devuelven Tokens que nos dicen el tipo y el valor de cada uno 
de estos.

En el caso de los comentarios los va a analizar, pero los va a eliminar a la hora de retornar los valores, pero si 
que tenemos que tener una expresión que nos detecte esta información.

Cada vez que cambiemos el `Lexer` lo que tenemos que hacer es `Control + Shift + G`

## Lab 04
- Solucionar error de que me está recociendo el elemento `.`, `.e`   -> Solucionado

## Lab 05
- Meter el `main` como un requisito del sintáctico
- Repasar que tengo tipos simples en la definición de parámetros, asi como el tipo del return 

Que hacer cuando tenemos algo que es opcional
  -> Opcion mala: tener dos definiciones, uno que tenga todos los parametros necesarios y luego otro en el que no lo tenga
  -> Habria que hacer acciones intermedias, por ejemplo con el tema de los tipos `(tipo_simple { $ast = ..... })?`

## Dudas: 
- ¿Se puede tener algo como `a = 5 + ( 3 < 2 )`?

## Exámenes de Otros Años
- Añadir el tipo `boolean` (mayo 2022) 
- Destructor (wtf, ni puta idea de que es) (junio 2022)
- Conversion implícita de tipos (mayo 2023)
- Asignación multiple: (junio 2023)
  ```
  char char1;
  int int1;
   
  char1, int1 = 'a', 1;
  ```
  
## TODO
- Tengo que mirar el cast ya que no se le estan asignando de manera correcta la linea y la columna

## CODE GENERATOR
- Char mide 1
- Integer 2
- Float 4
- BP (Base Pointer): nos sirve para estar en medio de las variables globales y parametros de la funcion que estamos
ejecutando ahora mismo. 