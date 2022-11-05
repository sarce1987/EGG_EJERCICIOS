let caracter = prompt(`Ingrese la operacion que desea realizar: 
s: suma
r: resta
m: multiplicacion
d: division`).toLowerCase();
let num1 = prompt("Ingrese el primer numero entero: ");
let num2 = prompt("Ingrese el segundo numero entero: ");

switch (caracter) {
    case "s":
            alert(`La suma es: ${num1 + num2}`);
            document.getElementById("respuesta").textContent=`La suma es: ${num1 + num2}`
            break;
    case "r":  
            alert(`La resta es: ${num1 - num2}`);
            document.getElementById("respuesta").textContent=`La resta es: ${num1 - num2}`
            break;        
    case "m":
            alert(`La multiplicacion es: ${num1 * num2}`);
            document.getElementById("respuesta").textContent=`La multiplicacion es: ${num1 * num2}`
            break;
    case "d":
            alert(`La division es: ${num1 / num2}`);
            document.getElementById("respuesta").textContent=`La division es: ${num1 / num2}`
            break;
        
}