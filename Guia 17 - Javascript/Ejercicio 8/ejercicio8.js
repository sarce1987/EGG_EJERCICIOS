
const nums =[];
function evaluar() {
     let valorInput = Number.parseInt(document.getElementById("input").value);
     if(valorInput===0){
      document.getElementById("max").textContent = "El valor max es : "+Math.max(...nums);    
      document.getElementById("min").textContent = "El valor min es: " +Math.min(...nums);  
      document.getElementById("prom").textContent = "El valor promedio es: " + valorPromedio(nums);
        
     }else{
      nums.push(valorInput);
      console.log(nums);
     }
}

function valorPromedio(arreglo){
     let sum = 0
     for (let index = 0; index < arreglo.length; index++) {
          sum+= arreglo[index]; 
     }
     let prom = sum / arreglo.length;
     return prom;
}

document.getElementById("boton").onclick = evaluar;
