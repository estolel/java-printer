package Printer;

public class Printer {

    public PrintedOutput print(Document document) {
        return new PrintedOutput("Black", document.text);
    }
}
