/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fup.juegocartas;
/**
 *Representa la Mesa del Juego
 * @author Figueroa
 */
public class Mesa {

    private Jugador asientos[];
    private Dealer dealer;
    private int pozo;
    int valor;
    int valor2;
    int temp;
    int temp2;

    public Mesa(Dealer dealer) {
        this.dealer = dealer;
        asientos = new Jugador[6];
        for (int i = 0; i < asientos.length; i++) {
            asientos[i] = null;
        }
    }

    /**
     *
     * @param jugadorNuevo
     */
    public void sentarseJugador(Jugador jugadorNuevo) {
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] == null) {
                jugadorNuevo.setPos(i);
                asientos[i] = jugadorNuevo;
                break;
            }
        }
    }

    public void mostrarJugadores() {
        System.out.println("");
        System.out.print("Dealer: ");
        Carta[] cartasDelDealerEnEstaJugada = dealer.getCartas();
        for (Carta carta : cartasDelDealerEnEstaJugada) {             //Muestra la carta del Dealer
            if (carta != null) {
                System.out.print(carta.getFigura() + carta.getValor());
            }
            
        }
        System.out.println(""); 
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null) {
                System.out.print("Jug: "+asientos[i].getPos() + ", " + asientos[i].getNombre() + ", " + asientos[i].getFicha() + ",");
                Carta[] cartasEnLaManoDelJugador = asientos[i].getCartas();
                for (Carta carta : cartasEnLaManoDelJugador) {
                    if (carta != null) {                                            //Mestra Posicion, Nombre, Fichas apostadas, y Cartas del jugador 
                        System.out.print(carta.getFigura() + carta.getValor());
                    }

                }

            }
            System.out.println("");
          
        }


    }

    public void jugar() {
    }

    public void destaparCartas() {

        System.out.println("");
        Carta[] cartasDelDealerEnEstaJugada = dealer.getCartas();
        for (Carta carta : cartasDelDealerEnEstaJugada) {             //Muestra la carta del Dealer

            if (carta != null) {

                
                if (carta.getValor().contentEquals("A")) {

                    valor = 1;

                }
                


                else if (carta.getValor().contentEquals("J") || carta.getValor().contentEquals("Q") || carta.getValor().contentEquals("K")) {
                    valor = 10;

                } 
                else  {
                    temp2 = Integer.parseInt(carta.getValor());

                }

            }
        
            temp2 = temp2 + valor;

        }

        for (int i = 0; i < asientos.length; i++) {

            if (asientos[i] != null) {
                System.out.print(asientos[i].getPos() + ", " + asientos[i].getNombre() + ", " + asientos[i].getFicha() + ",");
                Carta[] cartasEnLaManoDelJugador = asientos[i].getCartas();
                for (Carta carta : cartasEnLaManoDelJugador) {
                    if (carta != null) {                                            //Mestra Posicion, Nombre, Fichas apostadas, y Cartas del jugador 

                        carta.getFigura();
                        carta.getValor();

                        if (carta.getValor().contentEquals("A")) {

                            valor2 = 1;

                        }
                        else if (carta.getValor().contentEquals("J") || carta.getValor().contentEquals("Q") || carta.getValor().contentEquals("K")) {
                            valor2 = 10;

                        } else {
                            valor2 = Integer.parseInt(carta.getValor());
                        }
                    }
                    temp = temp + valor2;
                }

            }


        }
        if (temp2 >= temp) {
            System.out.println("");
            System.out.println("El ganador es el Dealer " );

        } else {
            System.out.println("");
            System.out.println("El ganador es el jugador" );
        }

    }
}
