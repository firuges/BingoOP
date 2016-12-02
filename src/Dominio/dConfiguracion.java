/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.cConfiguracion;
import Common.cDatosException;
import Common.cUsuario;
import Persistencia.pConfiguracion;
import Persistencia.pUsuario;

/**
 *
 * @author Ezequiel
 */
public class dConfiguracion {
     public void modificar(cConfiguracion pConfiguracion) throws Exception {
        try{
            pConfiguracion pPersistencia = new pConfiguracion();
            pPersistencia.modificar(pConfiguracion);
        
        }catch(Exception ex){
            throw new cDatosException("ERROR al Modificar la Config /pConfiguracion/modificar():" + ex.getMessage());
        }
        
    }
     public cConfiguracion traer(int pId) throws Exception {
        try{
            pConfiguracion persistencia = new pConfiguracion();
            cConfiguracion laConfig = persistencia.traerConfig(pId);
        if (laConfig != null) {
            return laConfig;
        } else {
            return null;
        }
        }catch(Exception ex){
            throw new cDatosException("ERROR al Traer la Config /pConfiguracion/traer():" + ex.getMessage());
        }
        
    }
}
