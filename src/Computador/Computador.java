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
public class Computador {
    public static void main(String[] args) {
        Gabinete gabinete = new Gabinete();
        Gabinete gabinete2 = new Gabinete(200, 200, 3, "Teste");
        
        System.out.println("Computador 1:");
        gabinete.imprimeGabinete();
        System.out.println("\n");
        System.out.println("Computador 2: ");
        gabinete2.imprimeGabinete();
    }
}
