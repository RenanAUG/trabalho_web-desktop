package DAO;

import Model.Produto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDAO extends GenericDAO<Produto>{

    @Override
    protected Produto construirObjeto(ResultSet rs) {

        Produto produto = new Produto();

        try {
            produto.setId(rs.getInt("id"));
            produto.setDescricao(rs.getString("descricao"));

            produto.setValor(rs.getDouble("valor"));
            produto.setCategoria(rs.getString("categoria"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produto;
    }

    @Override
    public boolean salvar(Produto produto) {
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO produto (descricao,valor,categoria) VALUES (?, ?, ?)";

            ps = conn.prepareStatement(sql);

            ps.setString(1, produto.getDescricao());
            ps.setDouble(2, produto.getValor());
            ps.setString(3, produto.getCategoria());

            int colunas = ps.executeUpdate();
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
