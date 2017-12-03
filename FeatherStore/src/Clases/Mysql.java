package Clases;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JTextArea;

public class Mysql {
    private static Connection Conexion;
    public Mysql(){}
    public void editarPerfil (String nombre, String Correo, String Contra, String pais, String Nikname, String id){
         String sql = "Update usuarios set Correo="+"'"+Correo+"'"+", Username="+"'"+Nikname+"'"+", Nombre="+"'"+nombre+"'"+", Pais="+"'"+pais+"'"+", Password_="+"'"+Contra+"'"+" where idUsuarios="+id+"";
         System.out.println(sql);
         try {
            Statement st = Conexion.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Reintenta mas tarde", "Ocurrio un error al Actualizar", WARNING_MESSAGE);
        
        }   
    }
    public void connection(String db_name,String user,String pass){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db_name,user,pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Reintenta mas tarde prro", "Ocurrio un error  :c", WARNING_MESSAGE);
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
    public void insertApp(String nom, String precio, String Descripcion, String Dessa, String repo, String categ){
        String sql = "Insert Into software(Nombre,Precio,Descripcion,Desarrolladores,Repo_Git,Categoria) values("+"'"+nom+"'"+","+"'"+precio+"'"+","+"'"+Descripcion+"'"+","+"'"+Dessa+"'"+","+"'"+repo+"'"+","+"'"+categ+"'"+")";
        // System.out.println(sql);
         try {
            Statement st = Conexion.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Listo, enhorabuena", "Aplicacion subida", WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Reintenta mas tarde", "Ocurrio un error al Ingresar la app", WARNING_MESSAGE);
        
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
                    y = rs.getString("idDesarrolladores");
                    user1.setId(y);
                }
                else{
                    y = rs.getString("idUsuarios");
                    user1.setId(y);
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
    public void mostrar_resultados(String categoria,JLabel l1,JLabel l2,JTextArea d1,JTextArea d2){
        String[] titulos=new String[5];
        String[] desc=new String[5];
        try{
            for(int i=0;i<5;i++){
            String Query="Select * from Software where Categoria='"+categoria+"' and idSoftware='"+i+"';";
            Statement st=Conexion.createStatement();
            st.executeQuery(Query);
            ResultSet t= st.executeQuery(Query);
            while(t.next()){
                titulos[i]=t.getString("Nombre");
                desc[i]=t.getString("Descripcion");
                }
            }
            l1.setText(titulos[1]);
            d1.setText(desc[1]);
            l2.setText(titulos[2]);
            d2.setText(desc[2]);
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error en los datos", "Ocurrio un error al mostrar el titulo del juego", WARNING_MESSAGE); 
        }
        //crear evento de clic en la imagen, terminar de mostrar todos los datos,diseniar el jframe ese y es todo mi trabajo
    }
}