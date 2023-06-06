/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio14;

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
        Media M = new Media(); //istanciacao de classe
        
        
        M.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros:"));/*fazer leitura do numero*/
        
        int numeros[] = new int[M.quantidade]; /*vetor*/
        for (int n = 0; n<numeros.length; n++)/*laco de repeticao*/{
            numeros[n] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));/*fazer leitura do numero*/}
        int i = Integer.parseInt(JOptionPane.showInputDialog("Digite -1 para Mostrar"));/*fazer leitura do numero*/
        
        while(i == -1) /*enquanto i = a -1*/{
            System.out.println("Quantidade"+M.quantidade); /*imprimir*/
            M.maiormenor(numeros);
            M.media(numeros);
            
            i = Integer.parseInt(JOptionPane.showInputDialog("Digite -1 para Mostrar,Ou Outro para sair"));
            }
        
        
       
        }
    
}
