/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.util.ArrayList;

/**
 *
 * @author Maxi
 */
public class cJuego {
    private int Id;
    private ArrayList<cUsuario> Jugadores;
    private int Pozo;
    private int[] Bolillero;
    private int numeroSorteado;
    private boolean juegoActivo;
    
     public cJuego(){
        juegoActivo = false;
        numeroSorteado = -1;
        Pozo = 0;
        Jugadores = new ArrayList();
    }
    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Jugadores
     */
    public ArrayList<cUsuario> getJugadores() {
        return Jugadores;
    }

    /**
     * @param Jugadores the Jugadores to set
     */
    public void setJugadores(ArrayList<cUsuario> Jugadores) {
        this.Jugadores = Jugadores;
    }

    /**
     * @return the Pozo
     */
    public int getPozo() {
        return Pozo;
    }

    /**
     * @param Pozo the Pozo to set
     */
    public void setPozo(int Pozo) {
        this.Pozo = Pozo;
    }

    /**
     * @return the Bolillero
     */
    public int[] getBolillero() {
        return Bolillero;
    }

    /**
     * @param Bolillero the Bolillero to set
     */
    public void setBolillero(int[] Bolillero) {
        this.Bolillero = Bolillero;
    }

    /**
     * @return the numeroSorteado
     */
    public int getNumeroSorteado() {
        return numeroSorteado;
    }

    /**
     * @param numeroSorteado the numeroSorteado to set
     */
    public void setNumeroSorteado(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }

    /**
     * @return the juegoActivo
     */
    public boolean isJuegoActivo() {
        return juegoActivo;
    }

    /**
     * @param juegoActivo the juegoActivo to set
     */
    public void setJuegoActivo(boolean juegoActivo) {
        this.juegoActivo = juegoActivo;
    }
    
    
}
