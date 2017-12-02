
package Clases;

public class Usuario {
    String Username,Nombre,Pais,Titulo,Correo,id;
    boolean Developer;
    
    public void setId(String x){
        id = x;
    }
    public void setTitulo(String x){
        Titulo = x;
    }
    public void setCorreo(String x){
        Correo=x;
    }
    public void setUsername(String x){
        Username = x;
    }
    public void setNombre(String x){
        Nombre = x;
    }
    public void setPais(String x){
        Pais = x;
    }
    public void setDeveloper(String x){
        if("Yes".equals(x))
            Developer=true;
        else
            Developer=false;
    }
    public String getId(){
        return id;
    }
    public String getCorreo(){
        return Correo;
    }
    public boolean getDeveloper(){
        return Developer;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getUsername(){
        return Username;
    }
    public String getPais(){
        return Pais;
    }
    public String getTitulo(){
        return Titulo;
    }
    public void verDatos(){
        System.out.println(Username+"___"+Nombre+"___"+Pais);
    }
}
