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
public class JavaApplication8 {

    private static String[] lentele = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    //private static int eile = 0;
    private static int skaiciuokle = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {   
        System.out.println("0|1|2");
        System.out.println("-----");
        System.out.println("3|4|5");
        System.out.println("-----");
        System.out.println("6|7|8");
		
        while (skaiciuokle < 1){
            irasas();
            printLentele();
            kompas();
            printLentele();
            eileLaimi();
            stulpeliaiLaimi();
            istrizaineLaimi();
        }
    }
     
    public static void irasas(){
        System.out.println("Iksai, pasirinkite kur įrašysite X: ");
        int pasirinkimas = scanner.nextInt();
        if(lentele[pasirinkimas] == "X" || lentele[pasirinkimas] == "O"){
            System.out.println("Langelis jau užimtas!");
            irasas();
        } else {
            lentele[pasirinkimas] = "X";
        }
    }
    
    public static void kompas(){
        int skaic = 0;
        int max = 8; 
        int min = 0; 
        int dydis = max - min + 1;
        System.out.println("Kompiuterio eilė");
        while(skaic < 1){
            int randomNr = (int)(Math.random() * dydis) + min;
            if(lentele[randomNr] == "X" || lentele[randomNr] == "O"){
                continue;
            } else {
                lentele[randomNr] = "O";
                skaic += 1;
            }
        }
    }
    
 /*   public static void irasas(){
        if (eile % 2 == 0){
            System.out.println("Iksai, pasirinkite kur įrašysite X: ");
            int pasirinkimas = scanner.nextInt();
            lentele[pasirinkimas] = "X";
        } else {
            System.out.println("Nuliai, pasirinkite kur įrašysite O: ");
            int pasirinkimas = scanner.nextInt();
            lentele[pasirinkimas] = "O";
        }
        eile += 1;
    }
 */       
    public static void printLentele(){
        for (int i = 0; i < 9; i++){
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

    public static int eileLaimi(){
        for (int i = 0; i < 9; i += 3){
            if (lentele[i] == lentele[i+1] && lentele[i+1] == lentele[i+2]){
                skaiciuokle += 1;
                System.out.println("Žaidimas baigtas!");
            }   
        }
        return skaiciuokle;
    }

    public static int stulpeliaiLaimi(){
        for (int i = 0; i < 3; i++){
            if (lentele[i] == lentele[i+3] && lentele[i+3] == lentele[i+6]){
                skaiciuokle += 1;
                System.out.println("Žaidimas baigtas!");
            }
        }
        return skaiciuokle;
    }

    public static int istrizaineLaimi(){
        if (lentele[0] == lentele[4] && lentele[4] == lentele[8] || lentele[2] == lentele[4] && lentele[4] == lentele[6]){
            skaiciuokle += 1;
            System.out.println("Žaidimas baigtas!");
        }
        return skaiciuokle;
    }
}