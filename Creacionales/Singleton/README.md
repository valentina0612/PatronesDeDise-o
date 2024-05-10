## Patrón Singleton

Singleto es un patrón de diseño de tipo creacional, el cual garantiza que una clase tenga una única instancia y proporcione un punto de acceso global a ella. En términos más simples, garantiza que solo haya un único objeto de una clase particular a lo largo de la ejecución del programa.

En este ejemplo, se crea una clase llamada "ClaeSingleton", el cual tiene un atributo llamado "claseSingleton" que es una instancia de la misma clase. Se crea un método llamado "getclaseSingleton" que se encarga de verificar si la instancia de la clase es nula, si es así, se crea una nueva instancia de la clase y se asigna a la variable "claseSingleton", de lo contrario, se retorna la instancia ya creada.

ClaseSingleton tiene como atributo una lista llamada "documentosId", el cual es una lista quemada con los tipos de documentos de identidad que existen en Colombia. Se crea un método llamado "getDocumentosId" que se encarga de retornar la lista de documentos de identidad.

De esta forma, al crear una instancia de la clase "ClaseSingleton" y llamar al método "getDocumentosId", se obtiene la lista de documentos de identidad que existen en Colombia. Cabe mencionar que no es posible crear una nueva instancia de la clase "ClaseSingleton" debido a que el constructor de la clase es privado, por lo que solo se puede acceder a la instancia de la clase a través del método "getclaseSingleton".