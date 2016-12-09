/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones.Observer;

import Common.cJuego;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author Maxi
 */
public class ClaseObservador extends Observable{
    private String accion;
    private cJuego elJuego;
    private ArrayList<Integer> sorteados;
    private Integer Sorteado;
	public ClaseObservador(){
		sorteados = new ArrayList();
	}
        
	// <editor-fold defaultstate="collapsed" desc=" Inctancia ">
    private static ClaseObservador instancia;

    public static ClaseObservador getInstancia() {
        if (instancia == null) {
            instancia = new ClaseObservador();
        }
        return instancia;
    }
// </editor-fold>
	public void setCambios(String action) {
            setAccion(action);
		setChanged();
	    notifyObservers();
	}

    /**
     * @return the accion
     */
    public String getAccion() {
        return accion;
    }

    /**
     * @param accion the accion to set
     */
    public void setAccion(String accion) {
        this.accion = accion;
    }

    /**
     * @return the elJuego
     */
    public cJuego getElJuego() {
        return elJuego;
    }

    /**
     * @param elJuego the elJuego to set
     */
    public void setElJuego(cJuego elJuego) {
        this.elJuego = elJuego;
    }

    /**
     * @return the sorteados
     */
    public ArrayList<Integer> getSorteados() {
        return sorteados;
    }

    /**
     * @param sorteados the sorteados to set
     */
    public void setSorteados(ArrayList<Integer> sorteados) {
        this.sorteados = sorteados;
    }

    /**
     * @return the numeros
     */
    public Integer getNumeros() {
        return Sorteado;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(Integer numeros) {
        this.Sorteado = numeros;
    }
}
