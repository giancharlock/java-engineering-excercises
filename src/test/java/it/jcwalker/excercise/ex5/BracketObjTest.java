/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package it.jcwalker.excercise.ex5;

import jdk.jfr.Experimental;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author HP
 */
public class BracketObjTest {
    
    public BracketObjTest() {
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
    public void testOk()  throws InvalidBalancedCharException{
        assertBracketObjectOk('(',1);
        assertBracketObjectOk(')',-1);
        assertBracketObjectOk('[',2);
        assertBracketObjectOk(']',-2);
        assertBracketObjectOk('{',3);
        assertBracketObjectOk('}',-3);
    } 
    
    @Test
    public void testKo()  throws InvalidBalancedCharException{
        assertBracketObjectKo('@');        
    } 

    private void assertBracketObjectOk(Character ch,Integer val) throws InvalidBalancedCharException {
        BracketObj bo = new BracketObj(ch);
        assertNotNull(bo);
        assertEquals(ch, bo.character);
        assertEquals(val, bo.val);
    }
    
    private void assertBracketObjectKo(Character ch)  {
        
        assertThrows(InvalidBalancedCharException.class, () -> {
            BracketObj bracketObj = new BracketObj(ch);
        });
    }
    
}
