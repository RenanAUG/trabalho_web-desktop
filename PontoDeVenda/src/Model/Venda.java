package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Integer id;

    private String observacoes;

    private LocalDate data;

    private double total;

    private Cliente cliente;

    private List<ItemVenda> itens = new ArrayList<>();

}
