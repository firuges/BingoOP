/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import Common.cAdmin;
import Common.Enums;
import Common.cJugador;
import Common.cUsuario;

/**
 *
 * @author Maxi
 */
public class FabricaUsuarios{
    
    private cUsuario elUser;
    public cUsuario getFactoryInstance(String Choice){
        if(Choice.equals(String.valueOf(Enums.Gerarquia.JUGADOR))){
            cJugador unJugador = cJugador.getInstance();
            return unJugador;
        }else if(Choice.equals(String.valueOf(Enums.Gerarquia.ADMIN))){
            cAdmin unAdmin = cAdmin.getInstance();
            return unAdmin;
        }else{
            cUsuario unUser = cUsuario.getInstance();
            return unUser;
        }
        
    }
}
