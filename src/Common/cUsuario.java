/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.util.Date;

/**
 *
 * @author Maxi
 */
public class cUsuario {
    public static cUsuario unUser;
    
    private int id;
    private String Nombre;
    private String Apellido;
    private String Password;
    private String Email;
    private Date Fechanacido;
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
    
    public static cUsuario  getInstance(){
        if(unUser != null){
            return unUser;
        }
        unUser = new cUsuario();
        return unUser;
    }
    public cUsuario  getInstance(int pId,String pNombre,String pApellido,String pEmail,String pPassword, Date pFechaNacido){
        cUsuario unUser = new cUsuario();
        unUser.setId(id);
        unUser.setNombre(Nombre);
        unUser.setApellido(Apellido);
        unUser.setEmail(Email);
        unUser.setPassword(Password);
        unUser.setFechanacido(Fechanacido);
        return unUser;
    }
    public cUsuario(){
        
    }
    public cUsuario(int pId,String pNombre,String pApellido,String pEmail,String pPassword, Date pFechanacido){
        this.id = pId;
        this.Nombre = pNombre;
        this.Apellido = pApellido;
        this.Email = pEmail;
        this.Password = pPassword;
        this.Fechanacido = pFechanacido;
        
    }
    public String QueSoy(){
        return "Soy un Simple Usuario No Identificado";
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

    /**
     * @return the Fechanacido
     */
    public Date getFechanacido() {
        return Fechanacido;
    }

    /**
     * @param Fechanacido the Fechanacido to set
     */
    public void setFechanacido(Date Fechanacido) {
        this.Fechanacido = Fechanacido;
    }
}
