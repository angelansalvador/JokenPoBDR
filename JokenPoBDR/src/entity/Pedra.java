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

    public void usaPedra(int arma, String nome) {
        switch (arma) {            
            case 1 ->
                System.out.println ("Empatou!\nDuas pedrinhas brincando");
            case 2 ->
               System.out.println(nome.toUpperCase() + " perdeu! \nPedra é envolvida por papel!");
            case 3 ->
                System.out.println(nome.toUpperCase() + " ganhou!! \nPedra quebra tesoura!");
        }
        
}
}
