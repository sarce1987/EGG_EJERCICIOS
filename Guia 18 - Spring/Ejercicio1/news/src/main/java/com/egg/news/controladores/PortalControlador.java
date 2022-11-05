
package com.egg.news.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Con esto le indicamos que es una clase de tipo controlador
@RequestMapping("/")// Configuras cual es la url que va a escuchar este controlador. En este caso le decimos que va a escuchar a partir de la "/"
public class PortalControlador {
    
    @GetMapping("/") //Lo que le decimos que cuando se ingrese a la url "/" se ejecuta todo este metodo
    public String index(){
        return "index.html"; //Esto me devuelve una vista que queremos que se renderice cuando entremos en la barra
    }
}
