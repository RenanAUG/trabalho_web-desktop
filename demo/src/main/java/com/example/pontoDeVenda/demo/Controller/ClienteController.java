package com.example.pontoDeVenda.demo.Controller;

import com.example.pontoDeVenda.demo.Model.Cliente;
import com.example.pontoDeVenda.demo.Service.ClienteService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/cliente")
    public ResponseEntity<List<Cliente>> listarCliente(){
        return ResponseEntity.ok(clienteService.getAll());
    }

    @PostMapping("/cliente")
    public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.save(cliente));
    }

    @PostMapping("/teste")
    public ResponseEntity<Void> a(@RequestBody String teste){
        return ResponseEntity.ok(null);
    }
}
