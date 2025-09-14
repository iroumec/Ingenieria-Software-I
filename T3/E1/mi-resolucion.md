# T3E1

> [!WARNING]
> La clasificación de los atributos de calidad es subjetiva.
> Puede haber varias posibilidades.

## a)

_El sistema debe verificar que un usuario tenga acceso/permisos para operar y modificar parámetros de ciertos dispositivos (por ej., el nivel de calefacción de una habitación, o el código de seguridad para acceder a un determinado sector), mediante usuario y contraseña._

El requerimiento está orientado principalmente a lo que hace el sistema, que comprende la verificación de que un usuario tenga permisos para realizar ciertas acciones. A pesar de que al final diga "mediante usuario y contraseña", si bien se podría argumentar de que es está hablando sobre cómo lo hace el sistema, dado el contexto del que se viene hablando, y observando el requerimiento en su continúa, continúa siendo el qué hace el sistema y no, el cómo.

Por lo tanto, es un **requerimiento funcional**-

## b)

_El sistema debe reportar cualquier alarma crítica (por ej., una alarma de incendio), aún cuando existan problemas de conectividad, sin que se degrade el tiempo de respuesta desde que sucede el evento hasta que el sistema la reporta (por ej., 2 segundos)._

Se podría pensar que el requerimiento es funcional, ya que cuando se habla de que "El sistema debe reportar cualquier alarma ccrítica", se está hablando de lo que hace el sistema. Sin embargo, por la forma en la que el requerimiento está redactado, y tomándolo desde su conjunto, pareciera ser más un requerimiento de calidad, ya que habla de cómo el sistema debe hacer algo. ¿Qué es ese algo? Reportar cualquier alarma crítica. ¿Cómo debe hacerlo? Sin que se degrade el tiempo de respuesta desde que sucede el evento hasta que el sistema la reporta, aún ccuando existan problemas de conectividad. Así, el requerimiento pareciera hablar de la disponibilidad del sistema aún ante problemas de conectividad. Podría también justificarse que se trata de un atributo de _performance_, pero el tiempo mencionado no deja de ser una medida de respuesta. Recordar que, el que especifique un tiempo, no convierte al atributo automáticamente en un atributo de _performance_.

Por lo tanto, es un **requerimiento de calidad**, específicamente, de **disponibilidad**.

## c)

_El sistema debe dar soporte para integrar dispositivos de un abanico de fabricantes, y permitir que estos dispositivos puedan interactuar entre sí y con el resto del sistema (por ej., dispositivos Siemens, Honeywell, etc.)._

El requerimiento no nos habla de las funciones que debe permitir realizar el sistema, sino del soporte para la integración de dispositivos. En particular, es un requisito que habla de la extensibilidad del sistema.

Por lo tanto, es un **requerimiento de calidad**, específicamente, de **extensibilidad**-

## d)

_El sistema debe permitir que se puedan incorporar extensiones de funcionalidad (por ej., soporte para tablets para el monitoreo, mecanismos de auto-control de temperatura, etc.) sin necesidad de tener que desarrollar todo el sistema de nuevo._

El requerimiento no habla acerca de lo que hace el sistema, sino cuán sencillo es incoporarles extensiones de funcionalidad. Por lo tanto, nos habla de qué tan escalable es este mediante el agregado de módulos. Si bien se podría catalogar el requerimiento en "modularidad", es más preciso decir "extensibilidad" o "escalabilidad", ya que se refiere a la capacidad del sistema para incorporar nuevas funcionalidades sin tener que rehacer todo el sistema. La modularidad se refiere más a la estructura interna del sistema, mientras que la extensibilidad se refiere a la capacidad de agregar nuevas funcionalidades. Por otro lado, la escalibilidad suele usarse en este sentido, pero en realidad está habla sobre el agregado de _hardware_.

Por lo tanto, es un **requerimiento de calidad**, específicamente, **extensibilidad**.

## e)

_El sistema debe poder correrse en una versión Web, tanto en Safari como en Chrome._

El requerimiento no habla sobre qué hace el sistema, sino en dónde lo hace. Es decir, especifica las plataformas en las que debe poder correr el sistema. Nos habla de la portabilidad de este.

Por lo tanto, es un **requerimiento es de calidad**, específicamente, **portabilidad**.

## f)

_El sistema debe permitir que, a través de una consola táctil, el usuario pueda interactuar con distintos dispositivos para: levantar persianas y apagar luces interiores cuando hay luz natural suficiente para trabajar; y para abrir las ventanas y permitir una ventilación exterior cuando las condiciones meteorológicas (exteriores al edificio) así lo permitan, desactivando la calefacción o aire acondicionado._

El requerimiento habla acerca de algo que debe permitir realizar el sistema, de una de sus funcionalidades.

Por lo tanto, es un **requerimiento funcional**-

## g)

_El sistema debe permitir que el administrador agregue, remueva, y configure dispositivos instalados en la red del edificio._

Nuevamente, el requerimiento habla de una funcionalidad del sistema: permitir que el administrador agregue, remueva y configure dispositivos.

Por lo tanto, es un **requerimiento funcional**.
