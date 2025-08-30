La segunda versión es recomendable, ya que me ahorro el overhead de tener un objeto "Operador" dentro "CriterioCombinado".

Además, el Singleton tiene problemas con multihilos. No me conviene hacer operadores Singleton.

Si quiero más tarde agregar un OperadorXor, extiendo de "CriterioCombinado".

Sistema voy a tener uno solo, así que es lógico que sea Singleton.

Con tener un CriterioDuracionMayor es suficiente y no se requiere de Comparador.

El Composite está orientado a la colección.

El Decorator está más orientado a la extensión de funcionalidades.
Tengo un objeto simple el cual quiero extender.

El Composite busca agrupar.

En un ejemplo de directorios y hojas, la hoja es el eje de extensión.
El directorio, semánticamente, no extiende la funcionalidad de los archivos.

En los diagramas UML, el Decorator se señala con una agregación y no, con una composición.
La muerte del padre no implica la muerte del hijo.

Las partes individuales son CriterioNot, CriterioDirector...
CriterioCombinado permite que las partes individuales extiendan su funcionalidad combinándose con otras.
Si yo mato al AND, no mato a las partes.