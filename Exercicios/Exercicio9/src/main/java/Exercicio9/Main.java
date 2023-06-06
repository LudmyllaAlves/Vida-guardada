/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio9;

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
        int numero1 ;/*variavel*/
        int numero2;/*variavel*/
        int resultado;/*variavel*/
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));/*ler um numero*/
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));/*ler um numero*/
          
        resultado =  numero1 + numero2; /*funcao*/
        resultado = resultado * numero1; /*funcao*/
                   
        System.out.print("O valor total e:" +resultado  ); /*imprimir o resultado*/
        }
      
    
    
}
