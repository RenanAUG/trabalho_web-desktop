package com.example.pontoDeVenda.demo.Controller;

import com.example.pontoDeVenda.demo.Model.Venda;
import com.example.pontoDeVenda.demo.Service.ItemVendaService;
import com.example.pontoDeVenda.demo.Service.VendaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {

    private final VendaService vendaService;
    private final ItemVendaService itemVendaService;

    public VendaController(VendaService vendaService, ItemVendaService itemVendaService) {
        this.vendaService = vendaService;
        this.itemVendaService = itemVendaService;
    }

    @GetMapping()
    private ResponseEntity<List<Venda>> listarVendas() {
        return ResponseEntity.ok(vendaService.getAll());
    }

    @PostMapping()
    private ResponseEntity<Venda> salvarVenda(@RequestBody Venda venda) {
        return ResponseEntity.ok(vendaService.save(venda));
    }
}
