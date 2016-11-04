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
    public cUsuario getFactoryInstance(Enums.Gerarquia Choice){
        String choice = Choice.toString();
        if(Choice.equals(Enums.Gerarquia.JUGADOR)){
            cJugador unJugador = (cJugador) elUser.getInstance();
            return unJugador;
        }else if(Choice.equals(Enums.Gerarquia.ADMIN)){
            cAdmin unAdmin = (cAdmin) elUser.getInstance();
            return unAdmin;
        }else{
            cUsuario unUser = elUser.getInstance();
            return unUser;
        }
        
    }
}
