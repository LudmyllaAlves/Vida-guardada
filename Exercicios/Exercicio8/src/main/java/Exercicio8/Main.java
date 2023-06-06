/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio8;

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
        
        int numero  ;/*variavel*/
        int Anterior =0;/*variavel*/
        int fibo =0;/*variavel*/
        int i; /*variavel*/
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:")); /*fazer leitura*/
        
        for(i=1; i <= numero ; i++)/*laco de repeticao*/{
        if ( i==1)/*condicao*/{
            fibo =1;
            Anterior = 0;
         
        }
        else/*condicao*/{
            fibo += Anterior;
            Anterior = fibo + Anterior;
        System.out.print("\n o n-esimo e:" +fibo);
        }}
       
   
    }
    
}
