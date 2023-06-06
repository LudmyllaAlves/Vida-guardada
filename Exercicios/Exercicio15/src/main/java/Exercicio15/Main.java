/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio15;

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
        float salario = 1500;
        double total;
        float vendas ;
        vendas = Integer.parseInt(JOptionPane.showInputDialog("valor de vendas:"));
        if(vendas <= 1500 ){
        total = 0.03 * vendas;
        total= total + salario;
         System.out.println("salario final" +total);}
       
        else if(vendas > 1500){
        total = (0.05 * (vendas - 1500))+(vendas * 0.03);
        total = total + salario;
         System.out.println("salario final" +total);}
    }
    
    
}
