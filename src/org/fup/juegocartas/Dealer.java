/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fup.juegocartas;

import java.util.Random;

/**
 * Representa al Repartidor de Cartas
 * @author Figueroa
 */
public class Dealer {

    private Baraja mazo;
    public Carta cartas[];

    /**
     * 
     * @param mazo 
     */
    public Dealer(Baraja mazo) {
        this.mazo = mazo;
        cartas = new Carta[7];
        for (int i = 0; i < 7; i++) {
            cartas[i] = null;
        }
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public Baraja getMazo() {
        return mazo;
    }

    public void setMazo(Baraja mazo) {
        this.mazo = mazo;
    }

    
    public void mostrarCartas() {
        for (int i = 0; i < mazo.getMiCartas().length; i++) {
            if (mazo.getMiCartas()[i]!= null)
                System.out.print(" " + mazo.getMiCartas()[i].getValor() + mazo.getMiCartas()[i].getFigura());
            else
                System.out.print(" _");
        }
    }
    /**
     * Representa la cantidad de veces que se baraja el mazo
     * @param n 

     */
    public void rebolverCartas(int n) {

        Carta[] arre = mazo.getMiCartas();
        int tam = arre.length;
        Random r = new Random();
        Carta temp = null;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < arre.length; i++) {
                int posAle = r.nextInt(arre.length);
                temp = arre[i];
                arre[i] = arre[posAle];
                arre[posAle] = temp;
                
                
                
            }
        }
        
    }

    public Carta sacarCarta() {
        int tam = mazo.getMiCartas().length;

        Carta[] arre = mazo.getMiCartas();
        Carta c = arre[0];
        arre[0] = null;
        Carta aux=null;
        for (int i = 1; i < arre.length; i++) {
            aux=arre[i-1];
            arre[i-1] = arre[i];
            arre[i] = aux;
        }
        mazo.setMiCartas(arre);
        return c;

    }
    
    public void pedirCartaD(Carta carta) {
        for (int i = 0; i < 7; i++) {
            if (cartas[i] == null) {
                cartas[i] = carta;
                break;
            }
        }
    }
}
