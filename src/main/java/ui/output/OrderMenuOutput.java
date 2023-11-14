package ui.output;

import clipboard.OrderMenu;

import java.util.List;

public class OrderMenuOutput {
    public static void printMenu(List menuname, List menucount) {
        System.out.println("12월 3일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
        System.out.println();
        System.out.println("<주문 메뉴>");
        int orderLength = OrderMenu.getOrderLength();
        for (int k = 0; k < orderLength; k++) {
            System.out.println(menuname.get(k) + " " + menucount.get(k) + "개");
        }
        System.out.println();
    }
}
