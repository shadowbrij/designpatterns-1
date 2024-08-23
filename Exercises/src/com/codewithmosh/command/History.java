package com.codewithmosh.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<IUndoableCommand> commands = new ArrayDeque<>();

    public void push(IUndoableCommand command){
        commands.push(command);
    }

    public IUndoableCommand pop(){
        return commands.pop();
    }

    public int size(){
        return commands.size();
    }
}
