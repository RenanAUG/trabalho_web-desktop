package DAO;

import Model.Venda;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VendaDAO extends GenericDAO<Venda>{


    @Override
    protected Venda construirObjeto(ResultSet rs) {

        Venda venda = new Venda();
        try {
            venda.setId(rs.getInt("id"));

            venda.setObservacoes(rs.getString("observacoes"));

            venda.setData(rs.getDate(("data")).toLocalDate());

            venda.setTotal(rs.getDouble("total"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return venda;
    }

    @Override
    public boolean salvar(Venda venda) {

        PreparedStatement ps = null;
        try {

            String sql = "INSERT INTO venda (observacoes,data,total) VALUES (?, ?, ?)";

            ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, venda.getObservacoes());
            ps.setDate(2, new java.sql.Date(venda.getData().getTime()));
            ps.setDouble(3, venda.getTotal());

            int colunas = ps.executeUpdate();

            if (colunas > 0) {
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    venda.setId(generatedKeys.getInt(1));
                }
            }
            return colunas > 0;

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
