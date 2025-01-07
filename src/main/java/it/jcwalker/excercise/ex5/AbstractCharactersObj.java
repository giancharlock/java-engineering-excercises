/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package it.jcwalker.excercise.ex5;

import java.util.HashMap;

/**
 *
 * @author HP
 */
public abstract class AbstractCharactersObj {
    protected final Character character;
    protected Integer val;
    
    protected static final HashMap<Character,Integer> validChars = new HashMap<>();
    
    public AbstractCharactersObj(Character obj) throws InvalidBalancedCharException{
        if(!isValid(obj)) throw new InvalidBalancedCharException();
        this.character = obj;
        this.val = validChars.get(character);
    }
    
    public boolean isValid(Character val){
        return validChars.containsKey(val);
    } 
    
    public boolean checkIfSimmetricObject(Character closeObj) {
        if((this.val > 0) && (validChars.get(closeObj)<0)){
            return (this.val+validChars.get(closeObj))==0;
        }
        return false;
    }
}
