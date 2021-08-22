/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anxi_
 */
public class Funcoes {
    Scanner input = new Scanner(System.in);
    
    public int defineNJogadores() {
        int escolha;
        do {
            System.out.print("Como você quer jogar?\n"
                    + "1 - Player 1 x Machine  \n"
                    + "2 - Player 1 x Player 2 \n"
                    + "→ ");
            escolha = input.nextInt();
            if (escolha != 2 && escolha != 1) {
                System.out.println("Escolha errada. Tente Novamente!/n");
            }
        } while (escolha != 2 && escolha != 1);
        return escolha;
    }
    
    public int escolheArmaComputer() {
        System.out.print("Boa Escolha! Eu vou de → ");
        Random rand = new Random();
        int armaComputer = rand.nextInt(3) + 1;
        System.out.println(armaComputer);
        return armaComputer;
    }
    

}
