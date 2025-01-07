/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.ex4;

/**
 *
 * @author HP
 */
public class Main {  
    
    public static void main(String[] srgs){
        String expected = "0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99";
        Palindrome palindrome = new Palindrome();
        String current = palindrome.getPalindromeNumbers(100);
        if(expected.equals(current)){
            System.out.println(current);
        }else{
            System.out.println("Error");
        }
    }
    
}
