/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia;

import Common.cDatosException;
import Common.cTipo;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author administrator
 */
public class pTipo extends pPersistencia{

      public pTipo() {
          super.getInstancia();
      }

      @Override
      public void agregar(java.lang.Object o) throws Exception {
        try{
            cTipo unTipo = (cTipo)o;
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
               String insertSql="INSERT INTO ttipo(tid,tdesc)" +
               "VALUES(" + unTipo.getId() + " ,'" + unTipo.getDesc()  + "')";
                // esto es solo para mostrar el sql que se va a ejecutar
               System.out.println(insertSql);
               // ejecuta la sentencia
               st.executeUpdate(insertSql);
               super.cerrarConexion();
        }catch(SQLException e){
            throw new cDatosException("ERROR AL INTENTAR INGRESAR TIPO:" + e.getMessage());
        }
    }


      @Override
   public void modificar(java.lang.Object o) throws Exception {
        try{
            cTipo unTipo = (cTipo)o;
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
                    // arma la sentencia sql
                    String updateSql="UPDATE ttipo SET " +
                    "tdesc='" + unTipo.getDesc() + "'" +
                    " WHERE tid=" +  unTipo.getId();
                    System.out.println(updateSql);
                    // ejecuta la sentencia
                    st.executeUpdate(updateSql);
                    super.cerrarConexion();
        }catch(SQLException e){
            throw new cDatosException("ERROR AL INTENTAR MODIFICAR TIPO:" + e.getMessage());
           
        }
    }

      @Override
   public void eliminar(java.lang.Object o) throws Exception {
        try{
            cTipo unTipo = (cTipo)o;
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
            String deleteSql="DELETE FROM ttipo " +
                    " WHERE tid=" +  unTipo.getId();
            // esto es solo para mostrar el sql que se va a ejecutar
            System.out.println(deleteSql);
            // ejecuta la sentencia
            st.executeUpdate(deleteSql);
            super.cerrarConexion();
        }catch(SQLException e){throw new cDatosException("ERROR AL INTENTAR ELIMINAR TIPO:" + e.getMessage());}
    }

   public cTipo buscarTipo(java.lang.Object o)throws Exception{
        try{
             cTipo unTipo = (cTipo)o;

             super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
            String selectSql="SELECT * FROM ttipo ";
            if (unTipo.getId() !=0){
                // si pasaron el registro busco solo por eso
                selectSql=selectSql + " WHERE tid=" + unTipo.getId();
            }
            // esto es solo para mostrar el sql que se va a ejecutar
            System.out.println(selectSql);
            // ejecuta la sentencia
            ResultSet rs=st.executeQuery(selectSql);
            
            unTipo = null;
            
            while(rs.next()){
                unTipo = new cTipo();
                int num;
                // recorre el Resultset y crea un objeto con los datos de
                // cada linea.
                num = rs.getInt("tid");
                unTipo.setId(num);
                unTipo.setDesc(rs.getString("tdesc"));
            }
            super.cerrarConexion();
            // devuelve el objeto encontrado
            if (unTipo != null){
                return unTipo;
            }else{
                return null;
            }
        }catch(SQLException e){throw new cDatosException("Error al buscar accion:" + e.getMessage());}
    }

   public int generarId()throws Exception{
        try{
            int num;
            int id;
            num = 100;
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
            String selectSql="SELECT MAX(tid) FROM ttipo";
            // esto es solo para mostrar el sql que se va a ejecutar
            System.out.println(selectSql);
            // ejecuta la sentencia
            ResultSet rs=st.executeQuery(selectSql);
            while(rs.next()){
                num = rs.getInt("MAX(tid)");
                num = num +1;
            }
            super.cerrarConexion();
            return num;
        }catch(SQLException e){throw new cDatosException("Error al buscar el código:" + e.getMessage());}
    }


   public ArrayList buscarTodos()throws Exception{
        try{
            cTipo unTipo;
            ArrayList coleccion;
            coleccion = new ArrayList();
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
            String selectSql="SELECT * FROM ttipo";
            // esto es solo para mostrar el sql que se va a ejecutar
            System.out.println(selectSql);
            // ejecuta la sentencia
            ResultSet rs=st.executeQuery(selectSql);
            while(rs.next()){
                unTipo = new cTipo();
                int num;
                // recorre el Resultset y crea un objeto con los datos de
                // cada linea.
                num = rs.getInt("tid");
                unTipo.setId(num);
                unTipo.setDesc(rs.getString("tdesc"));
                coleccion.add(unTipo);
            }
            super.cerrarConexion();
            // devuelve el objeto encontrado
            if (coleccion != null){
                return coleccion;
            }else{
                return null;
            }
        }catch(SQLException e){throw new cDatosException("Error al buscar accion:" + e.getMessage());}
    }










}//TERMINA LA CLASE
