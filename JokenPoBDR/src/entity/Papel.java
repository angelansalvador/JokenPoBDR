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
    
    
      public String usaPapel(int arma) {
          String str = null;
        switch (arma) {            
            case 1 ->
                str = ("Player 1 Ganhou!\n Papel envolve Pedra!");
            case 2 ->
                str = ("Deu empate!! \nDois papeis se encontram no meio do caminho!");
            case 3 ->
                str = ("Player 1 Perdeu!! \nPapel é cortado por Tesoura!");
        }
        return str;

    }
    
}
