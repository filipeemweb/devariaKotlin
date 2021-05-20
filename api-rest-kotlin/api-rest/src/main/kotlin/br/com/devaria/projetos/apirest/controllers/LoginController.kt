package br.com.devaria.projetos.apirest.controllers

import br.com.devaria.projetos.apirest.dtos.LoginDTO
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/login")
class LoginController {

    @PostMapping
    fun executarLogin(@RequestBody dto : LoginDTO) : String {
        if(dto != null && !dto.login.isNullOrBlank() && !dto.login.isNullOrEmpty()
                && !dto.senha.isNullOrEmpty() && !dto.senha.isNullOrBlank()
                && dto.login == "admin@admin.com" && dto.senha == "A1234") {
            return "Usuario autenticado com sucesso"
        }
        return "Parametros de entrada invalido"
    }
}