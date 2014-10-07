/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fup.juegocartas;

/**
 * Representa una carta
 * @author Figueroa
 */
public class Carta {
    
    private String valor;
    private String figura;
    
    /**
     * 
     * @param valor
     * @param figura 
     */
    public Carta(String valor, String figura) {
        this.valor = valor;
        this.figura = figura;
    }

    /**
     * 
     * @return Valor de la Carta
     */
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    /**
     * 
     * @return Figura de la Carta
     */
    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

}
