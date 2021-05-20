package br.com.devaria.projetos.apirest.entities

import com.fasterxml.jackson.annotation.JsonIgnore

data class Usuario(val nome: String, val email: String, @JsonIgnore val senha: String)