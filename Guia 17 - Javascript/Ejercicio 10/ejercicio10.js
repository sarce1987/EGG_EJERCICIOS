

frase = () => document.getElementById("entrada").value; //Guarda el valor del input
mostrarFrase = () => frase().split("").reverse().join(""); // Da vuelta el valor del imput
resultado = () => document.getElementById("resultado").textContent = mostrarFrase();//Muestra por pantalla el texto dado vuelta

document.getElementById("boton").onclick = resultado; // Ejecuta la funcion al darl el click


