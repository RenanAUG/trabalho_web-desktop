package DAO;

import Model.Cliente;
import Model.Venda;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO extends GenericDAO<Cliente> {

    @Override
    protected Cliente construirObjeto(ResultSet rs) {

        Cliente cliente = new Cliente();

        try {
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setEmail(rs.getString("email"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cliente;
    }

    @Override
    public boolean salvar(Cliente cliente) {

        PreparedStatement ps = null;

        try {
            String sql = "INSERT INTO cliente (nome,telefone,email) VALUES (?, ?, ?)";

            ps = conn.prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTelefone());
            ps.setString(3, cliente.getEmail());

            int coluna = ps.executeUpdate();
            return coluna > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
