package es.seas.unidad3.ejemplo.fastfoodcompany.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pablo
 */
public class Conexion {

    String user = "root";
    String pass = "root";
    String url = "jdbc:mysql://localhost:3306/fastfood";
    Connection con;
    Statement stmt;
    ResultSet rs;

    public void connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void insertaPreparedStatement(int id, String nombre,
            String apellido_1, String apellido_2) {
        try {

            PreparedStatement ps
                    = con.prepareStatement(
                            "INSERT INTO clientes VALUES (?,?,?,?)");
            ps.setNull(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellido_1);
            ps.setString(4, apellido_2);
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editaPreparedStatement(String nombre,
            String apellido_1, String apellido_2, int id) {

        try {
            PreparedStatement ps
                    = con.prepareStatement(
                            "UPDATE clientes SET nombre = ?, apellido_1 = ?, apellido_2 = ? WHERE id = ?");
            ps.setString(1, nombre);
            ps.setString(2, apellido_1);
            ps.setString(3, apellido_2);
            ps.setInt(4, id);
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePreparedStatement(String nombre, String apellido_1) {
        try {
            PreparedStatement ps
                    = con.prepareStatement(
                            "DELETE FROM clientes where nombre = ? AND apellido_1 = ?");
            ps.setString(1, nombre);
            ps.setString(2, apellido_1);
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getClientes() {
        try {
            ArrayList<String> clientes = new ArrayList<>();
            stmt = con.createStatement();
            String query = "SELECT * FROM clientes";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                clientes.add(rs.getString("nombre") + " " + rs.getString("apellido_1") + " " + rs.getString("apellido_2"));
            }
            rs.close();
            stmt.close();
            con.close();
            return clientes;

        } catch (SQLException s) {
            s.printStackTrace();
        }
        return null;
    }

    public int getCliente(String nombre, String apellido_1) {
        int clienteId = 0;
        try {
            String query = "SELECT * FROM clientes where nombre = ? AND apellido_1 = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido_1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                clienteId = rs.getInt("id");
            }
            rs.close();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clienteId;
    }
}
