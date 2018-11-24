package com.example.lecomchallenge.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "servicos")
public class Servico extends ModeloGeral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Lob
    private String nome;
    
    //PRECO DO SERVICO.
    @Lob
    @NotNull
    private String preco;
    
    //PRECO DO SERVICO AO CLIENTE PRATA.
    @Lob
    private String preco_prata;
    
    //PRECO DO SERVICO AO CLIENTE OURO.
    @Lob
    private String preco_ouro;
    
    //PRECO DO SERVICO SE O PAGAMENTO FOR 10 DIAS ADIANTADO

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
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

    /**
     * @return the price
     */
    public String getPreco() {
        return preco;
    }

    /**
     * @param price the price to set
     */
    public void setPreco(String preco) {
        this.preco = preco;
    }

    /**
     * @return the preco_prata
     */
    public String getPreco_prata() {
        return preco_prata;
    }

    /**
     * @param preco_prata the preco_prata to set
     */
    public void setPreco_prata(String preco_prata) {
        String auxiliar = getPreco();
        float precoPrata = Float.parseFloat(auxiliar);
        precoPrata = (float) (precoPrata - precoPrata * 0.05);
        this.preco_prata = Float.toString(precoPrata);
    }

    /**
     * @return the preco_ouro
     */
    public String getPreco_ouro() {
        return preco_ouro;
    }

    /**
     * @param preco_ouro the preco_ouro to set
     */
    public void setPreco_ouro(String preco_ouro) {
        String auxiliar = getPreco();
        float precoOuro = Float.parseFloat(auxiliar);
        precoOuro = (float) (precoOuro - precoOuro * 0.1);
        this.preco_ouro = Float.toString(precoOuro);
    }
    /**
     * @return the pagamento_adiantado
     */
}
