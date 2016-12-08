/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.*;
import java.util.ArrayList;

/**
 *
 * @author administrator
 */
public class dEmpresa {

    // <editor-fold defaultstate="collapsed" desc=" Instancia ">
    private static dEmpresa instancia;

    public static dEmpresa getInstancia() {
        if (instancia == null) {
            instancia = new dEmpresa();
        }
        return instancia;
    }

    public dEmpresa() {
    }
// </editor-fold>
    

    private dUsuario empresaUsuario = new dUsuario();
    private dConfiguracion empresaConfiguracion = new dConfiguracion();
   
    // <editor-fold defaultstate="collapsed" desc=" Usuario ">
    public cUsuario buscarUsuario(cUsuario pUsuario) throws Exception {
        cUsuario unUsuario = new cUsuario();
        if (pUsuario != null) {
            try {
                unUsuario = empresaUsuario.buscar(pUsuario);
            } catch (Exception ex) {
                throw new cDatosException("Error al buscar Usuario:" + ex.getMessage());
            }
            
        }
        if (unUsuario != null) {
            return unUsuario;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosUsuarios() throws Exception {
        dUsuario unUsuario = new dUsuario();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unUsuario.buscarTodos();
        } catch (Exception ex) {
            throw new cDatosException("Error al buscar todos los Usuarios:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    public int generarIdUsuario() throws Exception {
        dUsuario unUsuario = new dUsuario();
        int num = 0;
        try {
            num = unUsuario.generarId();
        } catch (Exception ex) {
            throw new cDatosException("Error al buscar el Usuario:" + ex.getMessage());
        }
        return num;
    }

    public boolean agregarUsuario(cUsuario Usuario) throws Exception {
        if (Usuario != null) {
            try {
                empresaUsuario.guardar(Usuario);
                return true;
            } catch (Exception ex) {
                throw new cDatosException("Error al ingresar el Usuario:" + ex.getMessage());
            }


        } else {
            return false;
        }
    }

    public boolean modificarUsuario(cUsuario Usuario) throws Exception {
        if (Usuario != null) {
            try {
                empresaUsuario.modificar(Usuario);
                return true;
            } catch (Exception ex) {
                throw new cDatosException("Error al modificar Usuario:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }

    public boolean eliminarUsuario(cUsuario Usuario) throws Exception {
        if (Usuario != null) {
            try {
                empresaUsuario.eliminar(Usuario);
                return true;
            } catch (Exception ex) {
                throw new cDatosException("Error al eliminar Usuario:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc=" Configuracion ">
    public cConfiguracion traerConfiguracion(int pId) throws Exception {
        if (pId != 0) {
            try {
                return empresaConfiguracion.traer(pId);
            } catch (Exception ex) {
                throw new cDatosException("Error al buscar Configuracion:" + ex.getMessage());
            }
            
        }else{
            return null;
        }
    }

    
    public boolean modificarConfiguracion(cConfiguracion pConfig) throws Exception {
        if (pConfig != null) {
            try {
                empresaConfiguracion.modificar(pConfig);
                return true;
            } catch (Exception ex) {
                throw new cDatosException("Error al modificar Configuracion:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }

 
// </editor-fold>
}
