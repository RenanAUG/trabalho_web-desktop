/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author elde rigue
 */
public class ConexaoSQLite {
    private static final String URL = "jdbc:postgresql://localhost:5432/trabalhoVenda";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoSQLite.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
