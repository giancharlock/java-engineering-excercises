/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.ex5;

/**
 *
 * @author HP
 */
public final class BracketObj extends AbstractCharactersObj {
    
    static{
        validChars.put('(',1);
        validChars.put(')',-1);
        validChars.put('[',2);
        validChars.put(']',-2);
        validChars.put('{',3);
        validChars.put('}',-3);        
    }
    
    public BracketObj(Character val) throws InvalidBalancedCharException{
       super(val);       
    }
        
}
