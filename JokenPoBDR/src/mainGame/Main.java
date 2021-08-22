/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGame;

import entity.Papel;
import entity.Pedra;
import entity.Tesoura; 
import java.util.Random; // para gerar escolha do computador (numero randomico)
import java.util.Scanner; // para entrada de dados

/**
 *
 * @author anxi_
 */
public class Main {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int escolha;
        String resposta;
        do {
            System.out.println("•••••••••••••••••••••••••");
            System.out.println("•••••• JokenPo ••••••");
            System.out.println("•••••••••••••••••••••••••");

            escolha = defineNJogadores();

            if (escolha == 1) {
                int armaUser1 = escolheArmaUser();
                int armaComputer = escolheArmaComputer();

                calculaVencedor(armaUser1, armaComputer);

            } else {
                int armaUser1 = escolheArmaUser();
                int armaUser2 = escolheArmaUser();

                calculaVencedor(armaUser1, armaUser2);

            }

            System.out.print("Quer jogar do novo (S ou N)?");
            resposta = input.next();
        } while (resposta.equalsIgnoreCase("S"));

    }
    
    public static int defineNJogadores() {
        int escolha;
        do {
            System.out.print("Quantos querem jogar?\n 1 ou 2 >> ");
            escolha = input.nextInt();
            if (escolha != 2 && escolha != 1) {
                System.out.println("Este jogo só pode ser jogado com 1 ou 2 pessoas. Tente Novamente!/n");
            }
        } while (escolha != 2 && escolha != 1);
        return escolha;
    }
    
     

    public static int escolheArmaUser() {
        int armaUser;
        do {
            System.out.println("Vamos lá!!\n"
                    + "Escolha sua arma!\n"
                    + "1 - Pedra\n"
                    + "2 - Papel\n"
                    + "3 - Tesoura");
            System.out.print("Sua arma será → ");
            armaUser = input.nextInt();                        

            if (armaUser > 3 || armaUser < 1) {
                System.out.println("Essa arma não existe neste mundo... Tente Novamente!");
            }

        } while (armaUser > 3 || armaUser < 1);
        return armaUser;
    }
    
    public static int escolheArmaComputer() {
        System.out.print("Boa Escolha! Eu vou de → ");
        Random rand = new Random();
        int armaComputer = rand.nextInt(3) + 1;
        System.out.println(armaComputer);
        return armaComputer;
    }
    
    public static void calculaVencedor(int arma1, int arma2) {
        switch (arma1) {
            case 1:
                Pedra pedra = new Pedra();
                pedra.usaPedra(arma2);
                break;

            case 2:
                Papel papel = new Papel();
                papel.usaPapel(arma2);
                break;

            case 3:
                Tesoura tesoura = new Tesoura();
                tesoura.usaTesoura(arma2);
                break;
        }
    }
}
