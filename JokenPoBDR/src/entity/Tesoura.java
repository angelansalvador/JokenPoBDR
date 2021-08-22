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
public class Tesoura {
    
          public void usaTesoura(int arma) {
        switch (arma) {
            case 1 ->
                System.out.println("Perdeu!\n Ai que força... ficou toda amassada!");
            case 2 ->
                System.out.println("Ganhou!! \nOh não, fui picotado!");
            case 3 ->
                System.out.println("Deu empate!! \nOi tesoura, vamos tesourar por aí?!");            
        }

    }
    
}
