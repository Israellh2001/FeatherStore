
package Clases;


public class Correo {

    public String getMensaje() {return Mensaje;}
    public void setMensaje(String Mensaje) {this.Mensaje = Mensaje;}
    public String getUsuarioCorreo() {return usuarioCorreo;}
    public void setUsuarioCorreo(String usuarioCorreo) {this.usuarioCorreo = usuarioCorreo;}
    public String getContraseña() {return contraseña;}
    public void setContraseña(String contraseña) {this.contraseña = contraseña;}
    public String getRutaArchivo() {return rutaArchivo;}
    public void setRutaArchivo(String rutaArchivo) {this.rutaArchivo = rutaArchivo;}
    public String getNombreArchivo() {return nombreArchivo;}
    public void setNombreArchivo(String nombreArchivo) {this.nombreArchivo = nombreArchivo;}
    public String getDestino() {return Destino;}
    public void setDestino(String Destino) {this.Destino = Destino;}
    public String getAsunto() {return Asunto;}
    public void setAsunto(String Asunto) {this.Asunto = Asunto;}
    
    
    private String Mensaje;
    private String usuarioCorreo;
    private String contraseña;
    private String rutaArchivo;
    private String nombreArchivo;
    private String Destino;
    private String Asunto;
}
