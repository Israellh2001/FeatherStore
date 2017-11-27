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
    public void cargarUser(String user,String password,Usuario user1){
        String sql = null,y=null;
        if(user1.getDeveloper()){
            sql = "Select * from desarrolladores where Username="+"'"+user+"'"+" and Password_="+"'"+password+"'";
        }
        else{
            sql = "Select * from usuarios where Username="+"'"+user+"'"+" and Password_="+"'"+password+"'";
        }
        try {
            Statement st =  Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                y=null;
                y = rs.getString("Username");
                user1.setUsername(y);
                y = rs.getString("Nombre");
                user1.setNombre(y);
                y = rs.getString("Pais");
                user1.setPais(y);
                if(user1.getDeveloper()){
                    y = rs.getString("Titulo");
                    user1.setTitulo(y);
                }
                y = rs.getString("Correo");
                user1.setCorreo(y);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Reintenta mas tarde", "Ocurrio un error", WARNING_MESSAGE);

        }
    }
    public boolean validarLogin(String user, String password,Usuario j){
        boolean Login = false;
        String y = "";
        String sql = "Select Password_ from usuarios where Username="+"'"+user+"'"+" and Password_="+"'"+password+"'";
        try { 
            Statement st =  Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                y = rs.getString("Password_");
            }
            if(password.equals(y)){
                Login=true;
                j.setDeveloper("Nel");
            }
            else{
                y="";
                sql = "Select Password_ from desarrolladores where Username="+"'"+user+"'"+" and Password_="+"'"+password+"'";
                st =  Conexion.createStatement();
                rs = st.executeQuery(sql);
                    while(rs.next()){
                    y = rs.getString("Password_");
            }
            if(password.equals(y))
                Login=true;
                j.setDeveloper("Yes");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Reintenta mas tarde", "Ocurrio un error al iniciar sesion", WARNING_MESSAGE);
        }
            return Login;
        }
    
    public void Registro (String nombre, String Correo, String Contra, String pais, String Nikname){
         String sql = "Insert Into usuarios(Correo,Username,Nombre,Pais,Password_) values ("+"'"+Correo+"'"+","+"'"+Nikname+"'"+","+"'"+nombre+"'"+","+"'"+pais+"'"+","+"'"+Contra+"'"+")";
         try {
            Statement st = Conexion.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Reintenta mas tarde", "Ocurrio un error al registarse", WARNING_MESSAGE);

        }   
    }
    public void validarNom(String nom,boolean c){
        String y="";
        String sql = "Select Username from usuarios where Username="+"'"+nom+"'";
        try{
            sql = "Select Username from usuarios where Username="+"'"+nom+"'";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                y = rs.getString("Username");
                if(nom.equals(y)){
                    c = false;
                }
                else{
                    c = true;
                }
            }
           
        }catch(SQLException e){
            System.out.println();
        }
    }
    public void RegistroDev (String nombre, String Correo, String Contra, String pais, String Nikname,String Titulo){
         String sql = "Insert Into desarrolladores(Correo,Username,Nombre,Pais,Password_,Titulo) values ("+"'"+Correo+"'"+","+"'"+Nikname+"'"+","+"'"+nombre+"'"+","+"'"+pais+"'"+","+"'"+Contra+"'"+","+"'"+Titulo+"'"+")";
         try {
            Statement st = Conexion.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Reintenta mas tarde", "Ocurrio un error al registarse", WARNING_MESSAGE);

        }
         
         
        }
}