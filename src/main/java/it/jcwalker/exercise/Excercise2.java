package it.jcwalker.exercise;

import javax.swing.event.ListSelectionEvent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 * Array 1: 123456. Array 2: 264153. Dimostrare se l’array è ordinato oppure no
 */
public class Excercise2 {

    public static void main(String[] args){
        
        int[] v1 = {1, 2, 3, 4, 5, 6, 7}; // crescente
        int[] v2 = {1, 2, 3, 4, 4, 6, 7}; // crescente
        int[] v3 = {1, 1, 1, 1, 1, 1, 1}; // uguale
        int[] v4 = {7, 6, 5, 4, 3, 2, 1}; // decrescente
        int[] v5 = {7, 6, 5, 4, 2, 2, 1}; // decrescente
        int[] v6 = {4, 6, 5, 4, 3, 2, 1}; // non ordinato
        int[] v7 = {7, 6, 5, 4, 3, 2, 8}; // non ordinato
        int[] v8 = {7, 6, 5, 8, 3, 2, 1}; // non ordinato
                
        System.out.println("Il vettore v1 è " + ((isSorted(v1)) ? "ordinato" : "non ordinato"));
        System.out.println("Il vettore v2 è " + ((isSorted(v2)) ? "ordinato" : "non ordinato"));
        System.out.println("Il vettore v3 è " + ((isSorted(v3)) ? "ordinato" : "non ordinato"));
        System.out.println("Il vettore v4 è " + ((isSorted(v4)) ? "ordinato" : "non ordinato"));
        System.out.println("Il vettore v5 è " + ((isSorted(v5)) ? "ordinato" : "non ordinato"));
        System.out.println("Il vettore v6 è " + ((isSorted(v6)) ? "ordinato" : "non ordinato"));
        System.out.println("Il vettore v7 è " + ((isSorted(v7)) ? "ordinato" : "non ordinato"));
        System.out.println("Il vettore v8 è " + ((isSorted(v8)) ? "ordinato" : "non ordinato"));
        
        
    }

    private static boolean isSorted(int[] array1) {
        boolean asc = true;
        boolean desc = true;
        for(int i=0; i<array1.length-1;i++){
            if(array1[i]<array1[i+1]){
                desc = false;
            }
            if(array1[i]>array1[i+1]){
                asc = false;
            }
        }
        return asc || desc;
    }
    
    
}
