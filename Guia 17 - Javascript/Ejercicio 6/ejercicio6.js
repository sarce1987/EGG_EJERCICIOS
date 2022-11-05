let num = Number.parseInt(prompt("Ingrese un numero entero"));
if(num===0){
        alert("El numero no es par ni impar");
        document.getElementById("respuesta").textContent="El numero no es par ni impar";

}else if(num%2===0){
        alert("El numero es par");
        document.getElementById("respuesta").textContent="El numero es par";
}else{
        alert("El numero es Impar");
        document.getElementById("respuesta").textContent="El numero es Impar";    
}