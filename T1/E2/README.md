# Consideraciones

La segunda versión es recomendable, ya que me ahorro el _overhead_ de tener un objeto `Operador` dentro `CriterioCombinado`, lo que se traduce en dos clases menos en memoria y, además, en el ahorra de tantos punteros como instancias de `CriterioCombinado` haya. Además, el Singleton tiene problemas con multihilos. No me conviene hacer operadores Singleton. Si quiero más tarde agregar un `OperadorXor`, extiendo de `CriterioCombinado`.

De forma similar, tener una clase `Comparador` podría omitirse, realizando que todos los criterios que tengan un comparador comparen, por defecto, por mayor o menor. De esta forma, utilizando `CriterioCombinado` y `CriterioNot`, podrían formarse los demás operadores. Sin embargo, **en mi opinión**, esto podría ser medio engorroso para un usuario y es por eso que decido optar por la clase `Comparador`. De todas formas, hay algo de "engorrosidad" al momento de definir un mayor igual, por ejemplo. Este se definiría de forma más fácil definiendo una comparación predeterminado por menor, y luego negándola. En conclusión, queda a cada quién. Dependiendo de los operadores que más se utilicen y de lo fácil que se le quiera hacer la tarea al usuario va a depender de si se usa una solución u otra.

A este pensamiento lo reflejaré en los siguientes ejercicios.
