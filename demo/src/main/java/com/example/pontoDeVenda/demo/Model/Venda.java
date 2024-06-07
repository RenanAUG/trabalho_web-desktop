package com.example.pontoDeVenda.demo.Model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Venda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String observacoes;

    private LocalDate data;

    private double total;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_cliente_id", nullable = false)
    private Cliente cliente;

    @OneToMany(
            mappedBy = "venda",
            orphanRemoval = true,
            cascade = CascadeType.PERSIST,
            fetch = FetchType.EAGER
    )
    private List<ItemVenda> itens = new ArrayList<>();

}
