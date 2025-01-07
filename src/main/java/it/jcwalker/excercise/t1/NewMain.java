/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.jcwalker.excercise.t1;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Order> sellList = new ArrayList<>();
        sellList.add(new Order(new BigDecimal("100.00"), 10));
        sellList.add(new Order(new BigDecimal("150.00"), 20));
        sellList.add(new Order(new BigDecimal("80.00"), 40));
        MarketMatcher mm = new MarketMatcher(sellList);
        System.out.println(mm.toString());
        mm.matchOrder(new Order(new BigDecimal("110.00"),30));
        System.out.println(mm.toString());        
    }
    
}
