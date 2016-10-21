/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.*;
import Persistencia.pTipo;
import java.util.ArrayList;

/**
 *
 * @author administrator
 */
public class dTipo {

    public void guardar(cTipo pTipo) throws Exception {
        try{
            if (pTipo.getId() != 0) {
                pTipo pPersistencia = new pTipo();
                pPersistencia.agregar(pTipo);
            }
        }catch(Exception ex){
            throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregar():" + ex.getMessage());
        }
    }

    public void modificar(cTipo pTipo) throws Exception {
        try{
            if (pTipo.getId() != 0) {
            pTipo pPersistencia = new pTipo();
            pPersistencia.modificar(pTipo);
        }
        }catch(Exception ex){
            throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregar():" + ex.getMessage());
        }
        
    }

    public void eliminar(cTipo pTipo) throws Exception {
        try{
            if (pTipo.getId() != 0) {
            pTipo pPersistencia = new pTipo();
            pPersistencia.eliminar(pTipo);
        }
        }catch(Exception ex){
            throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregar():" + ex.getMessage());
        }
        
    }

    public cTipo buscar(cTipo pTipo) throws Exception {
        try{
            cTipo unTipo = new cTipo();
        if (pTipo.getId() != 0) {
            pTipo persistencia = new pTipo();
            unTipo = persistencia.buscarTipo(pTipo);
        }
        if (unTipo != null) {
            return unTipo;
        } else {
            return null;
        }
        }catch(Exception ex){
            throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregar():" + ex.getMessage());
        }
        
    }

    public ArrayList buscarTodos() throws Exception {
        try{
            ArrayList coleccion;
        coleccion = new ArrayList();
        pTipo persistencia = new pTipo();
        coleccion = persistencia.buscarTodos();
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
        }catch(Exception ex){
            throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregar():" + ex.getMessage());
        }
        
    }

    public int generarId() throws Exception {
        try{
            int id;
        pTipo persistencia = new pTipo();
        id = persistencia.generarId();

        if (id > 0) {
            return id;
        } else {
            return 0;
        }
        }catch(Exception ex){
            throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregar():" + ex.getMessage());
        }
        
    }
}
