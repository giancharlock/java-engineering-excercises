/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.builder;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author HP
 */
public class treeMapOfTotalAmountGroupedAndOrderedByCategory extends TreeMapOrderedByCategory<Double>{
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        for (Map.Entry<Category,Double> entry : this.entrySet()) {
            sb.append(entry.getKey().getName())
                    .append(": ")
                    .append(entry.getKey().getOrder())
                    .append(": ")
                    .append(entry.getValue())
                    .append(", ");
        }

        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length()); // Rimuove l'ultima virgola e spazio
        }

        sb.append("}");
        return sb.toString();
    }
}
