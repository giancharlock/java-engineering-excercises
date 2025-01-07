package it.jcwalker.exercise;

import java.util.Arrays;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 * Array 1: 123456. Array 2: 264153. Dimostrare se l’array è ordinato oppure no
 */
public class Excercise3 {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        
        
        String input = getInputString("Inserisci la prima stringa:");
        String input2 = getInputString("Inserisci la seconda stringa:");
        
        while(isValid(input) && isValid(input2)){
            input = filterString(input);
            input2 = filterString(input2);
            if(checkIfAnagrammi(input,input2)){
                System.out.println("Anagramma" );
            }else{
                System.out.println("NESSUN Anagramma" );
            }
            
            input = getInputString("Inserisci la prima stringa:");
            input2 = getInputString("Inserisci la seconda stringa:");
        
        }
        
        
    }
    
    private static String getInputString(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }
    
    private static String filterString(String str){
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        return str;
    }

    private static boolean checkIfAnagrammi(String filteredString1, String filteredString2){
        char[] chars1 = filteredString1.toCharArray();
        char[] chars2 = filteredString2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        if(String.valueOf(chars1).equals(String.valueOf(chars2)))
            return true;
        return false;
    }

    private static boolean isValid(String input) {
        if(input !=null && input.length()>0)
            return true;
        return false;
    }
    
}
