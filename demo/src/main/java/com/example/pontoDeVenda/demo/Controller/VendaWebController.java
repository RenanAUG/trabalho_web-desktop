package com.example.pontoDeVenda.demo.Controller;

import com.example.pontoDeVenda.demo.Model.Venda;
import com.example.pontoDeVenda.demo.Service.VendaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class VendaWebController {

    private final VendaService vendaService;


    public VendaWebController(VendaService vendaService) {
        this.vendaService = vendaService;
    }

    @GetMapping("/vendaFiltrada")
    public String findByDataInicialAndDataFinal(
            @RequestParam(value = "dataInicial", required = false) LocalDate dataInicial,
            @RequestParam(value = "dataFinal",required = false) LocalDate dataFinal,
            Model model
    ) {
        List<Venda> vendas = vendaService.findByDataInicialAndDataFinal(dataInicial, dataFinal);
        model.addAttribute("vendas", vendas);
        return "vendaFiltrada";
    }
}
