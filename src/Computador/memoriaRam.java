/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computador;

/**
 *
 * @author IFSC
 */
public class memoriaRam {
    private int quantidade;

    public memoriaRam(){
        quantidade = 100;
    }
    
    public memoriaRam(int quantidade){
        this.quantidade = 200;
    }
    
    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}
