
package Clases;

public class Usuario {
    String Username,Nombre,Pais;
    boolean Developer;
    
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
    public void verDatos(){
        System.out.println(Username+"___"+Nombre+"___"+Pais);
    }
}
