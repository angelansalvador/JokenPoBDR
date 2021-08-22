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

    public void usaPedra(int arma) {
        switch (arma) {
            case 1 ->
                System.out.println("Deu empate!\nE aí sister Pedra! Como vai a vida? Rolando bem?");
            case 2 ->
                System.out.println("Perdeu!! \nPapel é leve mas me envolve tão bem!");
            case 3 ->
                System.out.println("Ganhou!! \nHaha... quebrei sua tesoura!");
        }

    }
}
