package dev.reux.login.controller;

import dev.reux.login.entity.Usuarios;
import dev.reux.login.repository.Repos_Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controlador {
    //inyeccion de dependencias para invocacion de los metodos del repositorio
    @Autowired
    private Repos_Usuarios repository;

    @GetMapping("/usuarios")
    //la vista devolvera una lista de tipo Usuarios que retorna un lista de todos los usuarios del repositorio
    public List<Usuarios> consulta(){
        return (List<Usuarios>) repository.findAll();
    }


}
