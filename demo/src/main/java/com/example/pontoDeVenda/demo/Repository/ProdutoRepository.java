package com.example.pontoDeVenda.demo.Repository;

import com.example.pontoDeVenda.demo.Model.Cliente;
import com.example.pontoDeVenda.demo.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
