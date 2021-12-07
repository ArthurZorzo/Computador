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
public class placaDeVideo {
    private String modelo;

    public placaDeVideo(){
        modelo = "nVidia";
    }
    
    public placaDeVideo(String modelo){
        this.modelo = "Teste";
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
