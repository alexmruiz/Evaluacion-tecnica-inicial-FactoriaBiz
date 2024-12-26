<?php
// Verifica si el formulario fue enviado
if ($_SERVER["REQUEST_METHOD"] === "POST") {
    // Recuperar los datos del formulario
    $name = htmlspecialchars($_POST["name"]);
    $email = htmlspecialchars($_POST["email"]);
    $message = htmlspecialchars($_POST["message"]);
    $date = date("d/m/Y H:i:s");

    // Formatear los datos para guardarlos en el archivo
    $input = "Fecha: $date\nNombre: $name\nCorreo: $email\nMensaje: $message\n---\n";

    // Especifica el archivo donde se guardarán los datos
    $file = "datos.txt";

    // Guarda los datos en el archivo (agregándolos al final)
    if (file_put_contents($file, $input, FILE_APPEND | LOCK_EX)) {
        echo "Datos guardados correctamente.";
    } else {
        echo "Hubo un error al guardar los datos.";
    }
} else {
    echo "No se enviaron datos.";
}

