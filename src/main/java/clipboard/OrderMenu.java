package clipboard;

import ui.input.MenuInput;

import java.util.ArrayList;
import java.util.List;

public class OrderMenu {
    private static String[] currentorder;

    public static void deliverOrder() {
        currentorder = MenuInput.customerInputMenu();
        organizeOrder(currentorder);
    }

    public static int getOrderLength() {
        if (currentorder != null) {
            return currentorder.length;
        }
        return 0;
    }
    public static void organizeOrder(String[] order) {
        // 메뉴 확인
        List<String> menuname = new ArrayList<>();
        for (int i = 0; i < order.length; i++) {
            menuname.add(i, (order[i].substring(0, order[i].indexOf("-"))));
        }

        // 갯수 확인
        List<Integer> menucount = new ArrayList<>();
        for (int j = 0; j < order.length; j++) {
            menucount.add(j, Integer.valueOf(order[j].substring(order[j].lastIndexOf("-") + 1)));
        }
    }
    public static List<String> getMenuNames() {
        List<String> menuname = new ArrayList<>();
        for (int i = 0; i < currentorder.length; i++) {
            menuname.add(i, (currentorder[i].substring(0, currentorder[i].indexOf("-"))));
        }
        return menuname;
    }

    public static List<Integer> getMenuCounts() {
        List<Integer> menucount = new ArrayList<>();
        for (int j = 0; j < currentorder.length; j++) {
            menucount.add(j, Integer.valueOf(currentorder[j].substring(currentorder[j].lastIndexOf("-") + 1)));
        }
        return menucount;
    }
}
