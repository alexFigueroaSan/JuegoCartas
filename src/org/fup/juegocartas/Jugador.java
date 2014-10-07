/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fup.juegocartas;
/**
 * Representa a un Jugador
 * @author Figueroa
 */
public class Jugador {

    public Carta cartas[];
    private int ficha;
    private int pos;
    private String nombre;

    public Jugador() {
        cartas = new Carta[7];
        for (int i = 0; i < 7; i++) {
            cartas[i] = null;
        }
    }
    
    /**
     * 
     * @return El Nombre del Jugador
     */
    public String getNombre() {
        return nombre;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }
    
    public void pedirCarta(Carta carta) {
        for (int i = 0; i < cartas.length; i++) {
            if(cartas[i]== null){
                cartas[i]=carta;
            break;
            }
            
            
        }
    }
    
   
}

