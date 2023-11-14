package clipboard;
import ui.input.MenuInput;

import java.util.ArrayList;
import java.util.List;

public class OrderMenu {
    public static void deliverOrder() {
        String[] order = MenuInput.customerInputMenu();
        organizeOrder(order);
    }
    public static void organizeOrder(String[] order) {
        // 메뉴 확인
        List<String> menuname = new ArrayList<>();
        for (int i = 0; i < order.length; i++) {
            menuname.add(i, (order[i].substring(0, order[i].indexOf("-"))));
            System.out.println(menuname.get(i));
        }

        // 갯수 확인
        List<Integer> menucount = new ArrayList<>();
        for (int j = 0; j < order.length; j++) {
            menucount.add(j, Integer.valueOf(order[j].substring(order[j].lastIndexOf("-") + 1)));
            System.out.println(menucount.get(j));
        }
    }
}
