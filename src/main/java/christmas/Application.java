package christmas;

import clipboard.OrderMenu;
import ui.input.DateInput;
import ui.output.OrderMenuOutput;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        DateInput.customerInputDate();
        OrderMenu.deliverOrder();
        List<String> menuNames = OrderMenu.getMenuNames();
        List<Integer> menuCounts = OrderMenu.getMenuCounts();
        OrderMenuOutput.printMenu(menuNames, menuCounts);
    }
}
