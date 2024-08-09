/*
 * ARQUIVO APENAS DE TESTE! ELE SÓ CONTINUA AQUI NO PROJETO POR RAZÕES DE ESTUDO PESSOAL
 */
package com.gabr1elluna.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstPath")
//http://localhost:8080/ -----
public class FirstController {

    /* 
     * Métodos de acesso do HTTP

     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/info
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da info/dado
    */
    
    @GetMapping("/")
    public String firstMessage(){
        return "It worked!";
    }
}
