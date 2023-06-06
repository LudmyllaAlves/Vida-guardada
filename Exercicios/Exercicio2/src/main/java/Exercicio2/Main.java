/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

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
        float valorgasolina; /*variavel*/
        float valoretanois; /*variavel*/
        float media; /*variavel*/
        
        valorgasolina = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da Gasolina:")); /*ler um numero*/
        valoretanois = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do etanois:"));/*ler um numero*/
        
        media = valorgasolina / valoretanois; /*funcao*/
        
        if (valoretanois<=0.7)/*condicao*/{
            System.out.print("Abasteca no etanois"); /*imprimir*/}
        else/*condicao*/ {
            System.out.print("Abasteca na gasolina");/*imprimir*/}
    
}}
