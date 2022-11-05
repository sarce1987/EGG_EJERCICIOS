/*
Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios 
y los muestre por pantalla.
*/

let vecA = [];
let vecB = [];

for (let i = 0; i < 5; i++) {
    vecA[i]=Math.floor(Math.random()*10);
    vecB[i]=Math.floor(Math.random()*10);  
}


alert(`vectorA: [${vecA}] 
vectorB: [${vecB}]`)
