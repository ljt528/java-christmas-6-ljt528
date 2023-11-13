package clipboard;
import ui.input.MenuInput;

import java.util.Arrays;

public class OrderMenu {
    public static void organizeOrder() {
        String[] order = MenuInput.customerInputMenu();
        System.out.println(Arrays.toString(order));
    }
}
