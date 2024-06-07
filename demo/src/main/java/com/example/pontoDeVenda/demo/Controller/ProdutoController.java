package com.example.pontoDeVenda.demo.Controller;

import com.example.pontoDeVenda.demo.Model.Produto;
import com.example.pontoDeVenda.demo.Service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
@Tag(name = "Produto API", description = "API para gerenciamento de produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping()
    @Operation(summary = "Obter todos os produtos", description = "Retorna uma lista de todos os produtos")
    private ResponseEntity<List<Produto>> listarProduto() {
        return  ResponseEntity.ok(produtoService.getAll());
    }

    @PostMapping()
    @Operation(summary = "Salvar produto",
            description = "Salva um novo produto e retorna o produto salvo",
            parameters = {
                    @Parameter(name = "produto", description = "Produto que será adicionado. " +
                            "Não é necessário incluir o ID.")
            })
    private ResponseEntity<Produto> salvarProduto(@RequestBody Produto produto) {
        return ResponseEntity.ok(produtoService.save(produto));
    }
}
