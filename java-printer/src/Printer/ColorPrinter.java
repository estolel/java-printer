package Printer;

public class ColorPrinter extends Printer {
    String color;

    @Override
    public PrintedOutput print(Document document) {
        return print(document.color, document.text);
    }

    PrintedOutput print(String color, String text) {
        switch (color) {
            case "Green":
                this.color = "R: 0, G: 255, B: 0";
                break;
            case "Blue":
                this.color = "R: 0, G: 0, B: 255";
                break;
            case "Red":
                this.color = "R: 255, G: 0, B: 0";
                break;
            default:
                break;
        }
        return new PrintedOutput(this.color, text);
    }

}
