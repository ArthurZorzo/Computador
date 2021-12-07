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
public class Gabinete {
    private memoriaRam mRam;
    private Hd h;
    private Processador processador;
    private placaDeVideo pDVideo;
    
    public Gabinete(){
        mRam = new memoriaRam();
        h = new Hd();
        processador = new Processador();
        pDVideo = new placaDeVideo();
    }
    
    public Gabinete(int quantidade, int tamanho, int qtdNucleos, String modelo){
        mRam = new memoriaRam(quantidade);
        h = new Hd(tamanho);
        processador = new Processador(qtdNucleos);
        pDVideo = new placaDeVideo(modelo);
    }
    
    void imprimeGabinete(){
        System.out.println("Memoria ram: "+mRam.getQuantidade());
        System.out.println("Hd: "+h.getTamanho());
        System.out.println("Processador: "+processador.getQtdNucleos());
        System.out.println("Placa de video: "+pDVideo.getModelo());
    }
}
