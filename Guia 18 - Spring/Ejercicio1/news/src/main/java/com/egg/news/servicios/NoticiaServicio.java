
package com.egg.news.servicios;

import com.egg.news.entidades.Noticia;
import com.egg.news.exception.MiException;
import com.egg.news.repositorios.NoticiaRepositorio;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaServicio {
    
    @Autowired // Esto hace que se instancia automaticamente el objeto NoticiaRepositorio
    private NoticiaRepositorio noticiaRepositorio;
    
   @Transactional // Esto permite que si a la hora de hacer modificaciones en la base de datos se 
                 //produce un error. Entonces no se guarda ninguna modificacion y se vuelve hacia atras
    public void crearNoticia(String titulo , String cuerpo) throws MiException{
        validarDatos(titulo, cuerpo);
        
        Noticia noticia = new Noticia();
        
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setAlta(Boolean.TRUE);
        noticiaRepositorio.save(noticia);   
    }
    
    @Transactional
    public void modificarNoticia(Long id, String titulo, String cuerpo) throws MiException{
        
        validarDatos(titulo, cuerpo);
        
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id); // Es un objeto contenedor que puede o no contener un valor no nulo. Si el valor esta presente esta true y nos puede retornar el valor con el metodo get
        
        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            noticiaRepositorio.save(noticia);
        }
    }
    
    // Este metodo devuelve una lista con todas las noticias de la base de datos
    public List<Noticia> listarNoticias(){
        List<Noticia> noticias = noticiaRepositorio.findAll();
        return noticias;    
    }
    
    
    //* Falta el metodo para eliminar las noticias!!!
    
    public void validarDatos(String titulo, String cuerpo) throws MiException{
        if (titulo.isEmpty() || titulo == null) {
            throw new MiException("El titulo no puede ser nulo ni estar vacio");
        }
        
          if (cuerpo.isEmpty() || cuerpo == null) {
            throw new MiException("El cuerpo no puede ser nulo ni estar vacio");
   
         }
    }
    
}
