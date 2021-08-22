
package mainGame;

import entity.Player;
import funcoes.Funcoes;
import java.util.Scanner; // para entrada de dados


public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        int escolha;
        String resposta;
        do {
            System.out.println("•••••••••••••••••••••••••");
            System.out.println("•••••• JokenPo ••••••");
            System.out.println("•••••••••••••••••••••••••");

            escolha = funcoes.defineNJogadores();
            
            // escolha Player 1 x Machine
            if (escolha == 1) {
                Player p1 = new Player();
                System.out.print("Qual é seu nome Player 1: ");
                p1.setNome(input.next());

                int armaUser1 = p1.escolheArma();
                int armaComputer = funcoes.escolheArmaComputer();

                p1.vamosBatalhar(armaUser1, armaComputer);

            // escolha Player 1 x Player 2    
            } else {
                Player p1 = new Player();
                System.out.print("Qual é seu nome Player 1: ");
                p1.setNome(input.next());
                int armaUser1 = p1.escolheArma();
                Player p2 = new Player();
                System.out.print("Qual é seu nome Player 2: ");                
                p2.setNome(input.next());
                int armaUser2 = p2.escolheArma();
                                              
                p1.vamosBatalhar(armaUser1, armaUser2);

            }

            System.out.print("Quer jogar do novo (S ou N)?");
            resposta = input.next();
        } while (resposta.equalsIgnoreCase("S"));

    }

}
