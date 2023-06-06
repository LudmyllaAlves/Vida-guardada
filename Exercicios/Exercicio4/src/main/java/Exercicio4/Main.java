/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

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
        int [] numero = new int [5];/*vetor*/
        int media = 0; /*variavel*/
        int i; /*variavel*/
        for (i=0; i<numero.length; i++) /*laco de repeticao*/{
            numero [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:")); /*fazer leitura*/
            media = media + numero[i] ; /*funcao*/
        }
            media = media / 5;/*funcao*/
        System.out.print("A media e:" +media);/*imprimir*/
         
    }
    
}
