/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
/**
 *
 * @author elde rigue
 */
public class ClienteDAO extends GenericDAO<Cliente> {
    
    @Override
    protected Cliente construirObjeto(ResultSet rs) throws SQLException {
        return new Cliente(
            rs.getInt("id"),
            rs.getString("nome"),
            rs.getString("telefone"),
            rs.getString("email")
        );
    }

    @Override
    public boolean salvar(Cliente cliente) {
        String sql = "INSERT INTO Cliente (nome, telefone, email) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getTelefone());
            pstmt.setString(3, cliente.getEmail());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean atualizar(Cliente cliente) {
        String sql = "UPDATE Cliente SET nome = ?, telefone = ?, email = ? WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getTelefone());
            pstmt.setString(3, cliente.getEmail());
            pstmt.setInt(4, cliente.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ArrayList<Cliente> listarClientes() {
        String sql = "SELECT * FROM Cliente";
        return retornaLista(sql);
    }

    public Cliente buscarClientePorId(int id) {
        return retornarPeloId(id, "Cliente", "id");
    }

    public void deletarCliente(int id) {
        delete(id, "Cliente", "id");
    }
}

