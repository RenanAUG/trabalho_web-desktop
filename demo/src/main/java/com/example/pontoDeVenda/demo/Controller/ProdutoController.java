package com.example.pontoDeVenda.demo.Controller;

import com.example.pontoDeVenda.demo.Model.Produto;
import com.example.pontoDeVenda.demo.Service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping()
    private ResponseEntity<List<Produto>> listarProduto() {
        return  ResponseEntity.ok(produtoService.getAll());
    }

    @PostMapping()
    private ResponseEntity<Produto> salvarProduto(@RequestBody Produto produto) {
        return ResponseEntity.ok(produtoService.save(produto));
    }
}
