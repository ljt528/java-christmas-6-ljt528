package ui.input;
import camp.nextstep.edu.missionutils.Console;

public class MenuInput {
    public static String[] customerInputMenu() {
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        return Console.readLine().split(",");
    }
}
