package event;

import ui.input.DateInput;

public class SpecialDiscount {
    public static int special() {
        int specialdiscount = 0;
        int inputdate = DateInput.manageinputdate();
        if (inputdate % 7 == 3 || inputdate == 25) {
            specialdiscount += 1000;
        }

        return specialdiscount;
    }
}