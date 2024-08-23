package com.codewithmosh.command;

public class SetContrastCommand extends AbstractUndoableCommand {
    private float constrast;
    private float prevConstrast;
    public SetContrastCommand(float constrast, History history, VideoEditor videoEditor) {
        super(history, videoEditor);
        this.constrast = constrast;
        prevConstrast = videoEditor.getContrast();
    }

    @Override
    protected void doExecute() {
        videoEditor.setContrast(constrast);
    }

    @Override
    public void undo() {
        videoEditor.setContrast(prevConstrast);

    }
}
