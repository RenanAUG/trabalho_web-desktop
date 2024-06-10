/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import conexaoBD.ConexaoSQLite;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author elde rigue
 */
public class DatabaseInitializer {
    public static void createTables() {
        String clienteTable = "CREATE TABLE IF NOT EXISTS Cliente ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "nome TEXT NOT NULL,"
                + "telefone TEXT,"
                + "email TEXT"
                + ");";

        String vendaTable = "CREATE TABLE IF NOT EXISTS Venda ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "observacoes TEXT,"
                + "data TEXT NOT NULL,"
                + "total REAL NOT NULL,"
                + "fk_Cliente_id INTEGER,"
                + "FOREIGN KEY(fk_Cliente_id) REFERENCES Cliente(id)"
                + ");";

        String produtoTable = "CREATE TABLE IF NOT EXISTS Produto ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "descricao TEXT NOT NULL,"
                + "valor REAL NOT NULL,"
                + "categoria TEXT"
                + ");";

        String itemVendaTable = "CREATE TABLE IF NOT EXISTS Item_Venda ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "quantidade INTEGER NOT NULL,"
                + "valor_unitario REAL NOT NULL,"
                + "valor_total REAL NOT NULL,"
                + "fk_Venda_id INTEGER,"
                + "fk_Produto_id INTEGER,"
                + "FOREIGN KEY(fk_Venda_id) REFERENCES Venda(id),"
                + "FOREIGN KEY(fk_Produto_id) REFERENCES Produto(id)"
                + ");";

        try (Connection conn = ConexaoSQLite.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(clienteTable);
            stmt.execute(vendaTable);
            stmt.execute(produtoTable);
            stmt.execute(itemVendaTable);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseInitializer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
