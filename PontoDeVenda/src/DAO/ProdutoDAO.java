package DAO;

import Model.Produto;

import java.sql.ResultSet;

public class ProdutoDAO extends GenericDAO<Produto>{
    @Override
    protected Produto construirObjeto(ResultSet rs) {
        return null;
    }

    @Override
    public boolean salvar(Produto obj) {
        return false;
    }

    @Override
    public boolean atualizar(Produto obj) {
        return false;
    }
}
