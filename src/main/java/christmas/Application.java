package christmas;

import clipboard.OrderMenu;
import ui.input.DateInput;

import ui.output.BenefitDetailOutput;
import ui.output.GiftMenuOutput;
import ui.output.OrderMenuOutput;
import ui.output.TotalOrderAmountBeforeDiscountOutput;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        DateInput.manageinputdate();
        OrderMenu.deliverOrder();
        List<String> menuNames = OrderMenu.getMenuNames();
        List<Integer> menuCounts = OrderMenu.getMenuCounts();
        OrderMenuOutput.printMenu(menuNames, menuCounts);
        TotalOrderAmountBeforeDiscountOutput.printTotalOrderAmountBeforeDiscount(menuNames, menuCounts);
        GiftMenuOutput.printgiftmenu(menuNames, menuCounts);
        BenefitDetailOutput.printbenefitdetails(menuNames);
    }
}

