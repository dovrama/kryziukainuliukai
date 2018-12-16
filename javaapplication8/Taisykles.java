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
public class Taisykles extends Lentele{
    
    private int skaiciuokle = 0;
    
    public int getSkaiciuokle() {
        return skaiciuokle;
    }

    public void setSkaiciuokle(int skaiciuokle) {
        this.skaiciuokle = skaiciuokle;
    }
    
    private int eileLaimi(){
        for (int i = 0; i < lentele.length; i += 3){
            if (lentele[i] == lentele[i+1] && lentele[i+1] == lentele[i+2]){
                skaiciuokle += 1;
                System.out.println("Žaidimas baigtas!");
                lentele = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
            }  
        }
        return skaiciuokle;
    }

    private int stulpeliaiLaimi(){
        for (int i = 0; i < lentele.length/3; i++){
            if (lentele[i] == lentele[i+3] && lentele[i+3] == lentele[i+6]){
                skaiciuokle += 1;
                System.out.println("Žaidimas baigtas!");
                lentele = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
            }
        }
        return skaiciuokle;
    }

    private int istrizaineLaimi(){
        if (lentele[0] == lentele[4] && lentele[4] == lentele[8] || lentele[2] == lentele[4] && lentele[4] == lentele[6]){
            skaiciuokle += 1;
            System.out.println("Žaidimas baigtas!");
            lentele = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
        }
        return skaiciuokle;
    }
    
    private int lygiosios(){
        int counter = 0;
        for(int i = 0; i < lentele.length; i++){
            if(lentele[i] == "X" || lentele[i] == "O"){
                counter += 1;
                if(counter == lentele.length && skaiciuokle == 0){
                    skaiciuokle += 1;
                    System.out.println("Lygiosios!");
                    lentele = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
                }
            }
        }
        return skaiciuokle;
    }
    
    public void tikrinimas(){
        eileLaimi();
        stulpeliaiLaimi();
        istrizaineLaimi();
        lygiosios();
    }
}
