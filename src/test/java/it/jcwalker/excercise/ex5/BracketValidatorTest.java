/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package it.jcwalker.excercise.ex5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class BracketValidatorTest {
    
    public BracketValidatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testSequenceOk()  throws InvalidBalancedCharException{
        AbstractCharactersObj[] vect = new AbstractCharactersObj[4];
        vect[0] = new BracketObj('(');
        vect[1] = new BracketObj('[');
        vect[2] = new BracketObj(']');
        vect[3] = new BracketObj(')');

        BracketValidator validator = new BracketValidatorImpl();
        assertTrue(validator.isValid(vect));        
    }

    @Test
    public void testBadSequence1() throws InvalidBalancedCharException{
        AbstractCharactersObj[] vect = new AbstractCharactersObj[5];
        vect[0] = new BracketObj('(');
        vect[1] = new BracketObj('[');
        vect[2] = new BracketObj('{');
        vect[3] = new BracketObj(']');
        vect[4] = new BracketObj(')');
            
        BracketValidator validator = new BracketValidatorImpl();
        assertFalse(validator.isValid(vect));                    
    }
    
    @Test
    public void testBadSequence() throws InvalidBalancedCharException{
        AbstractCharactersObj[] vect = new AbstractCharactersObj[4];
        vect[0] = new BracketObj('(');
        vect[1] = new BracketObj(']');
        vect[2] = new BracketObj('[');
        vect[3] = new BracketObj(')');

        BracketValidator validator = new BracketValidatorImpl();
        assertFalse(validator.isValid(vect));
    }
    
    @Test
    public void testBadSequence2()  throws InvalidBalancedCharException{
        AbstractCharactersObj[] vect = new AbstractCharactersObj[6];
        vect[0] = new BracketObj('(');
        vect[1] = new BracketObj('[');
        vect[2] = new BracketObj(']');
        vect[3] = new BracketObj('{');
        vect[4] = new BracketObj(')');
        vect[5] = new BracketObj('}');

        BracketValidator validator = new BracketValidatorImpl();
        
        assertFalse(validator.isValid(vect));
    }
    
}
