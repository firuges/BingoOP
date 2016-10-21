/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.cDatosException;
import Persistencia.pDatosException;

/**
 *
 * @author Maxi
 */
public class dDatosException {
    public void guardarException(Exception exception) throws cDatosException {
        if (!"".equals(exception.getMessage())) {
            pDatosException pPersistencia = new pDatosException();
            pPersistencia.agregar(exception);
        }
    }
}
