# Práctica final del Grado superior DAW de Programación FOC.

En esta tarea se va a implementar una aplicación, que tenga una interfaz de usuario y que realice una conexión con una base de datos, y haga uso de la información almacenada en dicha BD.
Lo primero que debe hacer el alumno es crear una BD MySQL poniendole el nombre  equivalente al DNI del alumno. Es decir el nombre de la BD será el DNI del alumno.
Esta base de datos contendrá una tabla llamada Departamentos con los siguientes campos:

- código tipo numerico entero (primary key)
- nombre tipo string de 50 caracteres
- id de localizacion tipo numérico entero
- id del manager tipo numérico entero
 
El primer paso para desarrollar la aplicación consiste en construir la interfaz de usuario, similar a la que se muestra en la siguiente imagen, haciendo uso del asistente de diseño de NetBeans:
 

Esta interfaz que se muestra en la imagen es solo un ejemplo. El alumno es libre de construirla como desee y usando los controles que desee, siempre eso sí, pensando en que cubra la funcionalidad que se pide en la tarea.
Una vez construida la interfaz de usuario, con los controles que el alumnos considere necesarios (botones, combobox, list, tablas, etc), se deben asociar eventos de pulsación a cada uno de esos controles de modo que la aplicación nos permita:
 
- ## Insertar nuevos registros en la base de datos:

El objetivo de la opción de insertar, es captar la información introducida por el usuario en cada uno de los campos de texto: código, nombre, id de localizacion e id del manager. Acceder a la base de datos  e insertar un nuevo departamento sobre la tabla departamentos asociando a cada columna el valor captado de cada uno de los campos del mismo nombre. Una vez insertado el departamento se mostrarán todos los registros en algún control (tipo textarea, lista, tabla, etc), de modo que se pueda apreciar que se ha producido la inserción correctamente..

- ## Borrar:

El objetivo de la opción de borrar, es realizar una consulta sobre la tabla departamentos de la base de datos  a partir del código que el usuario haya introducido en el text del campo código y mostrar la información de ese departamento en los distintos text que aparecen en la ficha. A continuación el programa preguntará si está seguro de borrar ese departamento. Si la respuesta es sí se borrará el registro correspondiente de la tabla departamentos de la BD y se mostrarán todos los departamentos que aún quedan en el control creado para tal fin, de modo que se pueda comprobar que efectivamente se ha realizado el borrado.  
Modificar

El objetivo de la opción de modificar, es realizar una consulta sobre la tabla departamentos de la base de datos  a partir del código que el usuario haya introducido en el text del campo código y mostrar la información de ese departamento en los distintos text que aparecen en la ficha. Una vez el usuario haya realizado los cambios deseados, al seleccionar la opción de modificar actualizarán los datos en la base de datos y se mostrarán todos los datos en el control creado para tal fin, de modo que se pueda comprobar que efectivamente se ha realizado la modificación..  

- ## Mostrar:

El objetivo de la opción de mostrar, es realizar una consulta sobre la tabla departamentos de la base de datos  y mostrar toda la información en el área de texto o control destinado a tal fin en en entorno construido. 
 
