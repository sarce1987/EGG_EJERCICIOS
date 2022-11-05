let limite = Number.parseInt(prompt("Ingrese un valor limite: "));
const v = [];
let sum =0 , i =0 ;
do {
     sum+= Number.parseInt(prompt("Ingrese el valor "+(i+1)));
     i++; 
     document.querySelector("#respuesta").textContent= `La suma es ${sum}
     y el valor limite agregado fue ${limite}`;  
} while (sum <= limite);