package DAO;

import Model.ItemVenda;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemVendaDAO extends GenericDAO<ItemVenda>{

    @Override
    protected ItemVenda construirObjeto(ResultSet rs) {
        ItemVenda itemVenda = new ItemVenda();
        try {
            itemVenda.setId(rs.getInt("id"));
            itemVenda.setQuantidade(rs.getInt("quantidade"));
            itemVenda.setValor_unitario(rs.getDouble("valor_unitario"));
            itemVenda.setValor_total(rs.getDouble("valor_total"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return itemVenda;
    }

    @Override
    public boolean salvar(ItemVenda itemVenda) {
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO item_venda (quantidade, valor_unitario, valor_total) VALUES (?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, itemVenda.getQuantidade());
            ps.setDouble(2, itemVenda.getValor_unitario());
            ps.setDouble(3, itemVenda.getValor_total());
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
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
