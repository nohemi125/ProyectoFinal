
package GUI;


public class cls_pagina {
    private String str_usuario;
    private String str_correo;
    private String str_contraseña;
    
    public cls_pagina (String usuario, String correo, String contraseña){
        this.str_usuario = usuario;
        this.str_correo = correo;
        this.str_contraseña = contraseña;
    }

    public String getStr_usuario() {
        return str_usuario;
    }

    public void setStr_usuario(String str_usuario) {
        this.str_usuario = str_usuario;
    }

    public String getStr_correo() {
        return str_correo;
    }

    public void setStr_correo(String str_correo) {
        this.str_correo = str_correo;
    }

    public String getStr_contraseña() {
        return str_contraseña;
    }

    public void setStr_contraseña(String str_contraseña) {
        this.str_contraseña = str_contraseña;
    }
    
}
