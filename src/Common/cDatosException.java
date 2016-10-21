/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Common;

import Dominio.dDatosException;
import Persistencia.pUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author administrator
 */
public class cDatosException extends java.lang.Exception{

    public cDatosException() {
    }

    public cDatosException(String msg) {
        super(msg);
        try{
            dDatosException dominioEx = new dDatosException();
            dominioEx.guardarException(new Exception(msg));
        }catch(Exception e){
            Logger.getLogger(pUsuario.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
}
