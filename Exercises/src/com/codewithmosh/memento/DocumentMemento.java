package com.codewithmosh.memento;

public class DocumentMemento {
    private int fontSize;
    private String fontName;
    private String content;
    public DocumentMemento(String fontName,String content,int fontSize){
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.content = content;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getFontName() {
        return fontName;
    }

    public String getContent() {
        return content;
    }
}
