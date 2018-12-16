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
public class Zaidejai extends Kompiuteris{
    
    private Scanner ejimas = new Scanner(System.in);
    
    public void irasasX(){
        if(getSkaiciuokle() == 0){
            System.out.println("Iksai, pasirinkite kur įrašysite X: ");
            int pasirinkimas = ejimas.nextInt();
            if(lentele[pasirinkimas] == "X" || lentele[pasirinkimas] == "O"){
                System.out.println("Langelis jau užimtas!");
                irasasX();
            } else {
                lentele[pasirinkimas] = "X";
                printLentele(); 
                tikrinimas();
            }   
        }
    }
    
    public void irasasO(){
        if(getSkaiciuokle() == 0){
            System.out.println("Nuliai, pasirinkite kur įrašysite O: ");
            int pasirinkimas = ejimas.nextInt();
            if(lentele[pasirinkimas] == "X" || lentele[pasirinkimas] == "O"){
                System.out.println("Langelis jau užimtas!");
                irasasO();
            } else {
                lentele[pasirinkimas] = "O";
                printLentele();
                tikrinimas();
            }
        }
    }
    
}
