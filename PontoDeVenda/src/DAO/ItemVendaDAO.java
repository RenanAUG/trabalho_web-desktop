package DAO;

import Model.ItemVenda;

import java.sql.ResultSet;

public class ItemVendaDAO extends GenericDAO<ItemVenda>{
    @Override
    protected ItemVenda construirObjeto(ResultSet rs) {
        return null;
    }

    @Override
    public boolean salvar(ItemVenda obj) {
        return false;
    }

    @Override
    public boolean atualizar(ItemVenda obj) {
        return false;
    }
}
