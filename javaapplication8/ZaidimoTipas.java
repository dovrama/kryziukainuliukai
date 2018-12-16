/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Dovydas
 */
public class ZaidimoTipas extends Zaidejai{
    
    private Scanner pasirinkti = new Scanner(System.in);
    
    public void mode(){
        System.out.println("Jei norite žaisti prieš kompiuterį - spauskite 1, jei vienas prieš vieną - spauskite 2");
            int pasirinkimas = pasirinkti.nextInt();
            if (pasirinkimas == 1) {
                printLentele();
                while (getSkaiciuokle() < 1){
                    irasasX();
                    kompas();
                }   
            } else if (pasirinkimas == 2){
                printLentele();
                while (getSkaiciuokle() < 1){
                    irasasX();
                    irasasO();
                }   
            }
        setSkaiciuokle(0);
    }
}
