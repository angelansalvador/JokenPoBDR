/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author anxi_
 */
public class Papel {
    
    
      public void usaPapel(int arma, String nome) {         
        switch (arma) {            
            case 1 ->
               System.out.println(nome.toUpperCase() + "ganhou!\n Papel envolve Pedra!");
            case 2 ->
                System.out.println ("Empatou!! \nDois papeis se encontram no meio do caminho!");
            case 3 ->
                System.out.println (nome.toUpperCase() + "perdeu!! \nPapel é cortado por Tesoura!");
        }

    }
    
}
