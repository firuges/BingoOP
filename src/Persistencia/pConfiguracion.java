/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Common.Enums;
import Common.Utilidades;
import Common.cAdmin;
import Common.cConfiguracion;
import Common.cDatosException;
import Common.cJugador;
import Common.cUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ezequiel
 */
public class pConfiguracion extends pPersistencia{

    @Override
    public void modificar(java.lang.Object o) throws Exception {
        try{
            cConfiguracion laConfig = (cConfiguracion)o;
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
                    // arma la sentencia sql
                    String updateSql="UPDATE jconfig SET " +
                    "filas=" + laConfig.getFilasCarton()+ "" +
                    "columnas=" + laConfig.getColumnasCarton()+ "" +
                    "cartones=" + laConfig.getCartonesXJugador()+ "'" +
                    "valor=" + laConfig.getValorCarton() +
                    " WHERE id= 2" ;
                    System.out.println(updateSql);
                    // ejecuta la sentencia
                    st.executeUpdate(updateSql);
                    super.cerrarConexion();
        }catch(SQLException e){
            throw new cDatosException("ERROR AL INTENTAR MODIFICAR CONFIGURACION:" + e.getMessage());
           
        }
}

    public cConfiguracion traerConfig(int pId)throws Exception{
        try{
             //cConfiguracion unUser = (cConfiguracion)o;
             cConfiguracion laConfig = null;
             super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
            String selectSql="SELECT * FROM jconfig  WHERE id=" + pId;
            // esto es solo para mostrar el sql que se va a ejecutar
            System.out.println(selectSql);
            // ejecuta la sentencia
            ResultSet rs=st.executeQuery(selectSql);
            while(rs.next()){
                laConfig = new cConfiguracion();
                int num;
                // recorre el Resultset y crea un objeto con los datos de cada linea.
                num = rs.getInt("id");
                laConfig.setId(num);
                laConfig.setFilasCarton(rs.getInt("filas"));
                laConfig.setColumnasCarton(rs.getInt("columnas"));
                laConfig.setCartonesXJugador(rs.getInt("cartones"));
                laConfig.setValorCarton(rs.getInt("valor"));              
            }
            super.cerrarConexion();
            // devuelve el objeto encontrado
            if (laConfig != null){
                return laConfig;
            }else{
                return null;
            }
        }catch(SQLException e){throw new cDatosException("Error al buscar configuracion:" + e.getMessage());}
    }
}
