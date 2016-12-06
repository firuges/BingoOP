/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.cDatosException;
import Common.cUsuario;
import Persistencia.pUsuario;
import java.util.ArrayList;

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
    public void modificar(cUsuario pUsuario) throws Exception {
        try{
            pUsuario pPersistencia = new pUsuario();
            pPersistencia.modificar(pUsuario);
        
        }catch(Exception ex){
            throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregar():" + ex.getMessage());
        }
        
    }

    public void eliminar(cUsuario pUsuario) throws Exception {
        try{
            pUsuario pPersistencia = new pUsuario();
            pPersistencia.eliminar(pUsuario);
        
        }catch(Exception ex){
            throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregar():" + ex.getMessage());
        }
        
    }

    public cUsuario buscar(cUsuario pUsuario) throws Exception {
        try{
            cUsuario unUsuario = new cUsuario();
            pUsuario persistencia = new pUsuario();
            unUsuario = persistencia.buscarUsuario(pUsuario);
        
        if (unUsuario != null) {
            return unUsuario;
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
        pUsuario persistencia = new pUsuario();
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
        pUsuario persistencia = new pUsuario();
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
