package com.codewithmosh.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String symbol;
    private float price;
    private List<IPriceObserver> observerList = new ArrayList<IPriceObserver>();
    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        for(var observer : observerList){
            observer.priceChanged();
        }
    }

    public void addObserver(IPriceObserver observer){
        observerList.add(observer);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }
}
