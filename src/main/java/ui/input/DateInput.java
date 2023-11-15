package ui.input;

import camp.nextstep.edu.missionutils.Console;

public class DateInput {
    private static int getinputdate = -1;
    public static int manageinputdate() {
        if (getinputdate != -1) {
            return getinputdate;
        }
        int date;
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
        String visitdate = Console.readLine();
        try {
            date = Integer.parseInt(visitdate);
            getinputdate = date;
            return date;
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
        }
        return manageinputdate();
    }
    public static int getGetinputdate() {
        return getinputdate;
    }
}
