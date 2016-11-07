/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones.Proxy;

import Common.Enums;
import Common.cUsuario;
import Dominio.dEmpresa;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxi
 */
public class ProxyWall implements IWall {
    dEmpresa laEmpresa = new dEmpresa();
    IWall pared;
    cUsuario usu;  
   
     public ProxyWall(cUsuario pUsu) {
      this.usu = pUsu;
     }
    @Override
    public void ejecutarProxy() {
        try {
            //Voy a buscar el Usuario haber si Existe
            usu = laEmpresa.buscarUsuario(usu);
            //chequeo que usuario voy a darle permiso
            if(usu != null && usu.QueSoy().equals(String.valueOf(Enums.Gerarquia.ADMIN)))
            {
                /// por medio del Polimorfismo ejecuto el proxy
                    pared=new wAdmin();
                    pared.ejecutarProxy();
            }else if(usu != null && usu.QueSoy().equals(String.valueOf(Enums.Gerarquia.JUGADOR))){
                    pared=new wUsuario();
                    pared.ejecutarProxy();
            }
            else
            {
                    System.out.println("El Email o la Contraseña no son correctos");
            }
        } catch (Exception ex) {
            Logger.getLogger(ProxyWall.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
