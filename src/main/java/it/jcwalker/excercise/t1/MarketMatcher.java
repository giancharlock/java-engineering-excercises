/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.t1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class MarketMatcher {
    
    private final ArrayList<Order> sellList;
    private final ArrayList<Order> soldList;
                
    public MarketMatcher(ArrayList<Order> sellList){
        this.sellList = sellList;
        orderByPrice();
        this.soldList = new ArrayList<>();
    }
    
    public ArrayList<Order> getSellList(){
        return sellList;
    }
    
    public BigDecimal getExecPrice(){
        BigDecimal execPrice = new BigDecimal("0.0");
        if(!soldList.isEmpty()){
            for(Order o: soldList){
                execPrice = execPrice.add(o.getPrice().multiply(new BigDecimal(o.getQuantity())));
            }
            execPrice = execPrice.divide(new BigDecimal(getExecQuantity().intValue()), 2, RoundingMode.FLOOR);            
        }        
        return execPrice;
    }
    
    public Integer getExecQuantity(){
        Integer quantita = 0;
        if(!soldList.isEmpty()){
            for(Order o: soldList){
                quantita += o.getQuantity();
            }            
        }
        return quantita;
    }
    
    public void matchOrder(Order order){
        for(Order o: this.sellList){
            if(o.getPrice().compareTo(order.getPrice())>0){
                continue;
            }
            Integer soldQuantity = 0;
            if(o.getQuantity().compareTo(order.getQuantity())>=0){
                soldList.add(new Order(o.getPrice(),order.getQuantity()));             
                soldQuantity = order.getQuantity();
                
            }else{
                soldList.add(new Order(o.getPrice(),o.getQuantity()));
                soldQuantity = o.getQuantity();
            }                           
            o.setQuantity(o.getQuantity()-soldQuantity);                 
            order.setQuantity(order.getQuantity()-soldQuantity);
        }
        sellList.removeIf(o -> o.getQuantity().compareTo(0)==0);
    }

    private void orderByPrice() {
        sellList.sort((o1, o2) -> {
            return o2.getPrice().compareTo(o1.getPrice());
        });
    }
    
    @Override
    public String toString(){
        StringBuilder buf = new StringBuilder();
        buf.append("Lista:").append(System.lineSeparator());
        sellList.forEach((t) -> {
            buf.append("Quantità:").append(t.getQuantity()).append(" Prezzo:").append(t.getPrice()).append(System.lineSeparator());
        });
        buf.append("Eseguito al prezzo medio:").append(getExecPrice()).append(System.lineSeparator());
        buf.append("Eseguito per la quantità:").append(getExecQuantity()).append(System.lineSeparator());
        return buf.toString();        
    }
}
