# CRUD---JAVA-SPRING---SQL

Una gran empresa de logística te ha pedido crear una pequeña aplicación que les permita
ver la lista de productos que tienen en stock mediante una tabla.
Además, te piden que la aplicación cumpla con los siguientes requisitos:
● Debe tener un paginador.
● Se debe poder elegir la cantidad de registros por página.
● Se debe poder filtrar el contenido de la tabla por el nombre del producto (Buscar).
● Debe tener un diseño agradable.
● Se debe poder almacenar la siguiente información de los productos: Código único,
nombre único, precio y stock.
● Se debe poder agregar, quitar y modificar los productos.
Para realizar una aplicación web que contenga la entidad Producto con los atributos
requeridos, deberás utilizar JPS. Además, deberás implementar un paginador y alguna
librería de estilos gráficos como Bootstrap.
Recuerda que la aplicación debe contener un CRUD para la entidad Producto, extendiendo
CrudRepository.
Para esto, deberás crear un input que permita escribir el nombre del producto. De esta
forma, se ejecutará una consulta que busque todos los productos que contengan el texto
ingresado en su nombre para, posteriormente, volver a poblar la tabla con los resultados.
_ 1
www.desafiolatam.com
Requerimientos
1. Se debe poder elegir la cantidad de registros por página. (2 Puntos)
2. Se debe poder cambiar de página con un paginador. (2 Puntos)
3. Se debe poder filtrar el contenido de la tabla en base al nombre de los productos.
(1 Punto)
4. Utilizar bootstrap u otra librería para aplicar estilos. (1 Punto)
5. Se debe poder visualizar el código, nombre, precio y stock de los productos.
El código y el nombre son únicos para JPA y para el SGBD. (2 Puntos)
6. Se debe poder agregar, quitar y modificar los productos.(2 Puntos)

