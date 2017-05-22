package br.com.kart.rank.util;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Created by alexcosta on 19/05/17.
 */
public class DateTimeUtil {

    private DateTimeUtil() {
    }

    public static LocalTime parseLocalTimeHour(String time){
        return LocalTime.parse(time, DateTimeFormatter.ofPattern(Constants.PATERN_HOUR_DATE_TIME_FORMAT));
    }

    public static LocalTime parseLocalTimeMinute(String time){
        time = String.format("%9s", time).replace(" ", "00:0");
        return LocalTime.parse(time, DateTimeFormatter.ofPattern(Constants.PATERN_HOUR_DATE_TIME_FORMAT));
    }

    public static String getFormatDateTimeHour(LocalTime localTime){
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern(Constants.PATERN_MINUTE_DATE_TIME_FORMAT);
        return localTime.format(dtFormatter);
    }

}
