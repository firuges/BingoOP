/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Dominio.dEmpresa;
import Interfase.vAdministrator;
import Interfase.vLogin;
import Interfase.vPrincipal;

public class main {

    public static dEmpresa empresa;

    public main() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vPrincipal ventanaPrincipal = new vPrincipal(Dominio.dEmpresa.getInstancia());
        //centra la ventana
        ventanaPrincipal.setLocationRelativeTo(null);
        //mostramos la ventana
        ventanaPrincipal.setVisible(true);
    }

    public dEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(dEmpresa pEmp) {
        empresa = pEmp;
    }
}
