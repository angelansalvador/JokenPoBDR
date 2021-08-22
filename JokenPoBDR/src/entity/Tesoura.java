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
    
          public String usaTesoura(int arma) {
  String str = null;
        switch (arma) {            
            case 1 ->
                str = ("Player 1 perdeu!\n Tesoura é quebrada por pedra!");
            case 2 ->
                str = ("Player 1 ganhou!! \nTesoura corta papel");
            case 3 ->
                str = ("Deu empate!! \nVamos tesourar por aí?");
        }
        return str;

    }
    
}
