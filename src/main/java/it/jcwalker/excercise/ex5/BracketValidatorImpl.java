/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author HP
 */
public class BracketValidatorImpl implements BracketValidator{
    
    @Override
    public boolean isValid(AbstractCharactersObj[] seq){
        if (seq.length % 2 == 1) {
            return false;
        }
        List<AbstractCharactersObj> list = Arrays.asList(seq);
        var list1 = list.subList(0, list.size() / 2); // Fixed the end index here

        // Create a new list to hold the reversed elements
        List<AbstractCharactersObj> tempList = new ArrayList<>(list.subList(list.size() / 2, list.size()));
        Collections.reverse(tempList); 
        var list2 = tempList; 

        for (int i = 0; i < list.size() / 2; i++) {
            if (!list1.get(i).checkIfSimmetricObject(list2.get(i).character)) {
                return false;
            }
        }
        return true;
    }
    
}
