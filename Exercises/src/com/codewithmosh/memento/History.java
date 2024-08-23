package com.codewithmosh.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<DocumentMemento> states = new ArrayList<DocumentMemento>();
    public void push(DocumentMemento doc){
        states.add(doc);
    }
    public DocumentMemento pop(){
        return  states.get(states.size()-1); // Check boundry condition
    }
}
