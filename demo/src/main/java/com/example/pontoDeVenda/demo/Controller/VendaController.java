package com.example.pontoDeVenda.demo.Controller;

import com.example.pontoDeVenda.demo.Model.Venda;
import com.example.pontoDeVenda.demo.Service.ItemVendaService;
import com.example.pontoDeVenda.demo.Service.VendaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
@Tag(name = "Venda API", description = "API para gerenciamento de vendas")
public class VendaController {

    private final VendaService vendaService;
    private final ItemVendaService itemVendaService;

    public VendaController(VendaService vendaService, ItemVendaService itemVendaService) {
        this.vendaService = vendaService;
        this.itemVendaService = itemVendaService;
    }

    @GetMapping()
    @Operation(summary = "Obter todas as vendas", description = "Retorna uma lista de todas as vendas")
    private ResponseEntity<List<Venda>> listarVendas() {
        return ResponseEntity.ok(vendaService.getAll());
    }

    @PostMapping()
    @Operation(summary = "Salvar venda",
            description = "Salva um novo venda e retorna o venda salvo",
            parameters = {
                    @Parameter(name = "venda", description = "Venda que será adicionado. " +
                            "Não é necessário incluir o ID.")
            })
    private ResponseEntity<Venda> salvarVenda(@RequestBody Venda venda) {
        return ResponseEntity.ok(vendaService.save(venda));
    }
}
