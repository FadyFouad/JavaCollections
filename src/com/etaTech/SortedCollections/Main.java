package com.etaTech.SortedCollections;

/****************************************************
 *** Created by Fady Fouad on 5/25/2019 at 17:32.***
 ***************************************************/
public class Main {
    public static void main(String[] args) {
        System.out.println("\n\u001B[33m ************** SORTED_COLLECTION ***************\n");

        StockItems items1 = new StockItems("Stock 1",100);
        StockItems items2 = new StockItems("Stock 2",100);
        StockItems items3 = new StockItems("Stock 3",100);
        StockList list = new StockList();
        list.addStock(items1);
        list.addStock(items2);
        list.addStock(items3);
        System.out.println(list.toString());

    }
}