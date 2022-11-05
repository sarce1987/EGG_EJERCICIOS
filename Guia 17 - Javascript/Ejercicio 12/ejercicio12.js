let indentificador = prompt("Introduzca un numero o letra");

let parts = indentificador.split(" ");
let parsedVals;

function parseToVal(parts){

  return parts.map(part =>{
    
    if(part == "true" || part == "false") return part == "true"
    if(part == "undefined") return undefined
    if(
      !Number.isNaN(parseFloat(part)) && 
      parseFloat(part).toString().length === part.length
    ){
      return parseFloat(part);
    }else{
      return part;
    }
    if(part == "Infinity" || part == "-Infinity") return part == "Infinity" ? Infinity : -Infinity;
    if(part == "null") return null;
    if(part == "NaN") return NaN;
    
    return part;
    
  });

}

parsedVals = parseToVal(parts);

parsedVals.forEach((elm, i) =>{
  console.log(`${parts[i]} has the type: ${typeof elm}`);
});