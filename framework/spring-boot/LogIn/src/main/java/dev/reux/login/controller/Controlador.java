package dev.reux.login.controller;
import dev.reux.login.DTOs.UsuariosDTO;
import dev.reux.login.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api")
public class Controlador {

    //inyeccion de dependencias para invocacion de los metodos del servicio
    @Autowired
    private UsuariosService service;

    @GetMapping("/service")
    public List <UsuariosDTO> listar(){
        return service.consulta();
    }
    //Anotacion tipo POST
    @PostMapping("/insert")
                                        //CONVIERTE EL ELEMENTO DE JSON/HTML ETC..
                                        // A ELEMENTO DE JAVA DE CLASE TIPO UsuariosDTO llamada dto
    public  UsuariosDTO insertarUsuario(@RequestBody UsuariosDTO dto){
        //utiliza la variable service para acceder al metodo insertarUsuario...
        //y guardar el dto que es el elemento de tipo json o html ya convertido a java
        return service.insertarUsuario(dto);

    }


}
