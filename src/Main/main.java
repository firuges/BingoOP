/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Dominio.dEmpresa;
import Interfase.vPrincipal;
import Interfase.vLogin;

public class main {

    public static dEmpresa empresa;

    public main() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vLogin ventanaLogin = new vLogin(Dominio.dEmpresa.getInstancia());
        //centra la ventana
        ventanaLogin.setLocationRelativeTo(null);
        //mostramos la ventana
        ventanaLogin.setVisible(true);
    }

    public dEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(dEmpresa pEmp) {
        empresa = pEmp;
    }
}
