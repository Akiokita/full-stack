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
    private String data_inicio;

    @NotNull
    @Lob
    private String data_fim;

    //Preco pago varia de acordo com o tipo do cliente. 
    @NotNull
    @Lob
    private String preco_pago;

    @NotNull
    @Lob
    private String tipo;

    private String preco_prata;

    @Lob
    private String preco_ouro;

    @Lob
    private String pagamento_normal_adiantado;

    @Lob
    private String pagamento_prata_adiantado;

    @Lob
    private String pagamento_ouro_adiantado;

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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the preco_normal_adiantado
     */
    public String getPagamento_normal_adiantado() {
        return pagamento_normal_adiantado;
    }

    /**
     * @param preco_normal_adiantado the preco_normal_adiantado to set
     */
    public void setPagamento_normal_adiantado(String pagamento_normal_adiantado) {
        String auxiliar = getPreco_pago();
        float precoNormalAdiantado = Float.parseFloat(auxiliar);
        precoNormalAdiantado = (float) (precoNormalAdiantado - precoNormalAdiantado * 0.05);
        precoNormalAdiantado = (float) (precoNormalAdiantado - precoNormalAdiantado * 0.05);
        this.pagamento_normal_adiantado = Float.toString(precoNormalAdiantado);
    }

    /**
     * @return the preco_prata_adiantado
     */
    public String getPagamento_prata_adiantado() {
        return pagamento_prata_adiantado;
    }

    /**
     * @param preco_prata_adiantado the preco_prata_adiantado to set
     */
    public void setPagamento_prata_adiantado(String pagamento_prata_adiantado) {
        String auxiliar = getPreco_pago();
        float precoPrataAdiantado = Float.parseFloat(auxiliar);
        precoPrataAdiantado = (float) (precoPrataAdiantado - precoPrataAdiantado * 0.05);
        precoPrataAdiantado = (float) (precoPrataAdiantado - precoPrataAdiantado * 0.05);
        this.pagamento_prata_adiantado = Float.toString(precoPrataAdiantado);
    }

    /**
     * @return the preco_ouro_adiantado
     */
    public String getPagamento_ouro_adiantado() {
        return pagamento_ouro_adiantado;
    }

    /**
     * @param preco_ouro_adiantado the preco_ouro_adiantado to set
     */
    public void setPagamento_ouro_adiantado(String pagamento_ouro_adiantado) {
        String auxiliar = getPreco_pago();
        float precoOuroAdiantado = Float.parseFloat(auxiliar);
        precoOuroAdiantado = (float) (precoOuroAdiantado - precoOuroAdiantado * 0.1);
        precoOuroAdiantado = (float) (precoOuroAdiantado - precoOuroAdiantado * 0.05);
        this.pagamento_ouro_adiantado = Float.toString(precoOuroAdiantado);
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
    //Valor do preco_prata adiantado
    public void setPreco_prata(String preco_prata) {
        String auxiliar = getPreco_pago();
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
        String auxiliar = getPreco_pago();
        float precoOuro = Float.parseFloat(auxiliar);
        precoOuro = (float) (precoOuro - precoOuro * 0.1);
        this.preco_ouro = Float.toString(precoOuro);
    }

}

