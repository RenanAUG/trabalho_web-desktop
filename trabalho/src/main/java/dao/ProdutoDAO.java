/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;
/**
 *
 * @author elde rigue
 */
public class ProdutoDAO extends GenericDAO<Produto> {         

    @Override
    public boolean salvar(Produto produto) {
        String sql = "INSERT INTO produto (descricao, valor, categoria) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, produto.getDescricao());
            pstmt.setString(2, produto.getValor());
            pstmt.setString(3, produto.getCategoria());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean atualizar(Produto produto) {
        String sql = "UPDATE produto SET descricao = ?, valor = ?, categoria = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, produto.getDescricao());
            pstmt.setString(2, produto.getValor());
            pstmt.setString(3, produto.getCategoria());
            pstmt.setInt(4, produto.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    protected Produto construirObjeto(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
