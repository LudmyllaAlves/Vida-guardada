/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

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
        
        int numero;/*variavel*/
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero:")); /*fazer leitura*/
 
        if(numero%2==0)/*condicao*/{
            System.out.print("par"); /*imprimir o resultado*/}
        
        else /*condicao*/{
            System.out.print("impar"); /*imprimir o resultado*/}
    }

    }
    

