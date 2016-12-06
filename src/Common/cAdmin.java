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
public class cAdmin extends cUsuario{
     public static cAdmin unAdmin;
    private Date Fechanacido;
    public cAdmin(int pId,String pNombre,String pApellido,String pEmail,String pPassword, Date pFechaNacido, String pUserName){
        super(pId, pNombre, pApellido, pEmail, pPassword, pFechaNacido, pUserName);
    }
    public cAdmin(){
        super();
    }
    public static cAdmin  getInstance()
    {
        if(unAdmin != null){
            return unAdmin;
        }
        unAdmin = new cAdmin();
        return unAdmin;
    }
    @Override
    public String QueSoy(){
        return "ADMIN";
    }
}
