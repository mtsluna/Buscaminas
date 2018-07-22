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
        
//        int [][] prueba = {{1,2,3},{4,5,6}};
//        for(int i = 0; i < prueba.length; i++){
//            for(int j = 0; j < prueba[0].length; j++){
//                
//                System.out.print(prueba[i][j]+" ");
//                if (j == 2){
//                    System.out.println("");
//                }
//                
//            }
//        }
//        System.out.println(prueba[1][0]);
//        System.out.println(prueba[0].length);
        
    }
    
}
