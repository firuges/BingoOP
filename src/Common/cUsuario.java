/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author Maxi
 */
public class cUsuario {
    private int id;
    private String Nombre;
    private String Apellido;
    private String Password;
    private String Email;
    private Enums.Gerarquia TipoUser;
    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public cUsuario(){
        
    }
    public cUsuario(int pId,String pNombre,String pApellido,String pEmail,String pPassword, Enums.Gerarquia pTipoUser){
        this.id = pId;
        this.Nombre = pNombre;
        this.Apellido = pApellido;
        this.Email = pEmail;
        this.Password = pPassword;
        this.TipoUser = pTipoUser;
        
    }

    /**
     * @return the TipoUser
     */
    public Enums.Gerarquia getTipoUser() {
        return TipoUser;
    }

    /**
     * @param TipoUser the TipoUser to set
     */
    public void setTipoUser(Enums.Gerarquia TipoUser) {
        this.TipoUser = TipoUser;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
