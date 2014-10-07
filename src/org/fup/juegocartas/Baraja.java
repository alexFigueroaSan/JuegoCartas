
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fup.juegocartas;

/**
 * Representa la Baraja del Juego
 * @author Figueroa
 */
public class Baraja {
    
    private Carta miCartas[] = new Carta[52];//Composicion con carta
    
    public Baraja() {

        miCartas[0] = new Carta("A", "♦");
        miCartas[1] = new Carta("2", "♦");
        miCartas[2] = new Carta("3", "♦");
        miCartas[3] = new Carta("4", "♦");
        miCartas[4] = new Carta("5", "♦");
        miCartas[5] = new Carta("6", "♦");
        miCartas[6] = new Carta("7", "♦");
        miCartas[7] = new Carta("8", "♦");
        miCartas[8] = new Carta("9", "♦");
        miCartas[9] = new Carta("10", "♦");
        miCartas[10] = new Carta("J", "♦");
        miCartas[11] = new Carta("Q", "♦");
        miCartas[12] = new Carta("K", "♦");
        
        miCartas[13] = new Carta("A", "♣");
        miCartas[14] = new Carta("2", "♣");
        miCartas[15] = new Carta("3", "♣");
        miCartas[16] = new Carta("4", "♣");
        miCartas[17] = new Carta("5", "♣");
        miCartas[18] = new Carta("6", "♣");
        miCartas[19] = new Carta("7", "♣");
        miCartas[20] = new Carta("8", "♣");
        miCartas[21] = new Carta("9", "♣");
        miCartas[22] = new Carta("10", "♣");
        miCartas[23] = new Carta("J", "♣");
        miCartas[24] = new Carta("Q", "♣");
        miCartas[25] = new Carta("K", "♣");
        
        miCartas[26] = new Carta("A", "♥");
        miCartas[27] = new Carta("2", "♥");
        miCartas[28] = new Carta("3", "♥");
        miCartas[29] = new Carta("4", "♥");
        miCartas[30] = new Carta("5", "♥");
        miCartas[31] = new Carta("6", "♥");
        miCartas[32] = new Carta("7", "♥");
        miCartas[33] = new Carta("8", "♥");
        miCartas[34] = new Carta("9", "♥");
        miCartas[35] = new Carta("10", "♥");
        miCartas[36] = new Carta("J", "♥");
        miCartas[37] = new Carta("Q", "♥");
        miCartas[38] = new Carta("K", "♥");
        
        miCartas[39] = new Carta("A", "♠");
        miCartas[40] = new Carta("2", "♠");
        miCartas[41] = new Carta("3", "♠");
        miCartas[42] = new Carta("4", "♠");
        miCartas[43] = new Carta("5", "♠");
        miCartas[44] = new Carta("6", "♠");
        miCartas[45] = new Carta("7", "♠");
        miCartas[46] = new Carta("8", "♠");
        miCartas[47] = new Carta("9", "♠");
        miCartas[48] = new Carta("10", "♠");
        miCartas[49] = new Carta("J", "♠");
        miCartas[50] = new Carta("Q", "♠");
        miCartas[51] = new Carta("K", "♠");

    }
    /**
     * 
     * @return Arreglo de Cartas
     */
    public Carta[] getMiCartas() {
        return miCartas;
    }

    public void setMiCartas(Carta[] miCartas) {
        this.miCartas = miCartas;
    }

}
