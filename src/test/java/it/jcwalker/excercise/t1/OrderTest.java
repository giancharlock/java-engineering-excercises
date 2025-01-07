/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package it.jcwalker.excercise.t1;

import java.math.BigDecimal;
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
public class OrderTest {
    
    public OrderTest() {
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

    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testConstructor1(){
        Order o = new Order(BigDecimal.ONE, Integer.SIZE);
        assertEquals(BigDecimal.ONE,o.getPrice());
        assertEquals(Integer.SIZE,o.getQuantity());
        assertEquals(Order.VERB.SELL,o.getVerb());
    }
    
    @Test
    public void testConstructor2(){
        Order o = new Order(BigDecimal.ONE, Integer.SIZE,Order.VERB.BUY);
        assertEquals(BigDecimal.ONE,o.getPrice());
        assertEquals(Integer.SIZE,o.getQuantity());
        assertEquals(Order.VERB.BUY,o.getVerb());
    }
    
}
