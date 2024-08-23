package com.codewithmosh.command;

public class Demo {
    public static void Show(){
        var videoEdior = new VideoEditor();
        var history = new History();
        var setTextCommand = new SetTextCommand("Hello",history,videoEdior);
        setTextCommand.execute();
        System.out.println("TEXT:" + videoEdior);

        var setTextCommand2 = new SetTextCommand("Hello2",history,videoEdior);
        setTextCommand2.execute();
        System.out.println("TEXT:" + videoEdior);

        var setContrastCommand = new SetContrastCommand(14,history,videoEdior);
        setContrastCommand.execute();
        System.out.println("Contrast: "+videoEdior);

        var undoCOmmand = new UndoCommand(history);
        undoCOmmand.execute();
        System.out.println("Undo:"+videoEdior);

        undoCOmmand.execute();
        System.out.println("Undo:"+videoEdior);

        undoCOmmand.execute();
        System.out.println("Undo:"+videoEdior);
    }
}
