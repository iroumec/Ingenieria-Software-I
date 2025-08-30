# Consideration

## PlantUML Guide

### INSTALLATION (DEBIAN)

`sudo apt install plantuml`

### RECOMMENDED

<https://plantuml.com/es-dark/class-diagram>

### YOU CAN ALSO SEE

<https://www.youtube.com/watch?v=6ywDfXpoTe4>
<https://docs.gitlab.com/administration/integration/plantuml/>

### THEMES

<https://plantuml.com/ru/theme-gallery#84b4d71ab1b6bfbc>

## Theory

Hay patrones que son exactamente lo mismo. Solo cambia el contexto o ámbito de aplicación.

---

Sistema voy a tener uno solo, así que es lógico que sea Singleton.

El Composite está orientado a la colección.

El Decorator está más orientado a la extensión de funcionalidades. Tengo un objeto simple el cual quiero extender.

El Composite busca agrupar.

En un ejemplo de directorios y hojas, la hoja es el eje de extensión. El directorio, semánticamente, no extiende la funcionalidad de los archivos.

En los diagramas UML, el Decorator se señala con una agregación y no, con una composición. La muerte del padre no implica la muerte del hijo.

Las partes individuales son CriterioNot, CriterioDirector... CriterioCombinado permite que las partes individuales extiendan su funcionalidad combinándose con otras. Si yo mato al AND, no mato a las partes.

---

### Singleton con getInstance() ⇒ ¿también Factory Method?

Singleton --> asegura que exista una única instancia.

Factory Method --> encapsula la creación del objeto en un método, en lugar de usar new.

Cuando se usa `getInstance()`, técnicamente se está usando un _factory method_ para controlar la creación (en este caso, para devolver siempre la misma instancia).

Entonces: **todo Singleton con getInstance() también usa Factory Method, pero no todo Factory Method es Singleton**.

Si una clase no guarda estado, puede ser `Singleton`.

---

### No toda clase abstracta o interfaz implica `Template Method`

El `Template Method` ocurre específicamente cuando un método en la clase abstracta define un algoritmo completo, pero delega al menos un paso abstracto a las subclases para que lo implementen. **La clave es que el método concreto de la clase abstracta llama internamente a métodos abstractos; ahí es donde está el _template_**.

Si la clase abstracta solo declara métodos sin implementar ninguno, eso no es `Template Method`, es simplemente una abstracción normal.
