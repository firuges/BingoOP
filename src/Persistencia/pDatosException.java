/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Common.cDatosException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxi
 */
public class pDatosException extends pPersistencia {
    public pDatosException() {
          super.getInstancia();
      }
         Calendar c1 = Calendar.getInstance();
        String dia = Integer.toString(c1.get(Calendar.DATE));
        String mes = Integer.toString(c1.get(Calendar.MONTH)+1);
        String annio = Integer.toString(c1.get(Calendar.YEAR));
        String Hora = Integer.toString(c1.get(Calendar.HOUR));
        String Minutos = Integer.toString(c1.get(Calendar.MINUTE));
        String Segundos = Integer.toString(c1.get(Calendar.SECOND));
        
       
        //dd-MM-yyyy hh:mm:ss
     @Override
      public void agregar(java.lang.Object o) throws Exception {
        try{
            if(Minutos.length() == 1){
                Minutos = "0" + Minutos;
            }
            if(Segundos.length() == 1){
                Segundos = "0" + Segundos;
            }
            if(dia.length() == 1){
                dia = "0" + dia;
            }
             String Fecha = annio + "-" + mes + "-" + dia + " " + Hora + ":" + Minutos  + ":" + Segundos ;
            Exception exception = (Exception)o;
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
               String insertSql="INSERT INTO logexception(eFecha,eMensaje)" +
               "VALUES( '" + Fecha + "', '" + exception.getMessage() + "')";
               
                // esto es solo para mostrar el sql que se va a ejecutar
               System.out.println(insertSql);
               // ejecuta la sentencia
               st.executeUpdate(insertSql);
               super.cerrarConexion();
        }catch(SQLException e){
            try {
                throw new cDatosException("ERROR AL INTENTAR INGRESAR la Excepcion:" + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(pDatosException.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
