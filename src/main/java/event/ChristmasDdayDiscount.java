package event;

import ui.input.DateInput;

import java.text.NumberFormat;

public class ChristmasDdayDiscount {
    public static void ddaydiscount() {
        int inputdate = DateInput.manageinputdate();
        int christmasdiscount = 1000;
        if (inputdate <= 25) {
            christmasdiscount += (inputdate-1)*100;
        } else if (inputdate > 25) {
            christmasdiscount = 0;
        }
        NumberFormat numberFormat = NumberFormat.getInstance();
        String christmasddaydiscount = numberFormat.format(-christmasdiscount);
        System.out.println("크리스마스 디데이 할인: " + christmasddaydiscount + "원");
    }
}
