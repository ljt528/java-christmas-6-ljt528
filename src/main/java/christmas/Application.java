package christmas;

import clipboard.OrderMenu;
import ui.input.DateInput;
import ui.input.MenuInput;

public class Application {
    public static void main(String[] args) {
        DateInput.customerInputDate();
        OrderMenu.organizeorder();
    }
}
