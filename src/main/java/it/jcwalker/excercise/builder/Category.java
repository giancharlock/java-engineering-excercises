/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.builder;

import com.sun.java.accessibility.util.TopLevelWindowListener;

/**
 *
 * @author HP
 */
public class Category implements Comparable<Category>{
    
    private final String name;
    private final Integer order;
    
    private Category(Builder builder){
        this.name = builder.name;
        this.order = builder.order;
    }
    
    public Integer getOrder(){
        return this.order;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("<")
          .append(this.getName())
          .append(", ")
          .append(this.getOrder())
          .append("> ");
        return sb.toString();
    }

    @Override
    public int compareTo(Category o) {
        return this.order.compareTo(o.order);
    }
    
        
    public static class Builder{
        private String name;
        private int order;
        
        public Builder name(String name){
            this.name = name;
            return this;
        }
        
        public Builder order(int order){
            this.order = order;
            return this;
        }
        
        public Category build(){
            return new Category(this);
        }
    }
    
}
