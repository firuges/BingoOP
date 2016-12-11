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
    private ArrayList<Integer> Bolillero;
    private int numeroSorteado;
    private boolean juegoActivo;
    private int cantidadCartones;
    private cJugador Ganador;
     public cJuego(){
        juegoActivo = false;
        numeroSorteado = -1;
        Pozo = 0;
        Jugadores = new ArrayList();
        Bolillero = new ArrayList();
        Ganador = new cJugador();
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

    /**
     * @return the Bolillero
     */
    public ArrayList<Integer> getBolillero() {
        return Bolillero;
    }

    /**
     * @param Bolillero the Bolillero to set
     */
    public void setBolillero(ArrayList<Integer> Bolillero) {
        this.Bolillero = Bolillero;
    }

    /**
     * @return the Ganador
     */
    public cJugador getGanador() {
        return Ganador;
    }

    /**
     * @param Ganador the Ganador to set
     */
    public void setGanador(cJugador Ganador) {
        this.Ganador = Ganador;
    }

    /**
     * @return the cantidadCartones
     */
    public int getCantidadCartones() {
        return cantidadCartones;
    }

    /**
     * @param cantidadCartones the cantidadCartones to set
     */
    public void setCantidadCartones(int cantidadCartones) {
        this.cantidadCartones = cantidadCartones;
    }
    
    
}
