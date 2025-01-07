/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.builder;

import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class TreeMapOfProductOrderedByAmountGroupedByCategory extends TreeMapOrderedByCategory<List<Product>>{
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        for (Map.Entry<Category,List<Product>> entry : this.entrySet()) {
            sb.append(entry.getKey().getName())
                    .append(": ")
                    .append(entry.getKey().getOrder())
                    .append(": ")
                    .append(entry.getValue().toString())
                    .append(", ");
        }

        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length()); // Rimuove l'ultima virgola e spazio
        }

        sb.append("}");
        return sb.toString();
    }
    
    
}
