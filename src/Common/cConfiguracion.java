/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author Ezequiel
 */
public class cConfiguracion {
    private int Id;
    private int filasCarton;
    private int columnasCarton;
    private int cartonesXJugador;
    private int valorCarton;

    /**
     * @return the filasCarton
     */
    public int getFilasCarton() {
        return filasCarton;
    }

    /**
     * @param filasCarton the filasCarton to set
     */
    public void setFilasCarton(int filasCarton) {
        this.filasCarton = filasCarton;
    }

    /**
     * @return the columnasCarton
     */
    public int getColumnasCarton() {
        return columnasCarton;
    }

    /**
     * @param columnasCarton the columnasCarton to set
     */
    public void setColumnasCarton(int columnasCarton) {
        this.columnasCarton = columnasCarton;
    }

    /**
     * @return the cartonesXJugador
     */
    public int getCartonesXJugador() {
        return cartonesXJugador;
    }

    /**
     * @param cartonesXJugador the cartonesXJugador to set
     */
    public void setCartonesXJugador(int cartonesXJugador) {
        this.cartonesXJugador = cartonesXJugador;
    }

    /**
     * @return the valorCarton
     */
    public int getValorCarton() {
        return valorCarton;
    }

    /**
     * @param valorCarton the valorCarton to set
     */
    public void setValorCarton(int valorCarton) {
        this.valorCarton = valorCarton;
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
}
