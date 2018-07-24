/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscamina;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author MtsSk
 */
public class Vista extends JFrame{
        
    private JButton [] botonesMinas;
    private float alto, ancho;
    private final int altoVentana = 400;
    private final int anchoVentana = 400;
    
    public Vista(int altoTablero, int anchoTablero){
        
        setName("Buscaminas");
        setSize(altoVentana, anchoVentana);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);
        
        getContentPane().setPreferredSize(new Dimension(altoVentana, anchoVentana));
        
        
        mostrarBotones(altoTablero,anchoTablero);
        
        pack();
    }
    
    public void mostrarBotones(int altoTablero, int anchoTablero){
        
        System.out.println(getBounds());
        alto = getHeight()/altoTablero;
        ancho = getWidth()/anchoTablero;
        int px = 0, py = 0;
        
        botonesMinas = new JButton[altoTablero*anchoTablero];
        
        for(int i = 0; i < altoTablero*anchoTablero; i++){
            
            botonesMinas[i] = new JButton();
            botonesMinas[i].setBounds(px, py, (int)alto, (int)ancho);
            add(botonesMinas[i]);
            
            if ((i+1)%anchoTablero == 0){
                px = 0;
                System.out.println((i+1)%anchoTablero);
            }          
            else{
                px += ancho;
            }
            
            if ((i+1)%altoTablero == 0){
                py += alto;
            }            
            
        }
        
    }
    
}
