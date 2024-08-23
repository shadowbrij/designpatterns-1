package com.codewithmosh.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator<Product> ListIterator(){
    return new ListIterator(products);
  }
  private class ListIterator implements Iterator<Product>{

    private List<Product> products;
    private int index;
    public ListIterator(List<Product> products) {
      this.products = products;
    }

    @Override
    public Product getNext() {
      return products.get(products.size() -1);
    }

    @Override
    public boolean hasNext() {
      return index < products.size() -1;
    }

    @Override
    public void next() {
      index++;
    }
  }
}
