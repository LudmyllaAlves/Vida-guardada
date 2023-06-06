/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio10;

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
        int [] numeros = new int[10]; /*vetor*/
        int i;/*variavel*/
        numeros [0]= Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:")); /*fazer leitura*/
        int impar;/*variavel*/
        int par;/*variavel*/
       
        for (i=0; i<numeros.length ; i++)/*laco de repeticao*/{
        numeros [i]= Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:"));/*fazer leitura*/
        
        if (numeros[i]%2 ==0 ) /*condicao*/{
            par =numeros[i] /*funcao*/ ;
        System.out.print("\n numeros pares:" +par);/*imprimir*/
        }
        else /*condicao*/{
            impar = numeros[i]/*funcao*/ ;
        System.out.print(" \n numeros impares:" +impar);/*imprimir*/
       }
       }
       
        
        
    }
    
}
