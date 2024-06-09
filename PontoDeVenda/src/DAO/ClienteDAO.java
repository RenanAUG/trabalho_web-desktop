package DAO;

import Model.Cliente;

import java.sql.ResultSet;

public class ClienteDAO extends GenericDAO<Cliente> {

    @Override
    protected Cliente construirObjeto(ResultSet rs) {
        return null;
    }

    @Override
    public boolean salvar(Cliente obj) {
        return false;
    }

    @Override
    public boolean atualizar(Cliente obj) {
        return false;
    }
}
