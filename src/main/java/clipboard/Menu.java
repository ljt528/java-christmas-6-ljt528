package clipboard;

public class Menu {
    public enum APPETIZER {
        MUSHROOM_SOUP("양송이수프", 6000), TAPAS("타파스", 5500), CAESAR_SALAD("시저샐러드", 8000);

        public final String menu;
        public final Integer price;

        APPETIZER(String menu, Integer price) {
            this.menu = menu;
            this.price = price;
        }
    }

    public enum MAIN_DISH {
        T_BONE_STEAK("티본스테이크", 55000), BARBECUE_RIBS("바비큐립", 54000), SEAFOOD_PASTA("해산물파스타", 35000), CHRISTMAS_PASTA("크리스마스파스타", 25000);

        public final String menu;
        public final Integer price;

        MAIN_DISH(String menu, Integer price) {
            this.menu = menu;
            this.price = price;
        }
    }

    public enum DESSERT {
        CHOCOCAKE("초코케이크", 15000), ICECREAM("아이스크림", 5000);

        public final String menu;
        public final Integer price;

        DESSERT(String menu, Integer price) {
            this.menu = menu;
            this.price = price;
        }
    }

    public enum DRINK {
        ZERO_COKE("제로콜라", 3000), RED_WINE("레드와인", 60000), CHAMPAGNE("샴페인", 25000);

        public final String menu;
        public final Integer price;

        DRINK(String menu, Integer price) {
            this.menu = menu;
            this.price = price;
        }
    }
}