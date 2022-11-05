/*
Crear un objeto persona, con las propiedades nombre, edad, sexo ('H' hombre, 'M' mujer, 
'O' otro), peso y altura. A continuación, muestre las propiedades del objeto JavaScript.
*/

const persona = {
  nombre: "",
  edad: 35,
  sexo: ["H" ,"M","O" ],
  peso: 70,
  altura: 170
}

function mostrarPropiedades(persona) {
  let respuesta;
  document.getElementById("lista").innerHTML= "Valor de las propiedades"
  for (const prop in persona) {
      document.getElementById("lista").innerHTML += `<li>${prop}</li>`;
  }
}

mostrarPropiedades(persona);