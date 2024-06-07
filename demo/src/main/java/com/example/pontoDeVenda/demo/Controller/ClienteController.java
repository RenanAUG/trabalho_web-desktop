package com.example.pontoDeVenda.demo.Controller;

import com.example.pontoDeVenda.demo.Model.Cliente;
import com.example.pontoDeVenda.demo.Service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Cliente API", description = "API para gerenciamento de clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/cliente")
    @Operation(summary = "Obter todos os clientes", description = "Retorna uma lista de todos os clientes")
    public ResponseEntity<List<Cliente>> listarCliente(){
        return ResponseEntity.ok(clienteService.getAll());
    }

    @PostMapping("/cliente")
    @Operation(summary = "Salvar cliente",
            description = "Salva um novo cliente e retorna o cliente salvo",
            parameters = {
                    @Parameter(name = "cliente", description = "Cliente que será adicionado. " +
                            "Não é necessário incluir o ID.")
            })
    public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.save(cliente));
    }
}
