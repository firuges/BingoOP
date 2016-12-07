/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

/**
 *
 * @author Maxi
 */
public class cItemCombo {
    private int iId;
    private String iDescripcion;

    /**
     * @return the iPrecio
     */
    public int getId() {
        return iId;
    }

    /**
     * @param iPrecio the iPrecio to set
     */
    public void setId(int iPrecio) {
        this.iId = iPrecio;
    }

    /**
     * @return the iDescripcion
     */
    public String getiDescripcion() {
        return iDescripcion;
    }

    /**
     * @param iDescripcion the iDescripcion to set
     */
    public void setiDescripcion(String iDescripcion) {
        this.iDescripcion = iDescripcion;
    }
    
    public cItemCombo(int precio, String desc){
        this.iId = precio;
        this.iDescripcion = desc;
    }
    public cItemCombo(){}
    
    @Override
    public String toString() {
        return iDescripcion ;
    }
}
