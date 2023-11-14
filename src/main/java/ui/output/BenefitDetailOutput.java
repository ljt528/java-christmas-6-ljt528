package ui.output;

import event.GiftEvent;

public class BenefitDetailOutput {
    public static void printbenefitdetails() {
        System.out.println("<혜택 내역>");
//        System.out.println("크리스마스 디데이 할인: " + -1,200 + "원");
//        System.out.println("평일 할인: " + -4,046 + "원");
//        System.out.println("특별 할인: " + -1,000 + "원");
        GiftEvent.gifteventdetail();
    }
}
