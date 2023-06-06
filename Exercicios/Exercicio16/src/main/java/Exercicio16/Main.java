/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio16;

import javax.swing.JOptionPane;

/**
 *
 * @author ADM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero  ; /*variavel*/
    
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:")); /* ler o numero*/
            
        int i; /*variavel*/
        for (i = numero; i >0; i--)/*laco de repeticao*/{
        
        System.out.print("\n ordem decrescente: " +i); /*imprimir uma mensagem*/
    }
   
            
    
    }
    
}
