package com.etaTech.SortedCollections;


/****************************************************
 *** Created by Fady Fouad on 5/26/2019 at 16:51.***
 ***************************************************/
public class StockItems implements Comparable<StockItems> {
    private final String name;
    private double price;
    private int quantityStock;

    public StockItems(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if (price>0)
        this.price = price;
    }

    public void setQuantityStock(int quantityStock) {
        int newQuantity = this.quantityStock+quantityStock;
        if (newQuantity>0)
        this.quantityStock = quantityStock;
    }

    @Override
    public int compareTo(StockItems o) {
        System.out.println("StockItems -> compareTo");
        if (this==o) return 0;
        if (o!=null)
            return this.name.compareTo(o.getName());
        throw new NullPointerException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockItems that = (StockItems) o;
        String oName = that.getName();
        return this.name.equals(oName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+21;
    }

    @Override
    public String toString() {
        return "StockItems : " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityStock=" + quantityStock ;
    }
}