package com.example.pontoDeVenda.demo.Service;

import com.example.pontoDeVenda.demo.Model.ItemVenda;
import com.example.pontoDeVenda.demo.Repository.ItemVendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemVendaService {

    private final ItemVendaRepository itemVendaRepository;

    public ItemVendaService(ItemVendaRepository itemVendaRepository) {
        this.itemVendaRepository = itemVendaRepository;
    }

    public List<ItemVenda> getAll(){
        return this.itemVendaRepository.findAll();
    }

    public ItemVenda save(ItemVenda itemVenda){
        return this.itemVendaRepository.save(itemVenda);
    }


}
