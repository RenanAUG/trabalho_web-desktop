package com.example.pontoDeVenda.demo.Model;

import com.example.pontoDeVenda.demo.Model.Produto;
import com.example.pontoDeVenda.demo.Model.Venda;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class ItemVenda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double valor_unitario;

    private double valor_total;

    private Integer quantidade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_produto_id", nullable = false)
    private Produto produto;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "fk_venda_id", nullable = false)
//    @JsonIgnore
//    private Venda venda;

}