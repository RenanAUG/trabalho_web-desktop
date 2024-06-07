package com.example.pontoDeVenda.demo.Repository;

import com.example.pontoDeVenda.demo.Model.Cliente;
import com.example.pontoDeVenda.demo.Model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {

    @Query(
            "SELECT v FROM Venda v " +
                    "WHERE v.data BETWEEN :dataInicial AND :dataFinal"
    )
    List<Venda> findByDataInicialAndDataFinal(
            @Param("dataInicial") LocalDate dataInicial,
            @Param("dataFinal") LocalDate DataFinal
    );
}
