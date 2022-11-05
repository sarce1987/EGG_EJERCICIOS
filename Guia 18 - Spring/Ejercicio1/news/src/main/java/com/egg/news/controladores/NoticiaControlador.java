
package com.egg.news.controladores;

import com.egg.news.entidades.Noticia;
import com.egg.news.exception.MiException;
import com.egg.news.servicios.NoticiaServicio;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/noticia") //localhost:8080/noticia
public class NoticiaControlador {
    
    @Autowired
    private NoticiaServicio noticiaServicio;
    
    
    @GetMapping("/registrar") //localhost:8080/noticia/registrar
    public String registrar(){
        return "noticia_form.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String titulo,@RequestParam String cuerpo, ModelMap modelo){
      //El ModelMap permite enviar informacion del lado del cliente para mostrarlo por pantalla
      
        try {
            noticiaServicio.crearNoticia(titulo, cuerpo);
            modelo.put("exito", "La noticia fue cargada correctamente"); //Si guarda correctamente los datos
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage()); // Si no se ha guardado correctamente
            return "noticia_form.html";
        }
        
        return "noticia_form.html";
    }
    
    @GetMapping("/lista")
    public String listar(ModelMap modelo){
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        
        modelo.addAttribute("noticias" , noticias);
        
        return "noticia_list.html";
    }
    
//    @GetMapping("/modificar/{id}")
//    public String modificar(@PathVariable String id, ModelMap modelo){
//        
//        
//    }
//    
    
}
