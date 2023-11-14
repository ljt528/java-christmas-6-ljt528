package event;

import calculation.TotalOrderAmountBeforeDiscountCalc;
import clipboard.Menu;

import java.text.NumberFormat;

public class GiftEvent {
    public static void gifteventdetail() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        String champagneprice = numberFormat.format(-Menu.DRINK.CHAMPAGNE.price);
        System.out.println("증정 이벤트: " + champagneprice + "원");
    }
}
