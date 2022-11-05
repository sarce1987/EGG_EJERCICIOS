/*
Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo 
con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El 
radio del círculo lo proporcionará el usuario.
*/

function radio(){
  return document.querySelector("#input").value
}

function areaCirculo(radio) {
  document.querySelector("#area").innerHTML = `Area : ${(Math.PI * Math.pow(radio , 2)).toFixed(2)} m2`;
}

function perimetroCirculo(radio){
  document.querySelector("#perimetro").innerHTML = `Perimetro : ${(2*Math.PI*radio).toFixed(2)} m`;
}

function ejecutarTodo(){
  areaCirculo(radio());
  perimetroCirculo(radio());
}

document.getElementById("boton").onclick = ejecutarTodo;

