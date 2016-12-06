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
public class cCarton {
    private int Id;
    private int Filas;
    private int Columnas;
    private ArrayList[] numeros;
    private int contCompleto;
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
     * @return the Filas
     */
    public int getFilas() {
        return Filas;
    }

    /**
     * @param Filas the Filas to set
     */
    public void setFilas(int Filas) {
        this.Filas = Filas;
    }

    /**
     * @return the Columnas
     */
    public int getColumnas() {
        return Columnas;
    }

    /**
     * @param Columnas the Columnas to set
     */
    public void setColumnas(int Columnas) {
        this.Columnas = Columnas;
    }

    /**
     * @return the numeros
     */
    public ArrayList[] getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(ArrayList[] numeros) {
        this.numeros = numeros;
    }

    /**
     * @return the contCompleto
     */
    public int getContCompleto() {
        return contCompleto;
    }

    /**
     * @param contCompleto the contCompleto to set
     */
    public void setContCompleto(int contCompleto) {
        this.contCompleto = contCompleto;
    }
}
