package clipboard;

import event.ChristmasDdayDiscount;
import event.SpecialDiscount;
import event.WeekdayDiscount;
import event.WeekendDiscount;
import ui.input.DateInput;

import java.text.NumberFormat;
import java.util.List;

public class Date {
    // 크리스마스 디데이 할인
    public static void CDD() {
        ChristmasDdayDiscount.ddaydiscount();
    }

    // 평일, 주말 구분
    public static void sortday(List menunames) {
        int inputdate = DateInput.manageinputdate();
        if(inputdate % 7 >= 3 || inputdate % 7 == 0) {
            WdD(menunames);
        } else if(inputdate % 7 == 1 || inputdate % 7 == 2) {
            WeD(menunames);
        }
    }

    // 평일 할인
    public static void WdD(List menunames) {
        int inputdate = DateInput.manageinputdate();
        if(inputdate % 7 == 3) {
            System.out.println("평일 할인: " + (-WeekdayDiscount.SunWdD(menunames)) + "원");
        } else if (inputdate % 7 == 4) {
            System.out.println("평일 할인: " + (-WeekdayDiscount.MonWdD(menunames)) + "원");
        } else if (inputdate % 7 == 5) {
            System.out.println("평일 할인: " + (-WeekdayDiscount.TueWdD(menunames)) + "원");
        } else if (inputdate % 7 == 6) {
            System.out.println("평일 할인: " + (-WeekdayDiscount.WedWdD(menunames)) + "원");
        } else if (inputdate % 7 == 0) {
            System.out.println("평일 할인: " + (-WeekdayDiscount.ThuWdD(menunames)) + "원");
        }
    }

    // 주말 할인
    public static void WeD(List menunames) {
        int inputdate = DateInput.manageinputdate();
        if(inputdate % 7 == 1) {
            System.out.println("주말 할인: " + (-WeekendDiscount.FriWeD(menunames)) + "원");
        } else if (inputdate % 7 == 2) {
            System.out.println("주말 할인: " + (-WeekendDiscount.SatWeD(menunames)) + "원");
        }
    }

    // 특별 할인
    public static void SD() {
        System.out.println("특별 할인: " + (-SpecialDiscount.special()) + "원");
    }

    // 증정 이벤트
    public static void GE() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        String champagneprice = numberFormat.format(-Menu.DRINK.CHAMPAGNE.price);
        System.out.println("증정 이벤트: " + champagneprice + "원");
    }
}
