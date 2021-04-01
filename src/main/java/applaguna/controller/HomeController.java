package applaguna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //Metodo que responde al home de la pagina
    //o directorio raiz de la pagina
    @GetMapping("/")
    public String mostrarHome(){
        return "home";

    }

}
