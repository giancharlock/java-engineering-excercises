/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.builder;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args){
        Category cat1 = new Category.Builder().name("CAT1").order(1).build();
        Category cat2 = new Category.Builder().name("CAT2").order(2).build();
        Product p1 = new Product.Builder().name("P1").category(cat1).quantity(2).price(5.0).build();
        Product p2 = new Product.Builder().name("P2").category(cat2).quantity(10).price(2.5).build();
        Product p3 = new Product.Builder().name("P3").category(cat1).quantity(5).price(4.0).build();
        List<Product> products = Arrays.asList(p1, p2, p3);
        
        System.out.println(ProductReportManager.getInstance().getTotalAmountByCategory(products).toString());
        System.out.println(ProductReportManager.getInstance().getProductOrderedByAmountGroupedByCategory(products).toString());
    }    
    
}
