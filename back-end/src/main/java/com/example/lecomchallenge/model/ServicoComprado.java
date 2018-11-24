package com.example.lecomchallenge.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "servicos_comprados")
public class ServicoComprado extends ModeloGeral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Lob
    private String nome_servico;

    @NotNull
    @Lob
    private String data_inicio;

    @NotNull
    @Lob
    private String data_fim;

    //Coluna que mostra quantos dias faltam para o vencimento do servico.
    @NotNull
    @Lob
    private String dias_restantes;

    //Preco pago varia de acordo com o tipo do cliente. 
    @NotNull
    @Lob
    private String preco_pago;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cliente_id", nullable = false)
    //@OnDelete: Delete em cascada, ou seja, quando o registro pai é deletado, seus filhos sao deletados tambem.
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Cliente cliente;

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
     * @return the data_inicio
     */
    public String getData_inicio() {
        return data_inicio;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * @return the data_fim
     */
    public String getData_fim() {
        return data_fim;
    }

    /**
     * @param data_fim the data_fim to set
     */
    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    /**
     * @return the dias_restantes
     */
    public String getDias_restantes() {
        return dias_restantes;
    }

    /**
     * @param dias_restantes the dias_restantes to set
     */
    public void setDias_restantes(String dias_restantes) {
        this.dias_restantes = dias_restantes;
    }

    /**
     * @return the preco_pago
     */
    public String getPreco_pago() {
        return preco_pago;
    }

    /**
     * @param preco_pago the preco_pago to set
     */
    public void setPreco_pago(String preco_pago) {
        this.preco_pago = preco_pago;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

//    public String subtraiDias(String dataInicio, String dataFim){
//        return String plei;
//    }

    /**
     * @return the nome_servico
     */
    public String getNome_servico() {
        return nome_servico;
    }

    /**
     * @param nome_servico the nome_servico to set
     */
    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }
}
