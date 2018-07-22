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
public class Tablero {
    
    private int [][] tablero;
    private int altoTablero, anchoTablero, cantidadMinas;
    
    public Tablero(int altoTablero, int anchoTablero, int cantidadMinas){
        tablero = new int [altoTablero][anchoTablero];
        this.altoTablero = altoTablero;
        this.anchoTablero = anchoTablero;
        this.cantidadMinas = cantidadMinas;
    }
    
    public void rellenarTablero(){
        
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                tablero[i][j] = 0;
            }
        }
        
    }
    
    public void mostrarTablero(){
        
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                System.out.print(tablero[i][j]+" ");
                if (j == tablero[0].length-1){
                    System.out.println("");
                }
            }
        }
        
    }
    
    public void ubicarMinas(){
        int altoRandom, anchoRandom;
        boolean comprobarLugar;
        
        for(int i = 0; i < cantidadMinas; i++){
            comprobarLugar = true;
            
            while (comprobarLugar){
                altoRandom = (int)(Math.random()*altoTablero);
                anchoRandom = (int)(Math.random()*anchoTablero);
                
                if (tablero[altoRandom][anchoRandom] == 9){
                    comprobarLugar = true;
                }
                else{
                    tablero[altoRandom][anchoRandom] = 9;
                    comprobarLugar = false;
                }
                
            }
            
        }
        
    }
    
    public void numerosTablero(){
        int contador = 0;
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                
                if (tablero[i][j] == 9){
                    
                }
                else{   
                    //Esquina superior izquierda
                    if(i == 0 && j == 0){
                        if (tablero[i][j+1] == 9){ contador++; }
                        if (tablero[i+1][j] == 9){ contador++; }
                        if (tablero[i+1][j+1] == 9){ contador++; }
                        tablero[i][j] = contador;
                        contador = 0;
                    }
                    else{
                        //Esquina superior derecha
                        if(i == 0 && j == tablero[0].length-1){
                            if (tablero[i+1][j] == 9){ contador++; }
                            if (tablero[i][j-1] == 9){ contador++; }
                            if (tablero[i+1][j-1] == 9){ contador++; }
                            tablero[i][j] = contador;
                            contador = 0;
                        }
                        else{
                            //Esquina inferior izquierda
                            if(i == tablero.length-1 && j == 0){
                                if (tablero[i][j+1] == 9){ contador++; }
                                if (tablero[i-1][j+1] == 9){ contador++; }
                                if (tablero[i-1][j] == 9){ contador++; }
                                tablero[i][j] = contador;
                                contador = 0;
                            }
                            else{
                                //Esquina inferior derecha
                                if(i == tablero.length-1 && j == tablero[0].length-1){
                                    if (tablero[i][j-1] == 9){ contador++; }
                                    if (tablero[i-1][j] == 9){ contador++; }
                                    if (tablero[i-1][j-1] == 9){ contador++; }
                                    tablero[i][j] = contador;
                                    contador = 0;
                                }
                                else{
                                    //Cuando i == 0 Y j != 0 Y j != tablero[0].length-1
                                    if(i == 0 && (j != 0 && j != tablero[0].length-1)){
                                        if (tablero[i][j+1] == 9){ contador++; }
                                        if (tablero[i][j-1] == 9){ contador++; }
                                        if (tablero[i+1][j-1] == 9){ contador++; }
                                        if (tablero[i+1][j+1] == 9){ contador++; }
                                        if (tablero[i+1][j] == 9){ contador++; }
                                        tablero[i][j] = contador;
                                        contador = 0;
                                    }
                                    else{
                                        //Cuando i == tablero[0].length-1 Y j != 0 Y j != tablero[0].length-1
                                        if (i == tablero.length-1 && (j != 0 && j != tablero[0].length-1)){
                                            if (tablero[i][j-1] == 9){ contador++; }
                                            if (tablero[i][j+1] == 9){ contador++; }
                                            if (tablero[i-1][j-1] == 9){ contador++; }
                                            if (tablero[i-1][j+1] == 9){ contador++; }
                                            if (tablero[i-1][j] == 9){ contador++; }
                                            tablero[i][j] = contador;
                                            contador = 0;
                                        }
                                        else{
                                            //Cuando j == 0 Y i != 0 Y i != tablero.length-1
                                            if (j == 0 && i != 0 && i != tablero.length-1){
                                                if (tablero[i+1][j] == 9){ contador++; }
                                                if (tablero[i-1][j] == 9){ contador++; }
                                                if (tablero[i+1][j+1] == 9){ contador++; }
                                                if (tablero[i-1][j+1] == 9){ contador++; }
                                                if (tablero[i][j+1] == 9){ contador++; }
                                                tablero[i][j] = contador;
                                                contador = 0;
                                            }
                                            else{
                                                //Cuando j == tablero[0].length Y i != 0 Y i != tablero.length-1
                                                if (j == tablero[0].length-1 && i != 0 && i != tablero.length-1){
                                                    if (tablero[i+1][j] == 9){ contador++; }
                                                    if (tablero[i-1][j] == 9){ contador++; }
                                                    if (tablero[i+1][j-1] == 9){ contador++; }
                                                    if (tablero[i-1][j-1] == 9){ contador++; }
                                                    if (tablero[i][j-1] == 9){ contador++; }
                                                    tablero[i][j] = contador;
                                                    contador = 0;
                                                }
                                                else{
                                                    //Restantes que tienen 8 lados analizables
                                                    if (tablero[i-1][j] == 9){ contador++; }
                                                    if (tablero[i-1][j+1] == 9){ contador++; }
                                                    if (tablero[i-1][j-1] == 9){ contador++; }
                                                    if (tablero[i+1][j] == 9){ contador++; }
                                                    if (tablero[i+1][j+1] == 9){ contador++; }
                                                    if (tablero[i+1][j-1] == 9){ contador++; }
                                                    if (tablero[i][j+1] == 9){ contador++; }
                                                    if (tablero[i][j-1] == 9){ contador++; }
                                                    tablero[i][j] = contador;
                                                    contador = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }                
            }
        }        
    }
    
    
    
}
