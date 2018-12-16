/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Dovydas
 */
public class Lentele {
    
    String[] lentele = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    
    public void printLentele(){
        for (int i = 0; i < lentele.length; i++){
            if (i == 2 || i == 5 || i == 8){
                System.out.println(lentele[i]);
                if (i == 2 || i == 5){
                    System.out.println("-----");
                }
            } else {
                System.out.print(lentele[i] + "|");
            }
        }
    }

}
