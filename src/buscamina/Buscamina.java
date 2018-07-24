/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscamina;

/**
 *
 * @author MtsSk
 */
public class Buscamina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tablero tablero = new Tablero(8,8,10);
        tablero.rellenarTablero();
        tablero.mostrarTablero();
        tablero.ubicarMinas();
        System.out.println("");
        tablero.mostrarTablero();
        tablero.numerosTablero();
        System.out.println("");
        tablero.mostrarTablero();
        Vista ventana = new Vista(8,8);
        
    }
    
}
