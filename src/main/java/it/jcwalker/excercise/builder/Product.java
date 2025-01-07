/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.builder;


/**
 *
 * @author HP
 */
public class Product implements Comparable<Product>{
    
    private final Category category;
    private final String name;
    private int quantity;
    private double price;   
    
    private Product(Builder builder){
        this.category = builder.category;
        this.name = builder.name;
        this.quantity = builder.quantity;
        this.price = builder.price;
    }
    
    public Category getCategory(){
        return this.category;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public void setQuantity(int qty){
        this.quantity = qty;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        if(getPrice()*getQuantity()<o.getPrice()*o.getQuantity()){
            return -1;
        }else if(getPrice()*getQuantity()<o.getPrice()*o.getQuantity()){
            return 0;
        }else{
            return 1;
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[")
            .append(this.name)
            .append(", ")
            .append(category.toString())
            .append(", ")
            .append(this.quantity)
            .append(", ")
            .append(this.price);
        sb.append("]");
        return sb.toString();
    }
    
    public static class Builder{
        private Category category;
        private String name;
        private int quantity;
        private double price;
        
        public Builder category(Category category){
            this.category = category;
            return this;
        }
        
        public Builder name(String name){
            this.name = name;
            return this;
        }
        
        public Builder quantity(int quantity){
            this.quantity = quantity;
            return this;
        }
        
        public Builder price(double price){
            this.price = price;
            return this;
        }
        
        public Product build(){
            return new Product(this);
        }
    }           
    
}
