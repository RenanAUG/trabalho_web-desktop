package DAO;

import Model.Venda;

import java.sql.ResultSet;

public class VendaDAO extends GenericDAO<Venda>{
    @Override
    protected Venda construirObjeto(ResultSet rs) {
        return null;
    }

    @Override
    public boolean salvar(Venda obj) {
        return false;
    }

    @Override
    public boolean atualizar(Venda obj) {
        return false;
    }
}
