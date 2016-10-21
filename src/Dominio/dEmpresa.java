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

    // <editor-fold defaultstate="collapsed" desc=" Inctancia ">
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
    
    private dTipo empresaTipo = new dTipo();
    private dUsuario empresaUsuario = new dUsuario();

    // <editor-fold defaultstate="collapsed" desc=" Tipo ">
    public cTipo buscarTipo(cTipo pTipo) throws Exception {
        cTipo unTipo = new cTipo();
        if (pTipo != null) {
            if (pTipo.getId() != 0) {
                try {
                    unTipo = empresaTipo.buscar(pTipo);
                } catch (Exception ex) {
                    throw new cDatosException("Error al buscar tipo:" + ex.getMessage());
                }
            }
        }
        if (unTipo != null) {
            return unTipo;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosTipos() throws Exception {
        dTipo unTipo = new dTipo();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unTipo.buscarTodos();
        } catch (Exception ex) {
            throw new cDatosException("Error al buscar todos los tipos:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    public int generarIdTipo() throws Exception {
        dTipo unTipo = new dTipo();
        int num = 0;
        try {
            num = unTipo.generarId();
        } catch (Exception ex) {
            throw new cDatosException("Error al buscar el tipo:" + ex.getMessage());
        }
        return num;
    }

    public boolean agregarTipo(cTipo tipo) throws Exception {
        if (tipo != null) {
            try {
                empresaTipo.guardar(tipo);
                return true;
            } catch (Exception ex) {
                throw new cDatosException("Error al ingresar el tipo:" + ex.getMessage());
            }


        } else {
            return false;
        }
    }

    public boolean modificarTipo(cTipo tipo) throws Exception {
        if (tipo != null) {
            try {
                empresaTipo.modificar(tipo);
                return true;
            } catch (Exception ex) {
                throw new cDatosException("Error al modificar tipo:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }

    public boolean eliminarTipo(cTipo tipo) throws Exception {
        if (tipo != null) {
            try {
                empresaTipo.eliminar(tipo);
                return true;
            } catch (Exception ex) {
                throw new cDatosException("Error al eliminar tipo:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }
// </editor-fold>
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
}
