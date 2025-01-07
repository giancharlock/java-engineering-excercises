/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.builder;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ProductList extends ArrayList<Product> {

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        for (Product entry : this) {
            sb.append(entry.getName())
                    .append(": ")
                    .append(entry.getPrice())
                    .append(": ")
                    .append(entry.getQuantity())                    
                    .append(", ");
        }

        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length()); // Rimuove l'ultima virgola e spazio
        }

        sb.append("}");
        return sb.toString();
    }

    
    
}
