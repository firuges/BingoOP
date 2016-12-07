/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones.Proxy;

import Dominio.dEmpresa;
import Interfase.vBingoGame;

/**
 *
 * @author Maxi
 */
public class wUsuario implements IWall {
    private dEmpresa empresa;
    @Override
    public void ejecutarProxy()
    {
        /*vBingoGame ventanaGame = new vBingoGame(empresa);
        //centra la ventana en la pantalla
        ventanaGame.setLocationRelativeTo(null);
        ventanaGame.setVisible(true);*/
    }
}
