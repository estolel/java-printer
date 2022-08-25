package Printer;

public class PrintedOutput extends Document {
    PrintedOutput(String color, String text) {
        super(color, text);
        isPrinted = true;
    }
}