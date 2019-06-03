package com.etaTech.SortedCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/****************************************************
 *** Created by Fady Fouad on 6/3/2019 at 14:23.***
 ***************************************************/
public class Bsket {
    private final String name ;
    private final Map<StockItems,Integer> list ;

    public Bsket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItems items , int quantity){
        if ((items!=null)&&quantity>0){
            int inBasket = list.getOrDefault(items,0);
            list.put(items,inBasket+quantity);
            return inBasket;
        }
        return 0;
    }

    public Map<StockItems,Integer>items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s= "Bsket{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}'+"\n";
        for (Map.Entry<StockItems,Integer>item:
        list.entrySet()){
            s = s+item.getKey()+" "+item.getValue()+"\n";
        }
        return s;
    }
}