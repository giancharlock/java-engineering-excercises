/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.ex4;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HP
 */
public class Palindrome {
    public String getPalindromeNumbers(int max){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=max;i++){
            if(isPalindrome(String.valueOf(i))){
                sb.append(i);
                sb.append(" ");
            }
        }
        if(sb.length()>1){
            sb.delete(sb.length()-1, sb.length());            
        }
        return sb.toString();
    }

    private boolean isPalindrome(String n) {
        StringBuffer revN = new StringBuffer(n).reverse();
        return revN.toString().equals(n);        
    }
}
