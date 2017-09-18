package com.gaian.automation.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtility {

    public String tomorrow() {
        return currentDatePlus(1);
    }

    public String dayAfterTomorrow() {
        return currentDatePlus(2);
    }

    private String currentDatePlus(int numberOfDays) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, numberOfDays);
        return new SimpleDateFormat("dd/MM/yyyy").format(c.getTime());
    }
}
