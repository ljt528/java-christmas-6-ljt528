package event;

import clipboard.Menu;

import java.util.List;
import java.util.Arrays;

public class WeekdayDiscount {
    public static void menunamechange(List menunames) {
        for (int z = 0; z < menunames.size(); z++) {
            String strhelp = (String) menunames.get(0);
            if("양송이수프".equals(strhelp)) {
                menunames.set(z, "MUSHROOM_SOUP");
            } else if("타파스".equals(strhelp)) {
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
    public static int SunWdD(List menunames) {
        WeekdayDiscount.menunamechange(menunames);
        int sundaydiscount = 0;
        for (int i = 0; i < menunames.size(); i++) {
            if(Arrays.toString(Menu.DESSERT.values()).equals(menunames.get(i))) {
                sundaydiscount += 1;
            }
        }
        return 2023 * sundaydiscount;
    }
    public static int MonWdD(List menunames) {
        WeekdayDiscount.menunamechange(menunames);
        int mondaydiscount = 0;
        for (int j = 0; j < menunames.size(); j++) {
            if(Arrays.toString(Menu.DESSERT.values()).equals(menunames.get(j))) {
                mondaydiscount += 1;
            }
        }
        return 2023 * mondaydiscount;
    }
    public static int TueWdD(List menunames) {
        WeekdayDiscount.menunamechange(menunames);
        int tuesdaydiscount = 0;
        for (int k = 0; k < menunames.size(); k++) {
            if(Arrays.toString(Menu.DESSERT.values()).equals(menunames.get(k))) {
                tuesdaydiscount += 1;
            }
        }
        return 2023 * tuesdaydiscount;
    }
    public static int WedWdD(List menunames) {
        WeekdayDiscount.menunamechange(menunames);
        int wednesdaydiscount = 0;
        for (int l = 0; l < menunames.size(); l++) {
            if(Arrays.toString(Menu.DESSERT.values()).equals(menunames.get(l))) {
                wednesdaydiscount += 1;
            }
        }
        return 2023 * wednesdaydiscount;
    }
    public static int ThuWdD(List menunames) {
        WeekdayDiscount.menunamechange(menunames);
        int thursdaydiscount = 0;
        for (int m = 0; m < menunames.size(); m++) {
            if(Arrays.toString(Menu.DESSERT.values()).equals(menunames.get(m))) {
                thursdaydiscount += 1;
            }
        }
        return 2023 * thursdaydiscount;
    }
}
