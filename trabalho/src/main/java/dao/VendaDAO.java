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
import model.Venda;
import java.util.ArrayList;
/**
 *
 * @author elde rigue
 */
public class VendaDAO extends GenericDAO<Venda> {
    
    @Override
    protected Venda construirObjeto(ResultSet rs) throws SQLException {
        return new Venda(
            rs.getInt("id"),
            rs.getString("observacoes"),
            rs.getTimestamp("data").toLocalDateTime(),
            rs.getBigDecimal("total"),
            rs.getInt("fk_Cliente_id")
        );
    }

    @Override
    public boolean salvar(Venda venda) {
        String sql = "INSERT INTO Venda (observacoes, data, total, fk_Cliente_id) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, venda.getObservacoes());
            pstmt.setTimestamp(2, java.sql.Timestamp.valueOf(venda.getData()));
            pstmt.setBigDecimal(3, venda.getTotal());
            pstmt.setInt(4, venda.getFkClienteId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean atualizar(Venda venda) {
        String sql = "UPDATE Venda SET observacoes = ?, data = ?, total = ?, fk_Cliente_id = ? WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, venda.getObservacoes());
            pstmt.setTimestamp(2, java.sql.Timestamp.valueOf(venda.getData()));
            pstmt.setBigDecimal(3, venda.getTotal());
            pstmt.setInt(4, venda.getFkClienteId());
            pstmt.setInt(5, venda.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ArrayList<Venda> listarVendas() {
        String sql = "SELECT * FROM Venda";
        return retornaLista(sql);
    }

    public Venda buscarVendaPorId(int id) {
        return retornarPeloId(id, "Venda", "id");
    }

    public void deletarVenda(int id) {
        delete(id, "Venda", "id");
    }
}
