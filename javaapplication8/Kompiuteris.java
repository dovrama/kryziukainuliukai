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
public class Kompiuteris extends Taisykles{
    
    public void kompas(){
        if(getSkaiciuokle() == 0){
            int counter = 0;
            int range = lentele.length;
            System.out.println("Kompiuterio eilė");
            while(counter < 1){
                int randomNr = (int)(Math.random() * range);
                if(lentele[randomNr] == "X" || lentele[randomNr] == "O"){
                    continue;
                } else {
                    lentele[randomNr] = "O";
                    counter += 1;
                    printLentele();
                    tikrinimas();
                }
            }
        }
    }
}
