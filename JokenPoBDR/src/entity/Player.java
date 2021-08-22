/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Scanner;

/**
 *
 * @author anxi_
 */
public class Player {
    
    private String nome;
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    public int escolheArma() {
        Scanner input = new Scanner(System.in);
        int armaUser;
        do {
            System.out.println("Escolha sua arma " + this.nome.toUpperCase() + "!\n" 
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
    
    public void vamosBatalhar(int arma1, int arma2) {
                
        switch (arma1) {
            case 1:
                Pedra pedra = new Pedra();
                pedra.usaPedra(arma2, nome);
                break;

            case 2:
                Papel papel = new Papel();
                papel.usaPapel(arma2, nome);
                break;

            case 3:
                Tesoura tesoura = new Tesoura();
                tesoura.usaTesoura(arma2, nome);
                break;
        }
    }
    
    
    
    
    
}
