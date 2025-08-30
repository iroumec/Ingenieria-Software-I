# Consideration

## PlantUML Guide

### INSTALLATION (DEBIAN)

`sudo apt install plantuml`

### RECOMMENDED

https://plantuml.com/es-dark/class-diagram

### YOU CAN ALSO SEE

https://www.youtube.com/watch?v=6ywDfXpoTe4
https://docs.gitlab.com/administration/integration/plantuml/

### THEMES

https://plantuml.com/ru/theme-gallery#84b4d71ab1b6bfbc

## Theory

Hay patrones que son exactamente lo mismo. Solo cambia el contexto o ámbito de aplicación.

---

### Singleton con getInstance() ⇒ ¿también Factory Method?

Singleton --> asegura que exista una única instancia.

Factory Method --> encapsula la creación del objeto en un método, en lugar de usar new.

Cuando se usa `getInstance()`, técnicamente se está usando un _factory method_ para controlar la creación (en este caso, para devolver siempre la misma instancia).

Entonces: **todo Singleton con getInstance() también usa Factory Method, pero no todo Factory Method es Singleton**.

Si una clase no guarda estado, puede ser `Singleton`.
