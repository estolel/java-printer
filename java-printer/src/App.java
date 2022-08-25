import Printer.ColorPrinter;
import Printer.Document;
import Printer.Printer;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(new Printer().print(new Document("Green", "AlloWorl")).color);
        System.out.println(new ColorPrinter().print(new Document("Green", "AlloWorl")).color);
    }
}
