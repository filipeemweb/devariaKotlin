package br.com.devaria.projetos.apirest.controllers

import br.com.devaria.projetos.apirest.entities.Usuario
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/olamundo")
class OlaMundoController {

    @GetMapping
    fun tratarOlaMundo() : Usuario {
        return Usuario("Usuario teste", "teste@teste.com", "01231230")
    }
}