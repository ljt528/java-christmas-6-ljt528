package ui.output;

import calculation.TotalOrderAmountBeforeDiscountCalc;

import java.text.NumberFormat;
import java.util.List;

public class TotalOrderAmountBeforeDiscountOutput {
    public static void printTotalOrderAmountBeforeDiscount(List<String> menunames, List<Integer> menucounts) {
        int overallTotal = TotalOrderAmountBeforeDiscountCalc.totalpricebeforediscount(menunames, menucounts);
        NumberFormat numberFormat = NumberFormat.getInstance();
        String totalpricebefore = numberFormat.format(overallTotal);
        System.out.println("<할인 전 총주문 금액>");
        System.out.println(totalpricebefore + "원");
        System.out.println();
    }
}
