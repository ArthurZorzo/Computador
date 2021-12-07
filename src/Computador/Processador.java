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
public class Processador {
    private int qtdNucleos;

    public Processador(){
        qtdNucleos = 2;
    }
    
    public Processador(int qtdNucleos){
        this.qtdNucleos = 3;
    }
    
    public int getQtdNucleos() {
        return qtdNucleos;
    }

    public void setQtdNucleos(int qtdNucleos) {
        this.qtdNucleos = qtdNucleos;
    }
}
