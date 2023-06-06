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
public class Media {
      int quantidade; /*variavel*/
      int media; /*variavel*/
      
      //Funcao
      void maiormenor(int numero[])
      {
          int maior; /*variavel*/
          int menor; /*variavel*/
          
        maior = numero[0];
        menor = numero[0];
          
        for (int i = 0; i<numero.length; i++){
            
        if (numero[i] < menor )/*condicao*/{
        menor = numero[i]; 
        }
        else if (numero[i] > maior)/*condicao*/{
        maior = numero[i];
        }
      }
          System.out.println("maior:" +maior);//imprimir
          System.out.println("menor" +menor);//imprimir
      }
      
      
    void media(int numero[]){
      for (int i = 0; i<numero.length; i++)/*laco de repeticao*/{
        media +=  numero[i];}
    media /= numero.length; //Apos a soma de todos, media se divide pelo "limite" do vetor 
    System.out.println("Media:"+media); //imprimir
    }
      
     
    
}
