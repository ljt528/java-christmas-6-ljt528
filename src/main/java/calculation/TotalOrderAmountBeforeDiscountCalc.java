package calculation;

import static clipboard.Menu.APPETIZER.*;
import static clipboard.Menu.MAIN_DISH.*;
import static clipboard.Menu.DESSERT.*;
import static clipboard.Menu.DRINK.*;
import clipboard.OrderMenu;

import java.util.List;


public class TotalOrderAmountBeforeDiscountCalc {
    public static int appetizertotal(List menunames, List menucounts) {
        int appetizertotalprice = 0;
        int orderLength = OrderMenu.getOrderLength();
        for (int m = 0; m < orderLength; m++) {
            if (menunames.get(m).equals(MUSHROOM_SOUP.menu)) {
                appetizertotalprice += (int) menucounts.get(m) * MUSHROOM_SOUP.price;
            } else if (menunames.contains(TAPAS.menu)) {
                appetizertotalprice += (int) menucounts.get(m) * TAPAS.price;
            } else if (menunames.contains(CAESAR_SALAD.menu)) {
                appetizertotalprice += (int) menucounts.get(m) * CAESAR_SALAD.price;
            }
        }
        return appetizertotalprice;
    }
    public static int maindishtotal(List menunames, List menucounts) {
        int maindishtotalprice = 0;
        int orderLength = OrderMenu.getOrderLength();
        for (int m = 0; m < orderLength; m++) {
            if (menunames.get(m).equals(T_BONE_STEAK.menu)) {
                maindishtotalprice += (int) menucounts.get(m) * T_BONE_STEAK.price;
            } else if (menunames.contains(BARBECUE_RIBS.menu)) {
                maindishtotalprice += (int) menucounts.get(m) * BARBECUE_RIBS.price;
            } else if (menunames.contains(SEAFOOD_PASTA.menu)) {
                maindishtotalprice += (int) menucounts.get(m) * SEAFOOD_PASTA.price;
            } else if (menunames.contains(CHRISTMAS_PASTA.menu)) {
                maindishtotalprice += (int) menucounts.get(m) * CHRISTMAS_PASTA.price;
            }
        }
        return maindishtotalprice;
    }
    public static int desserttotal(List menunames, List menucounts) {
        int desserttotalprice = 0;
        int orderLength = OrderMenu.getOrderLength();
        for (int m = 0; m < orderLength; m++) {
            if (menunames.get(m).equals(CHOCOCAKE.menu)) {
                desserttotalprice += (int) menucounts.get(m) * CHOCOCAKE.price;
            } else if (menunames.contains(ICECREAM.menu)) {
                desserttotalprice += (int) menucounts.get(m) * ICECREAM.price;
            }
        }
        return desserttotalprice;
    }
    public static int drinktotal(List menunames, List menucounts) {
        int drinktotalprice = 0;
        int orderLength = OrderMenu.getOrderLength();
        for (int m = 0; m < orderLength; m++) {
            if (menunames.get(m).equals(ZERO_COKE.menu)) {
                drinktotalprice += (int) menucounts.get(m) * ZERO_COKE.price;
            } else if (menunames.contains(RED_WINE.menu)) {
                drinktotalprice += (int) menucounts.get(m) * RED_WINE.price;
            } else if (menunames.contains(CHAMPAGNE.menu)) {
                drinktotalprice += (int) menucounts.get(m) * CHAMPAGNE.price;
            }
        }
        return drinktotalprice;
    }
    public static void totalpricebeforediscount(List<String> menunames, List<Integer> menucounts) {
        // 각 카테고리 메서드를 호출하여 총 가격 계산
        int appetizerTotal = appetizertotal(menunames, menucounts);
        int mainDishTotal = maindishtotal(menunames, menucounts);
        int dessertTotal = desserttotal(menunames, menucounts);
        int drinkTotal = drinktotal(menunames, menucounts);

        // 전체 총 가격 계산
        int overallTotal = appetizerTotal + mainDishTotal + dessertTotal + drinkTotal;
        // return overallTotal;
    }
}
