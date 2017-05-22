package br.com.kart.rank.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by alexcosta on 19/05/17.
 */
public class NumberUtil {

    private NumberUtil() {
    }

    public static Float formatNumberFloat(String number) throws ParseException {
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        Number numberFormated = format.parse(number);
        return numberFormated.floatValue();
    }
}
