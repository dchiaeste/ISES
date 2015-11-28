<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<form action="index.php" method="POST">
	 <label>Ingrese la palabra</label>
	 <input type="text" name="palabra" id="palabra" />
	 <input type="submit" value="Buscar" />
</form>
<br>
<?php
require("funciones.php");
if($_POST['palabra'] != ""){

echo "<p>".buscarPalabra($_POST['palabra'])."</p>";

}
?>
</body>
</html>
