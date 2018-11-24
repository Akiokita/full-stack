/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.lecomchallenge.controller;

import com.example.lecomchallenge.exception.ResourceNotFoundException;
import com.example.lecomchallenge.model.ServicoComprado;
import com.example.lecomchallenge.repository.RepositorioCliente;
import com.example.lecomchallenge.repository.RepositorioServicoComprado;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Z 220
 */
@RestController
public class ServicoCompradoController {

    @Autowired
    private RepositorioServicoComprado repositorioServicoComprado;

    @Autowired
    private RepositorioCliente repositorioCliente;
    
    @CrossOrigin
    @GetMapping("/clientes/{cliente_id}/servicos-comprados")
    public Page<ServicoComprado> pegaTodosServicosComprados(@PathVariable(value = "cliente_id") Long clienteId,
            Pageable pageable) {
        return repositorioServicoComprado.findByClienteId(clienteId, pageable);
    }

    @PostMapping("/clientes/{cliente_id}/servicos-comprados")
    public ServicoComprado clienteCompraServico(@PathVariable(value = "cliente_id") Long clienteId,
            @Valid @RequestBody ServicoComprado servicoComprado) {
        return repositorioCliente.findById(clienteId).map(cliente -> {
            servicoComprado.setCliente(cliente);
            return repositorioServicoComprado.save(servicoComprado);
        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + clienteId + " not found"));
    }

}
