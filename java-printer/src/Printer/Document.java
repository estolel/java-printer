package Printer;

public class Document {
    public String color;
    String text;
    boolean isPrinted = false;

    public Document(String color, String text) {
        this.color = color;
        this.text = text;
    }
}