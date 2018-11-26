package com.example.lecomchallenge.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 *
 * @author Dalton
 */
@Entity
@Table(name = "clientes")
public class Cliente extends ModeloGeral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @NotNull
    private String nome;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param name the name to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

   
}
