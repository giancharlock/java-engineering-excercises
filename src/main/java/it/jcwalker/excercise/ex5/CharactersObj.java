/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.ex5;

/**
 *
 * @author HP
 */
public final class CharactersObj extends AbstractCharactersObj{
        
    static{
        validChars.put('(',1);
        validChars.put(')',-1);
        validChars.put('[',2);
        validChars.put(']',-2);
        validChars.put('{',3);
        validChars.put('}',-3);
        validChars.put('^',4);
        validChars.put('$',-4);
    }
    
    public CharactersObj(Character val) throws InvalidBalancedCharException{
        super(val);
        if(!isValid(val)){
            throw new InvalidBalancedCharException();
        }        
    }
    
}
