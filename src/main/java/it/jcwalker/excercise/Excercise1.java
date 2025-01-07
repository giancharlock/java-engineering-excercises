package it.jcwalker.excercise;

import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 * Array: «dog cat cat cow cow cow». Ricavare il numero di occorrenze per ogni elemento
 */
public class Excercise1 {
    
    

    public static void main(String[] args){
        
        String[] v1 = {"dog", "cat", "cat", "cow", "cow", "cow"};
        
        HashMap<String, Integer> list = new HashMap<>();
        for(String word: v1){
            Integer count = list.get(word);
            if(list.get(word)==null){
                list.put(word, 1);
            }else{
                list.put(word, count+1);
            }
        }
        
        for(String word: list.keySet()){
            System.out.println("Per "+word+" ci sono "+list.get(word)+ " occorrenze." );
        }
        
               
        
    }

}
