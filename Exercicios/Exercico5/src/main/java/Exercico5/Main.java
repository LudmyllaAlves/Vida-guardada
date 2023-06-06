/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercico5;

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
        int idade; /*variavel*/
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));/*fazer leitura*/
        
        if (idade >4 && idade<=7)/*condicao*/{
            System.out.print("Infantil A!");/*imprimir*/
        }
        else if (idade >8 && idade<=11)/*condicao*/{
            System.out.print("Infantil B!");/*imprimir*/
        }
        else if (idade > 12 && idade <15)/*condicao*/{
            System.out.print("Juvenil A!");/*imprimir*/
        }  
        else if (idade >15 && idade<= 17)/*condicao*/{
            System.out.print("Juvenil B!");/*imprimir*/
        }
        else if (idade >18)/*condicao*/{
            System.out.print(" Adulto!");/*imprimir*/
        }
    }
    
}
