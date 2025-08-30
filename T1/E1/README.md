# Consideracion

En términos de Strategy, lo que realmente define el comportamiento variable es getResultado(), porque es el método que realiza la operación concreta sobre los operandos.

Los otros métodos como getSimbolo() o getOpuesto() son auxiliares: describen el operador, devuelven información sobre él, pero no cambian el comportamiento de la operación en sí. Incluso si se cambia el símbolo o el opuesto, el “algoritmo” que aplica la operación sigue siendo definido por getResultado().

En pocas palabras: el Strategy se concreta en el método que encapsula la lógica variable, que en nuestro caso es getResultado(). Todo lo demás es accesorio o de información.

A pesar de que en Multiplicación "getOpuesto()" devuelve una división y en suma, una resta, se considera que sigue sin cambiar el **algoritmo principal** del Strategy.

La idea central de Strategy es encapsular un **comportamiento variable** que define cómo se procesa algo. En nuestro caso, el comportamiento principal es “cómo combinar dos términos para obtener un resultado”, y eso está definido por `getResultado()`.

`getOpuesto()` no altera el algoritmo de combinación de los operandos; simplemente devuelve un operador alternativo que se puede usar en otro contexto. Es información adicional, no el comportamiento del cálculo en sí.

En otras palabras, `getOpuesto()` influye en qué operador podrías usar, pero no **modifica cómo se ejecuta la operación que define el Strategy actual**.

## Respuesta de ArchMind

Sí, el texto es correcto para el diagrama. El patrón de diseño Strategy se aplica correctamente en la clase Operador, donde el método getResultado() encapsula la lógica variable para combinar dos términos y obtener un resultado. Los métodos getSimbolo() y getOpuesto() son auxiliares y no cambian el comportamiento principal de la operación. El patrón Singleton y Factory Method también se aplican correctamente en las clases concretas de operadores.
