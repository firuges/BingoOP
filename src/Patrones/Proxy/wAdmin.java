/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones.Proxy;

import Dominio.dEmpresa;
import Interfase.vAdministrator;
import Interfase.vRegistro;

/**
 *
 * @author Maxi
 */
public class wAdmin implements IWall{
    private dEmpresa empresa;
    @Override
    public void ejecutarProxy()
    {
        vAdministrator ventanaPrincipal = new vAdministrator(Dominio.dEmpresa.getInstancia());
        //centra la ventana en la pantalla
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);
    }
}
