package com.example.lecomchallenge.repository;

import com.example.lecomchallenge.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Z 220
 */
@Repository
public interface RepositorioServico extends JpaRepository<Servico, Long>{
    
}
