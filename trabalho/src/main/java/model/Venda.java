/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author elde rigue
 */
public class Venda {
     private int id;
    private String observacoes;
    private LocalDateTime data;
    private BigDecimal total;
    private int fkClienteId;

    public Venda(int id, String observacoes, LocalDateTime data, BigDecimal total, int fkClienteId) {
        this.id = id;
        this.observacoes = observacoes;
        this.data = data;
        this.total = total;
        this.fkClienteId = fkClienteId;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public int getFkClienteId() {
        return fkClienteId;
    }

    public void setFkClienteId(int fkClienteId) {
        this.fkClienteId = fkClienteId;
    }
    
    
}
