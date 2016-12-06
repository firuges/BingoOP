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
    private ArrayList<cJugador> Jugadores;
    private int Pozo;
    private int[] Bolillero;
    private int numeroSorteado;
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
    public ArrayList<cJugador> getJugadores() {
        return Jugadores;
    }

    /**
     * @param Jugadores the Jugadores to set
     */
    public void setJugadores(ArrayList<cJugador> Jugadores) {
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
}
