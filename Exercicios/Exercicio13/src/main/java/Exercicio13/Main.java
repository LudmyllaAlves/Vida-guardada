/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio13;

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
        int [] numero  = new int[10];/*vetor*/
        int [] inverso = new int [10];/*vetor*/
        int i;/*variavel*/
        int n = 9;/*variavel*/
        
        for(i = 0; i <numero.length; i++)/*laco de repecao*/{
        numero [i]=Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros"));/*fazer leitura*/
            inverso [n]= numero[i];/*funcao*/
            n--;/*funcao*/
        
        }  
        for (i = 0; i <numero.length; i++)/*laco de repecao*/{
            System.out.println("numeros em sequencia:" +numero[i]);/*imprimir o resultado*/
            System.out.println(" numeros invertido:" +inverso[i]);/*imprimir o resultado*/
      }}
    }
    

