package Clases;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Mysql {
    protected Connection Conexion;
    public Mysql(){
        
    }
    
    public void connection(String db_name,String user,String pass){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db_name,user,pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Reintenta mas tarde", "Ocurrio un error :c", WARNING_MESSAGE);
        }
    }
    public void closeConnection(){
        try {
            Conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Reintenta mas tarde", "Ocurrio un error :c", WARNING_MESSAGE);
        }
    }
    public void Query(String query){
        try {
            Statement st = Conexion.createStatement();
            st.execute(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Reintenta mas tarde", "Ocurrio un error :c", WARNING_MESSAGE);
        }
    }
    public boolean validarLogin(String user, String password){
        boolean Login = false;
        String y = "";
        String sql = "Select Password_ from usuarios where Username="+"'"+user+"'"+" and Password_="+"'"+password+"'";
        try { 
            Statement st =  Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                y = rs.getString("Password_");
            }
            if(password.equals(y))
                Login=true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Reintenta mas tarde", "Ocurrio un error al iniciar sesion", WARNING_MESSAGE);
        }
            return Login;
        }
        public void Registro (String nombre, String Correo, String Contra, String pais, String Nikname){
            
        }
        public void RegistroDev (String nombre, String Correo, String Contra, String pais, String Nikname, String direccion, String Titulo){
            
        }
}
