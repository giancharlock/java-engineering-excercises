/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.t1;

import java.math.BigDecimal;

/**
 *
 * @author HP
 */
public class Order {
    
    enum VERB {
        BUY,
        SELL;
    };
    
    private VERB verb;
    private BigDecimal price;
    private Integer quantity;
    
    public Order(BigDecimal price, Integer quantity, VERB verb){
        this.price = price;
        this.quantity = quantity;
        this.verb = verb;
    }
    
    /**
     * Default verb is VERB.SELL
     * @param price
     * @param quantity 
     */
    public Order(BigDecimal price, Integer quantity){
        this.price = price;
        this.quantity = quantity;
        this.verb = VERB.SELL;
    }
    
    public void setVerb(VERB verb){
        this.verb = verb;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }
    public void setQuantity(Integer qty){
        this.quantity = qty;
    }
    public VERB getVerb(){
        return this.verb;
    }
    public BigDecimal getPrice(){
        return this.price;
    }
    public Integer getQuantity(){
        return this.quantity;
    }    
}
