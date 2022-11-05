/*
Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor, 
Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario 
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas
*/

function Libro (isbn , titulo , autor , numPaginas) {
  this.isbn = isbn;
  this.titulo = titulo;
  this.autor = autor;
  this.numPaginas = numPaginas;
}
var libros = [];
function crearLibro(){
  let isbn = document.getElementById("isbn").value;
  let  titulo= document.getElementById("titulo").value;
  let  autor= document.getElementById("autor").value;
  let  numPaginas= document.getElementById("num-paginas").value;
  libros.push(new Libro(isbn,titulo,autor,numPaginas));

  document.getElementById("isbn").value="";
  document.getElementById("titulo").value="";
  document.getElementById("autor").value="";
  document.getElementById("num-paginas").value="";
  console.log(libros);
}

function mostrarLibros(){
  libros.forEach((e)=> document.getElementById("lista-libros").innerHTML += `<li>ISBN: ${e.isbn}, Titulo: ${e.titulo}, Autor: ${e.autor}, Num Paginas: ${e.numPaginas}</li>`)

}


document.getElementById("boton-guardar").onclick = crearLibro;
document.getElementById("boton-mostrar").onclick = mostrarLibros;
