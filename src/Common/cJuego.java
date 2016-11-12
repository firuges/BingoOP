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
}
