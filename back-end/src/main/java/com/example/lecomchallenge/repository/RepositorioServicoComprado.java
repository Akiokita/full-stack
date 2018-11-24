package com.example.lecomchallenge.repository;

import com.example.lecomchallenge.model.ServicoComprado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
public interface RepositorioServicoComprado extends JpaRepository<ServicoComprado, Long>{
    Page<ServicoComprado> findByClienteId(Long cliente_id, Pageable pageable);
}
