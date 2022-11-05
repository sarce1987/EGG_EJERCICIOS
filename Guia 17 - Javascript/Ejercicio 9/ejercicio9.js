let frase = prompt("Ingrese una frase");
let fraseNueva="" ;
console.log(frase)
for (let i = 0; i < frase.length; i++) {
    
    fraseNueva += frase.substring(i,i+1)+ " ";
}
console.log(fraseNueva);
document.getElementsByTagName("p")[0].textContent = fraseNueva;