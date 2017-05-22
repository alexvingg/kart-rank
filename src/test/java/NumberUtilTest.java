import br.com.kart.rank.util.NumberUtil;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;

/**
 * Created by alexcosta on 20/05/17.
 */
public class NumberUtilTest {

    @Test
    public void testFormatFloat() throws ParseException {
        Float number = NumberUtil.formatNumberFloat("44,275");
        Assert.assertEquals(number, 44.275F, 0F);
    }
}
