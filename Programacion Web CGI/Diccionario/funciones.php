<?php
function buscarPalabra($palabra){

	switch ($palabra) {
		case 'xml':

			$siginificado = "Es un lenguaje de marcas que sirve para almacenar datos de forma legible";

			break;
	    case 'ajax':

			$siginificado = "Es una tecnica de desarrollo web para crear aplicaciones interactivas al lado del servidor";

			break;
		case 'sqlserver':

		    $siginificado = "Es un sistema de manejo de base de datos del modelo relacional , desarrollo por microsoft";

		    break;
		case 'webforms':

		    $siginificado = "Es un formulario que separa la logica con la presentacion";

		     break;
		case 'webservices':

            $siginificado = "Es una tecnologia que utiliza unos protocolos para intercambiar datos con otras aplicaciones";

		     break;
		case 'javascript':

            $siginificado = "es un lenguaje de programacion que sirve al lado del cliente";

		     break;
		case 'IIS':

            $siginificado = "Es un servidor web para servicios de microsoft";

		     break;
		case 'capas web':

            $siginificado = "Es una arquitectura web cliente servidor donde separa la logica con la presentacion";

		     break;
		default:

            $siginificado = "No se encuentra la palabra";

			break;
	}

	return $siginificado;

}
?>
