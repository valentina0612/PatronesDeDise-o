## Strategy

Stretegy es un patrón de diseño estructural que te permite definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables. Strategy te permite seleccionar un algoritmo en tiempo de ejecución.

En este ejemplo, el patrón Strategy nos permite definir diferentes métodos de pago. Para ello, construimos una interfaz llamada "PayStrategy" la cual será implementada por "PayByCreditCard" y "PayByPayPal", las cuales son las estretegias de pago específicos. Finalmente, en "Demo" probamos el funcionamiento de la aplicación.