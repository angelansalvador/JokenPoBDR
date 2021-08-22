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
public class Pedra {

    public String usaPedra(int arma) {
          String str = null;
        switch (arma) {            
            case 1 ->
                str = ("Deu empate!\nDuas pedrinhas brincando");
            case 2 ->
                str = ("Player 1 perdeu! \nPedra é envolvida por papel!");
            case 3 ->
                str = ("Player 1 ganhou!! \nPedra quebra tesoura!");
        }
        return str;
}
}
