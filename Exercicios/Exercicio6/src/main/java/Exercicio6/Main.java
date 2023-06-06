/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6;

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
        int numero; /*variavel*/
        int fatorial;/*variavel*/
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));/*fazer leitura*/
        fatorial = numero; /*funcao*/
        do /*laco de repeticao*/ {
            numero --; /*funcao*/
            fatorial= fatorial * numero ;/*funcao*/
        }
        while(numero > 1);/*laco de repeticao*/
            System.out.print("o fatorial e:" +fatorial); /*imprimir*/
    }
    
}
