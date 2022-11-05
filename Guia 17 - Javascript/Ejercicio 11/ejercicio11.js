/*
. Escribir una función que reciba un String y devuelva la palabra más larga. 
String Ejemplo: “Guia de JavaScript”
Resultado esperado : “JavaScript”
*/

function masLarga(){
    let palabras = document.getElementById("input").value.split(" ");//Creo un array con las palabras involucradas en la oracion
    let palabraMayor="";
    for (const palabra of palabras) {
        if(palabra.length > palabraMayor.length){
            palabraMayor = palabra;
        }  
    }
    document.getElementById("respuesta").textContent = `La palabra mas larga es:  ${palabraMayor}`;
}

document.getElementById("boton").onclick=masLarga;