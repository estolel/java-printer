import Printer.ColorPrinter;
import Printer.Document;
import Printer.Printer;

public class App {
    public static void main(String[] args) throws Exception {
        Document document = new Document("Green", "AlloWorl");
        System.out.println(new Printer().print(document).color);
        System.out.println(new ColorPrinter().print(document).color);
    }
}
