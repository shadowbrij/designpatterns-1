package com.codewithmosh.observer;

public class Demo {
    public static void Show(){
        var stock = new Stock("NYSE:IBM", (float) 3.45);
        stock.addObserver(new StatusBar());
        stock.addObserver(new StockListView());

        stock.setPrice((float) 3.87);
    }
}
