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
public enum EArma {
    PEDRA(1), PAPEL(2), TESOURA(3);
    
    private final int number;
    
    EArma (int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    
    
    
    
}
