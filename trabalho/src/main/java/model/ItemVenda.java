/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author elde rigue
 */
public class ItemVenda {
    private Integer id;
    private Integer quantidade;
    private Double valorUnitario;
    private Double valorTotal;
    private Integer fkVendaId;
    private Integer fkProdutoId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getFkVendaId() {
        return fkVendaId;
    }

    public void setFkVendaId(Integer fkVendaId) {
        this.fkVendaId = fkVendaId;
    }

    public Integer getFkProdutoId() {
        return fkProdutoId;
    }

    public void setFkProdutoId(Integer fkProdutoId) {
        this.fkProdutoId = fkProdutoId;
    }
    
    
}
