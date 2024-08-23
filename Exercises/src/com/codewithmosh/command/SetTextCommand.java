package com.codewithmosh.command;

public class SetTextCommand extends AbstractUndoableCommand  {

    private String text;

    public SetTextCommand(String text, History history, VideoEditor videoEditor) {
        super(history, videoEditor);
        this.text = text;
    }

    @Override
    protected void doExecute() {
        videoEditor.setText(text);
    }

    @Override
    public void undo() {
        videoEditor.removeText();
    }
}
