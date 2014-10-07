/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fup.juegocartas;
/**
 * Representa La Principal para la ejecucion el juego
 * @author Figueroa
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        j1.setNombre("Lucho");
        j1.setFicha(2000);
        j2.setNombre("Christiam");
        j2.setFicha(1000);

        Baraja ba = new Baraja();
        Dealer donJose = new Dealer(ba);
        donJose.mostrarCartas();
        donJose.rebolverCartas(3);
        System.out.println("");
        donJose.mostrarCartas();
        
        j1.pedirCarta(donJose.sacarCarta());
        donJose.pedirCartaD(donJose.sacarCarta());
        j1.pedirCarta(donJose.sacarCarta());
        donJose.pedirCartaD(donJose.sacarCarta());
        j2.pedirCarta(donJose.sacarCarta());
        donJose.pedirCartaD(donJose.sacarCarta());
        j2.pedirCarta(donJose.sacarCarta());
        donJose.pedirCartaD(donJose.sacarCarta());
        
        System.out.println("");
        donJose.mostrarCartas();
        
        System.out.println("");
        Mesa mesaDelComedor = new Mesa(donJose);
        mesaDelComedor.sentarseJugador(j1);
        System.out.println("");
        mesaDelComedor.sentarseJugador(j2);
        mesaDelComedor.mostrarJugadores();
        mesaDelComedor.destaparCartas();
       
        
    }
}
