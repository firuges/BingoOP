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
    public void guardar(cUsuario pUser) throws cDatosException {
        if (pUser.getEmail() != "") {
            pUsuario pPersistencia = new pUsuario();
            pPersistencia.agregar(pUser);
        }
    }
}
