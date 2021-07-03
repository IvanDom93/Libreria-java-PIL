# TrabajoPracticoJavaPIL
Proyecto de Java de consola

Nombre: Dominguez Ivan

Aplicación de librería para consola de Java. Se permite hace un listado de productos totales, búsquedas según diferentes criterios, e inserción de nuevos productos. Persistencia de datos con H2 como sistema de base de datos en la aplicación.


# GUÍA DE USUARIO - SISTEMA DE GESTIÓN DE LIBRERÍA

## INICIO - MENÚ PRINCIPAL

Al ingresar al sistema se muestra la lista de opciones disponibles:

**1 - Listados totales de productos**

**2 - Búsquedas parciales**

**3 - Insertar nuevos elementos**

**4 - Eliminar productos**

**5 - Salir del programa**

Se selecciona la opción deseada ingresando el número correspondiente en consola para visualizar los submenús.

## Submenús

### 1 - Listados totales de productos

Muestra la lista completa de los productos cargados en el sistema. Se dividen en tres categorías: Libros, Comics, Revistas. Se seleccionan por consola escribiendo el número que se muestra en los títulos.

  **1 - Listado total de libros**
  
  **2 - Listado total de comics**
  
 **3 - Listado total de revistas**
  
  **4 - Volver atrás**


### 2 - Búsquedas parciales

Permite buscar determinados productos basados en diferentes criterios:
  
  **1 - Búsqueda por autores**
  
   Se escribe el nombre del autor y se muestra en pantalla los productos asociados con ese nombre.
   
  **2 - Búsqueda por géneros**
  
   Se escribe un genéro de libro o cómic (Terror, Fantasía, etc) y se muestran todos los productos que cumplen con esa clasificación.
                    
 **3 - Búsqueda del precio del producto**
  
   Se escribe el titulo del producto para consultar su precio almacenado.
   
  **4 - Búsqueda por titulo**
  
   Se escribe el titulo para poder consultar todos los datos almacenados del mismo y consultar si existe en el sistema o no.
   
  **5 - Volver atrás**
  
   Vuelve al menú principal.

### 3 - Insertar nuevos elementos

Permite buscar ingresar nuevos productos (Libros, comics, revistas):

   **1 - Ingresa un nuevo libro**
    
   Cuando se quiera ingresar un nuevo libro al sistema se pedirán los siguentes datos por consola: Titulo, Autor, Precio, Genero, Editorial, Año de publicación. 
    
   Una vez completados los datos el producto se habrá agregado, se mostrará en un mensaje si el libro se agregó correctamente y los datos ingresados.
     
   **2 - Ingresa una nueva revista**
   
   Cuando se quiera ingresar una nueva Revista al sistema se pedirán los siguentes datos por consola: Nombre de la revista, Precio, Fecha de publicación.
      
   Una vez completados los datos el producto se habrá agregado, se mostrará en un mensaje si la revista se agregó correctamente y los datos ingresados.
     
   **3 - Ingresa un nuevo cómic**
   
   Cuando se quiera ingresar un nuevo Comic al sistema se pedirán los siguentes datos por consola: Titulo, Autor, Precio, Genero, Editorial, Año de publicación, Dibujante, Colorista. 
     
   Una vez completados los datos el producto se habrá agregado, se mostrará en un mensaje si el cómic se agregó correctamente y los datos ingresados.
     
   **4 - Volver atrás**
   
   Vuelve al menú principal.
   
 ### 4 - Eliminar productos

Permite eliminar productos en base al ID de producto (Libros, comics, revistas):

   **1 - Eliminar libro**
    
     
   **2 - Eliminar revista**
  
      
   **3 - Eliminar cómic**
   
     
   **4 - Volver atrás**
   
  Cuando se quiera Eliminar un producto se pedirá el código del producto: 
    
   **-** Si se encuentra el codigo, se mostrarán los datos y se pedirá una confirmación de que se desea eliminar:
   
   **1 - SI :** 
   
   Se elimina el registro, sale un mensaje de producto eliminado correctamente.
 
   **2 - No :** 
   
   Vuelve al menú anterior.

   **-** Si no se encuentra el código, saldrá un mensaje notificando de que ese código no pertenece a un producto existente.
     
### 5 - Salir del programa

 Cuando se elija esta opción se preguntará si de verdad desea salir:
 
 **1 - SI** 
 
   Si se confirma presionando 1, el programa se cerrará.
 
 **2 - NO**
 
   Si se presiona otra cosa que no sea 1, volverá al menú principal.

