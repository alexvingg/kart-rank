import br.com.kart.rank.util.DateTimeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

/**
 * Created by alexcosta on 20/05/17.
 */
public class DateTimeUtilTest {

    @Test
    public void testFormatDateTimeHour() {
        LocalTime hourTime = DateTimeUtil.parseLocalTimeHour("23:49:08.277");

        Assert.assertEquals(hourTime.getHour(), 23);
        Assert.assertEquals(hourTime.getMinute(), 49);
        Assert.assertEquals(hourTime.getSecond(), 8);
        Assert.assertEquals(hourTime.getNano(), 277000000);

    }

    @Test
    public void testFormatDateTimeMinute() {
        LocalTime minuteTime = DateTimeUtil.parseLocalTimeMinute("1:02.852");
        Assert.assertEquals(minuteTime.getMinute(), 1);
        Assert.assertEquals(minuteTime.getSecond(), 2);
        Assert.assertEquals(minuteTime.getNano(), 852000000);
    }

    public void testFormatStringDateTime(){
        LocalTime minuteTime = DateTimeUtil.parseLocalTimeMinute("1:02.852");
        String minute = DateTimeUtil.getFormatDateTimeHour(minuteTime);
        Assert.assertEquals(minute, "1:02.852");
    }
}
