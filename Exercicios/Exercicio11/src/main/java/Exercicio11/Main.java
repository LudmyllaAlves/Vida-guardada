/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio11;

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
        int [] numero  = new int[10];//vetor
        numero[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: ")); /*fazer leitura*/
        int maior = numero[0]; //variavel
        int menor = numero[0]; //variavel
        int i; // variavel
        
        for (i=0;i<numero.length -1;i++)// laço de repetição 
        {
        numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:"));/*fazer leitura*/
        if (numero[i]<menor )/*condicao*/{
            menor = numero[i]; /*funcao*/
        }
        else if (numero[i]> maior)/*condicao*/{
            maior = numero[i];/*funcao*/
        }}
        System.out.print("maior numero: " +maior );
        System.out.print(" \n menor numero: " +menor);
        
    }
    
}
