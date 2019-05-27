package com.etaTech.SortedCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/****************************************************
 *** Created by Fady Fouad on 5/26/2019 at 17:41.***
 ***************************************************/
public class StockList {
    private final Map<String, StockItems> stockItems;

    public StockList() {
        this.stockItems = new HashMap<>();
    }

    public int addStock(StockItems item) {
        if (item != null) {
            StockItems itemInStock = stockItems.getOrDefault(item.getName(), item);
            if (itemInStock != item) {
                item.setQuantityStock(itemInStock.getQuantityStock());
            }
            stockItems.put(item.getName(), item);
            return item.getQuantityStock();
        }
        return 0;
    }

    public int sellStock(StockItems item, int quantity) {

        StockItems inStock = stockItems.getOrDefault(item, null);
        if (inStock != null && inStock.getQuantityStock() >= quantity && (quantity > 0)) {
            inStock.setQuantityStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public Map<String, StockItems> getStockItems() {
        return Collections.unmodifiableMap(stockItems);
    }

    public StockItems get(String key) {
        return stockItems.get(key);
    }

    @Override
    public String toString() {
        String s = "\n \t StockList\n";
        double totalCoast = 0.0;
        for (Map.Entry<String, StockItems> itemsEntry :
                stockItems.entrySet()) {
            s += "Name: " + itemsEntry.getValue().getName();
            s += "\tPrice: " + itemsEntry.getValue().getPrice() + "\n";
            totalCoast += itemsEntry.getValue().getPrice() * itemsEntry.getValue().getQuantityStock();
        }
        return "StockList{" +
                "stockItems=" + stockItems +
                '}' + "\n"
                + s + "\n"
                + "Total Price : " + totalCoast;
    }
}