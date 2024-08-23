package com.codewithmosh.command;

public interface IUndoableCommand extends ICommand {
    void undo();
}
