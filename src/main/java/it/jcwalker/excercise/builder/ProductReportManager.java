/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.jcwalker.excercise.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ProductReportManager {
    
    private static ProductReportManager instance;
    
    private ProductReportManager(){};
    
    public static ProductReportManager getInstance(){
        if(instance == null){
            instance = new ProductReportManager();                    
        }
        return instance;
    }
    
    public treeMapOfTotalAmountGroupedAndOrderedByCategory getTotalAmountByCategory(List<Product> list){
        treeMapOfTotalAmountGroupedAndOrderedByCategory result = new treeMapOfTotalAmountGroupedAndOrderedByCategory();
        list.forEach((p) -> {
            if(result.containsKey(p.getCategory())){
                Double val = result.get(p.getCategory());
                val = val + (p.getPrice()*p.getQuantity());
                result.put(p.getCategory(), val);
            }else{
                result.put(p.getCategory(), p.getPrice()*p.getQuantity());
            }
        });
        return result;
    }
    
    public TreeMapOfProductOrderedByAmountGroupedByCategory getProductOrderedByAmountGroupedByCategory(List<Product> list){
        TreeMapOfProductOrderedByAmountGroupedByCategory res = new TreeMapOfProductOrderedByAmountGroupedByCategory();
        list.forEach((p) -> {
            List<Product> val;
            if(res.containsKey(p.getCategory())){
                val = res.get(p.getCategory());                
            }else{
                val = new ArrayList<>();
            }
            val.add(p);
            val.sort(Product::compareTo);
            res.put(p.getCategory(), val);
        });
        return res;
    }
    
}
