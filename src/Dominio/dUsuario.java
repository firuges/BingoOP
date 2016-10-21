/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.cDatosException;
import Common.cUsuario;
import Persistencia.pUsuario;

/**
 *
 * @author Maxi
 */
public class dUsuario {
    public void guardar(cUsuario pUser) throws Exception {
        try{
            if (pUser.getEmail() != "") {
            pUsuario pPersistencia = new pUsuario();
            pPersistencia.agregar(pUser);
        }
        }catch(Exception ex){
            throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregar():" + ex.getMessage());
        }
        
    }
}
