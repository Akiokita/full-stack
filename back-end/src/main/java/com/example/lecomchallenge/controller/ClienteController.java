/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.lecomchallenge.controller;

import com.example.lecomchallenge.model.Cliente;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.lecomchallenge.repository.RepositorioCliente;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Z 220
 */
@RestController
public class ClienteController {

    @Autowired
    RepositorioCliente respositorioCliente;

    //Retorna todos os clientes em JSON
    @CrossOrigin
    @RequestMapping("/{id}")
    @GetMapping("/clientes")
    public Page<Cliente> pegaTodosClientes(Pageable pageable) {
        return respositorioCliente.findAll(pageable);
    }

    //Adiciona novo cliente.
    @PostMapping("/clientes")
    public Cliente novoCliente(@Valid Cliente cliente) {
        return respositorioCliente.save(cliente);
    }

}
