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
    
    public void usaTesoura(int arma, String nome) {
 
        switch (arma) {            
            case 1 ->
                System.out.println(nome.toUpperCase() + "perdeu!\n Tesoura é quebrada por pedra!");
            case 2 ->
               System.out.println(nome.toUpperCase() + "ganhou!! \nTesoura corta papel");
            case 3 ->
               System.out.println("Empatou!! \nVamos tesourar por aí?");
        }    

    }
    
}
