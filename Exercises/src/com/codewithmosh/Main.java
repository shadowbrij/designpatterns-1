package com.codewithmosh;

//import com.codewithmosh.command.Demo;
import com.codewithmosh.observer.Demo;
import com.codewithmosh.iterator.Product;
import com.codewithmosh.iterator.ProductCollection;
import com.codewithmosh.memento.Document;
import com.codewithmosh.memento.History;
import com.codewithmosh.state.BicycleTravelState;
import com.codewithmosh.state.DirectionService;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Demo.Show();

        //Iterator
//        var collections = new ProductCollection();
//        collections.add(new Product(2,"Potato"));
//        collections.add(new Product(3,"Onion"));
//
//        var iterator = collections.ListIterator();
//        while(iterator.hasNext()){
//            var item = iterator.getNext();
//            System.out.println(item.toString());
//            iterator.next();
//        }

//        //state Patter
//        var ds = new DirectionService(new BicycleTravelState());
//        ds.getDirection();
//        ds.getETA();

        //memento Pattern
//        var history = new History();
//        var document = new Document();
//        document.setFontSize(11);
//        document.setContent("Brijesh");
//        document.setFontName("Helvatica");
//        document.setFontSize(10);
//        history.push(document.createMemento());
//
//        document.setContent("Kushwaha");
//        document.setFontName("Verdana");
//        document.setFontSize(2);
//        history.push(document.createMemento());
//
//        document.setContent("Brij");
//        document.setFontName("Times New Roman");
//        document.setFontSize(23);
//        System.out.println(document.toString());
//
//        document.restore(history.pop());
//        System.out.println(document.toString());

    }
}
