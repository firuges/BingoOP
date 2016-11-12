/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Maxi
 */
public class cJugador extends cUsuario{
    public static cJugador unJugador;
    private ArrayList<cCarton> Cartones;
    public cJugador(int pId,String pNombre,String pApellido,String pEmail,String pPassword, Date pFechaNacido){
        super(pId, pNombre, pApellido, pEmail, pPassword, pFechaNacido);
        this.Cartones = new ArrayList<cCarton>();
    }
    public cJugador(){
        super();
        this.Cartones = new ArrayList<cCarton>();
    }
    
    public static cJugador  getInstance()
    {
        if(unJugador != null){
            return unJugador;
        }
        unJugador = new cJugador();
        return unJugador;
    }
    @Override
    public String QueSoy(){
        return "JUGADOR";
    }

    /**
     * @return the Cartones
     */
    public ArrayList<cCarton> getCartones() {
        return Cartones;
    }

    /**
     * @param Cartones the Cartones to set
     */
    public void setCartones(ArrayList<cCarton> Cartones) {
        this.Cartones = Cartones;
    }
}
