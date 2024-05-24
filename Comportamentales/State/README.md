## State

El patrón de diseño State es un patrón de comportamiento que permite a un objeto alterar su comportamiento cuando su estado interno cambia. El objeto parecerá cambiar de clase, pero en realidad, solo cambia su estado interno.

En este ejemplo, usamos el patrón state para manejar el estado de una tarjeta de crédito. La tarjeta de crédito puede estar en uno de los siguientes estados: Bloqueada, Activada, Desactivada y Comprando. Cada estado tiene su propia lógica para manejar las operaciones de la tarjeta de crédito.

Por lo tanto, el patrón State permite que la tarjeta de crédito cambie su comportamiento cuando cambia su estado interno. En lugar de tener un solo objeto de tarjeta de crédito con múltiples métodos condicionales, tenemos múltiples objetos de estado que manejan las operaciones de la tarjeta de crédito de manera diferente. Estas clases hacen uso de la clase abstracta State para definir una interfaz común para todos los estados.