/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercico7;

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
        int contador ;
        
        for (contador= 1; contador<100; contador++){
        if(contador%7==0){
            System.out.print("\nmultiplo de sete "+contador);}
        else {
            System.out.print( "\n"+contador);}
        
        }
       
       
    }
    
}
