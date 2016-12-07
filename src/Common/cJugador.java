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
    public static cJugador unJugador;//singlenton
    private ArrayList<cCarton> Cartones;
    
    private boolean ready;
    private int fichas;
    private int NroJugador;
    public cJugador(int pId,String pNombre,String pApellido,String pEmail,String pPassword, Date pFechaNacido, int pFichas, String pUserName, int pNroJugador){
        super(pId, pNombre, pApellido, pEmail, pPassword, pFechaNacido, pUserName);
        this.Cartones = new ArrayList<cCarton>();
        fichas = pFichas;
        this.NroJugador = pNroJugador;
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

    /**
     * @return the fichas
     */
    public int getFichas() {
        return fichas;
    }

    /**
     * @param fichas the fichas to set
     */
    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    /**
     * @return the ready
     */
    public boolean isReady() {
        return ready;
    }

    /**
     * @param ready the ready to set
     */
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    /**
     * @return the NroJugador
     */
    public int getNroJugador() {
        return NroJugador;
    }

    /**
     * @param NroJugador the NroJugador to set
     */
    public void setNroJugador(int NroJugador) {
        this.NroJugador = NroJugador;
    }
}
