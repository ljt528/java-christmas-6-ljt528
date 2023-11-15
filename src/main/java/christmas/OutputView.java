package christmas;

import java.util.Locale;

public class OutputView {
    public void printMenu(Locale locale) {
        String title = MessageProvider.getMessage("menu.title", locale);
        System.out.println(title);
        // ... (메뉴 출력 부분은 그대로 유지)
    }

    public void printMessage(String message, Locale locale) {
        System.out.println(message);
    }
}