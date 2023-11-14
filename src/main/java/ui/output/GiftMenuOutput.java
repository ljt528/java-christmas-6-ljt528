package ui.output;

import calculation.GiftMenuCalc;

import java.util.List;

import static clipboard.Menu.DRINK.*;

public class GiftMenuOutput {
    public static void printgiftmenu(List<String> menunames, List<Integer> menucounts) {
        System.out.println("<증정 메뉴>");
        System.out.println(CHAMPAGNE.menu + " " + GiftMenuCalc.giftmenucondition(menunames, menucounts) + "개");
        System.out.println();
    }
}
