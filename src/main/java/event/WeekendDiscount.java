package event;

import clipboard.Menu;

import java.util.Arrays;
import java.util.List;

public class WeekendDiscount {
    public static void menunamechange(List menunames) {
        for (int z = 0; z < menunames.size(); z++) {
            String strhelp = (String) menunames.get(0);
            if("양송이수프".equals(strhelp)) {
                menunames.set(z, "MUSHROOM_SOUP");
            } else if(("타파스").equals(strhelp)) {
                menunames.set(z, "TAPAS");
            } else if("시저샐러드".equals(strhelp)) {
                menunames.set(z, "CAESAR_SALAD");
            } else if("티본스테이크".equals(strhelp)) {
                menunames.set(z, "T_BONE_STEAK");
            } else if("바비큐립".equals(strhelp)) {
                menunames.set(z, "BARBECUE_RIBS");
            } else if("해산물파스타".equals(strhelp)) {
                menunames.set(z, "SEAFOOD_PASTA");
            } else if("크리스마스파스타".equals(strhelp)) {
                menunames.set(z, "CHRISTMAS_PASTA");
            } else if("초코케이크".equals(strhelp)) {
                menunames.set(z, "CHOCOCAKE");
            } else if("아이스크림".equals(strhelp)) {
                menunames.set(z, "ICECREAM");
            } else if("제로콜라".equals(strhelp)) {
                menunames.set(z, "ZERO_COKE");
            } else if("레드와인".equals(strhelp)) {
                menunames.set(z, "RED_WINE");
            } else if("샴페인".equals(strhelp)) {
                menunames.set(z, "CHAMPAGNE");
            }
        }
    }
    public static int FriWeD(List menunames) {
        WeekendDiscount.menunamechange(menunames);
        int fridaydiscount = 0;
        for (int n = 0; n < menunames.size(); n++) {
            if(Arrays.toString(Menu.MAIN_DISH.values()).equals(menunames.get(n))) {
                fridaydiscount += 1;
            }
        }
        return 2023 * fridaydiscount;
    }
    public static int SatWeD(List menunames) {
        WeekendDiscount.menunamechange(menunames);
        int saturdaydiscount = 0;
        for (int p = 0; p < menunames.size(); p++) {
            if(Arrays.toString(Menu.MAIN_DISH.values()).equals(menunames.get(p))) {
                saturdaydiscount += 1;
            }
        }
        return 2023 * saturdaydiscount;
    }
}
