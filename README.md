# Heroku: Intérpretes, canales de comunicación y memoria.

### Autor: Carlos Andrés Ramírez Torres
### Fecha: Miercoles, 19 de Agosto del 2020

## Despliegue Heroku

![https://lab02arep.herokuapp.com/](https://lab02arep.herokuapp.com/)

## Uso 

Para el desarrollo del proyecto se utilizo **Maven** como una herramienta para la construccion y gestion del mismo, el codigo fue desarrollado con el lenguaje de programación **Java**.

Utilizar `mvn package` para la generacion del fichero .jar con los .class compilados.

![Texto alternativo](https://github.com/CAndresRa/Laboratorio2-AREP/blob/master/Img%20Readme/mvn%20package.png)

* Ingresar a: https://lab02arep.herokuapp.com/
* Ingresar muestra de datos separados por coma (',').
* Click en calcular.
* Obtener resultado.
* Si desea ingresar otra muestra de datos utilize el boton correspondiente.

por ejemplo:

* Datos: 160,591,114,229,230,270,128,1657,624,1503

![](https://github.com/CAndresRa/Laboratorio2-AREP/blob/master/Img%20Readme/2..png)

![](https://github.com/CAndresRa/Laboratorio2-AREP/blob/master/Img%20Readme/3..png)

## Arquitectura propuesta: Documento PDF realizado en LATEX

[Heroku: Interpreters, communication channels and memory](https://github.com/CAndresRa/Laboratorio2-AREP/blob/master/spark1.pdf)


## Pruebas 

Se han realizado un **total de 4** pruebas en donde se contemplan distintos escenarios que muestran que el codigo es correcto, entre las pruebas se probaron los siguientes eventos:

* Calculo de la **Media** de una muestra de datos.
* Calculo de la **Desviación estandar** de una muestra de datos.


* Pruebas implementadas

![](https://github.com/CAndresRa/Laboratorio2-AREP/blob/master/Img%20Readme/testIntell.png)

* Utilizando el comando de `mvn test`

![](https://github.com/CAndresRa/Laboratorio2-AREP/blob/master/Img%20Readme/mvn%20test.png)

## JavaDocs

Puede obtener los Javadocs de este documento en el siguiente enlace [JavaDocs]() o generarlos directamente desde su editor de texto favorito mediante el comando `mvn javadoc:javadoc` como se muestra a continuacion

![](https://github.com/CAndresRa/Laboratorio2-AREP/blob/master/Img%20Readme/doc.png)

![ApiDocs](https://github.com/CAndresRa/Laboratorio2-AREP/tree/master/apidocs)
