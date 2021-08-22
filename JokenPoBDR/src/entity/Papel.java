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
    
      public void usaPapel(int arma) {
        switch (arma) {
            case 1 ->
                System.out.println("Ganhou!\nFiquei enrolado!");
            case 2 ->
                System.out.println("Deu empate!! \nDois papeis se encontram no meio do caminho!");
            case 3 ->
                System.out.println("Perdeu!! \nVocê ficou em pedaços!");
        }

    }
    
}
