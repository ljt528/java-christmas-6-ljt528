package calculation;

import java.util.List;
public class GiftMenuCalc {
    public static int giftmenucondition(List<String> menunames, List<Integer> menucounts) {
        int champagnebottle = 0;
        int overallTotal = TotalOrderAmountBeforeDiscountCalc.totalpricebeforediscount(menunames, menucounts);
        if (overallTotal >= 120000) {
            champagnebottle += 1;
        }
        return champagnebottle;
    }
}
