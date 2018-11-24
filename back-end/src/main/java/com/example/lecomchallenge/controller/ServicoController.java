/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.lecomchallenge.controller;

import com.example.lecomchallenge.model.Servico;
import com.example.lecomchallenge.repository.RepositorioCliente;
import com.example.lecomchallenge.repository.RepositorioServico;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Z 220
 */


@RestController

public class ServicoController {
    @Autowired
    RepositorioServico repositorioServico;
    
    //Retorna todos os clientes em JSON
    @CrossOrigin
    //@RequestMapping("/{id}")
    @GetMapping("/servicos")
    public Page<Servico> pegaTodosServicos(Pageable pageable) {
        return repositorioServico.findAll(pageable);
    }
    //Adiciona novo cliente.
    @PostMapping("/servicos")
    public Servico novoServico(@Valid Servico servico){
        return repositorioServico.save(servico);
    }
}
