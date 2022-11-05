/*
A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
a) Determinar cual de los dos elementos de texto es mayor
b) Utilizando exclusivamente los dos valores booleanos del array, determinar los 
operadores necesarios para obtener un resultado true y otro resultado false
c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los 
dos elementos numéricos
*/

var valores = [true, 5, false, "hola", "adios", 2]

//a)

let mayor="";
for (let i = 0; i < valores.length; i++) {
    if ((typeof valores[i]==="string")){
        if(valores[i].length > mayor.length){
            mayor = valores[i];
        }
    }
}
console.log("La palabra mayor es: "+mayor);

//b)

valores.forEach(val => {
    if(val===true){
        console.log(val)
    }else if(val===false)
        console.log(val)
})

//c)
valores.forEach(val => {
    if(!isNaN(val)){
        console.log(val)
    }
})