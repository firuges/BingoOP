/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Common.Enums;
import Common.cAdmin;
import Common.cDatosException;
import Common.cJugador;
import Common.cUsuario;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxi
 */
public class pUsuario extends pPersistencia {
    @Override
      public void agregar(java.lang.Object o) throws Exception {
        cUsuario unUser = (cUsuario)o;
        if(unUser.getTipoUser().equals(Enums.Gerarquia.ADMIN)){
            try {
                cAdmin unAdmin = (cAdmin)o;
                agregarAdmin(unAdmin);
            } catch (Exception ex) {
                throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregar():" + ex.getMessage());
               
            }
        }else{
            cJugador unJugador = (cJugador)o;
            agregarJugador(unJugador);
        }
    }
      private boolean agregarAdmin(cAdmin pAdmin) throws Exception{
          try{
            
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
               String insertSql="INSERT INTO usarios(tid,tdesc)" +
               "VALUES(" + pAdmin.getNombre() + " ,'" + pAdmin.getApellido()+ " ,'" + pAdmin.getEmail()+ " ,'" + pAdmin.getPassword()
                       + " ,'" + pAdmin.getTipoUser()+ "')";
                // esto es solo para mostrar el sql que se va a ejecutar
               System.out.println(insertSql);
               // ejecuta la sentencia
               st.executeUpdate(insertSql);
               super.cerrarConexion();
        }catch(Exception ex){
            throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregarAdmin():" + ex.getMessage());
          
        }
         return true;
      }
      
      private boolean agregarJugador(cJugador pJugador) throws Exception{
         try{
            
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
               String insertSql="INSERT INTO usarios(tid,tdesc)" +
               "VALUES(" + pJugador.getNombre() + " ,'" + pJugador.getApellido()+ " ,'" + pJugador.getEmail()+ " ,'" + pJugador.getPassword()
                       + " ,'" + pJugador.getTipoUser()+ "')";
                // esto es solo para mostrar el sql que se va a ejecutar
               System.out.println(insertSql);
               // ejecuta la sentencia
               st.executeUpdate(insertSql);
               super.cerrarConexion();
        }catch(Exception ex){
            throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregarAdmin():" + ex.getMessage());
        }
         return true;
      }
}
