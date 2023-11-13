package clipboard;
import ui.input.MenuInput;

public class OrderMenu {
    public static void organizeorder() {
        String[] order = MenuInput.customerInputMenu();
        System.out.println(order);
    }
}
