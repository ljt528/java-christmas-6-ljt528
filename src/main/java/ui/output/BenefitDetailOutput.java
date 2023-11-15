package ui.output;

import clipboard.Date;

import java.util.List;

public class BenefitDetailOutput {
    public static void printbenefitdetails(List menunames) {

        System.out.println("<혜택 내역>");
        Date.CDD();
        Date.sortday(menunames);
        Date.SD();
        Date.GE();
    }
}