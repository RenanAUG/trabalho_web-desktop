package com.example.pontoDeVenda.demo.Service;

import com.example.pontoDeVenda.demo.Model.Produto;
import com.example.pontoDeVenda.demo.Model.Venda;
import com.example.pontoDeVenda.demo.Repository.VendaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class VendaService {

    private final VendaRepository vendaRepository;

    public VendaService(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    public List<Venda> getAll(){
        return this.vendaRepository.findAll();
    }

    public Venda save(Venda venda){
        return this.vendaRepository.save(venda);
    }

    public List<Venda> findByDataInicialAndDataFinal(LocalDate dataInicial, LocalDate dataFinal) {
        return this.vendaRepository.findByDataInicialAndDataFinal(dataInicial, dataFinal);
    }


}
