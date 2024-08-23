package com.codewithmosh.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    List<EventHandler> handlers = new ArrayList<EventHandler>();

    public void addEventHandler(EventHandler observer){ handlers.add(observer);}

    protected void notifyEventHandlers(){
        for(var handler :handlers)
            handler.handle();
    }
}
