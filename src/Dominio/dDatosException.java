/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.cDatosException;
import Persistencia.pDatosException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxi
 */
public class dDatosException {
    public void guardarException(Exception exception) throws Exception {
        try{
            if (!"".equals(exception.getMessage())) {
            pDatosException pPersistencia = new pDatosException();
            pPersistencia.agregar(exception);
        }
        }catch(Exception ex){
            Logger.getLogger(pDatosException.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
