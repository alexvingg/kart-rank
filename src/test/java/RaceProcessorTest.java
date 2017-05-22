import br.com.kart.rank.model.Driver;
import br.com.kart.rank.model.Lap;
import br.com.kart.rank.model.Race;
import br.com.kart.rank.model.Statistics;
import br.com.kart.rank.processor.RaceProcessor;
import br.com.kart.rank.util.DateTimeUtil;
import br.com.kart.rank.util.NumberUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

/**
 * Created by alexcosta on 19/05/17.
 */
public class RaceProcessorTest {

    private Race raceMock;
    private Driver driverMassa;
    private Driver driverBarrichelo;
    private Driver driverKRaikkonen;
    private Driver driverMWebber;
    private RaceProcessor rp;
    private List<Statistics> statisticsList;

    @Before
    public void runBeforeTestMethod() throws ParseException {

        raceMock = new Race();

        driverMassa = new Driver("F.MASSA", "038");
        driverBarrichelo = new Driver("R.BARRICHELLO", "033");
        driverKRaikkonen = new Driver("K.RAIKKONEN", "002");
        driverMWebber = new Driver("M.WEBBER", "023");

        Lap lapOneMassa = new Lap(DateTimeUtil.parseLocalTimeHour("23:49:08.277"), NumberUtil.formatNumberFloat("44,275"),
                DateTimeUtil.parseLocalTimeMinute("1:02.852"), 1, driverMassa);

        Lap lapTwoMassa = new Lap(DateTimeUtil.parseLocalTimeHour("23:50:11.447"), NumberUtil.formatNumberFloat("44,053"),
                DateTimeUtil.parseLocalTimeMinute("1:03.170"), 2, driverMassa);

        Lap lapThreeMassa = new Lap(DateTimeUtil.parseLocalTimeHour("23:51:14.216"), NumberUtil.formatNumberFloat("44,334"),
                DateTimeUtil.parseLocalTimeMinute("1:02.769"), 3, driverMassa);

        Lap lapFourMassa = new Lap(DateTimeUtil.parseLocalTimeHour("23:52:17.003"), NumberUtil.formatNumberFloat("44,321"),
                DateTimeUtil.parseLocalTimeMinute("1:02.787"), 4, driverMassa);

        Lap lapOneBarrichelo = new Lap(DateTimeUtil.parseLocalTimeHour("23:49:10.858"), NumberUtil.formatNumberFloat("43,243"),
                DateTimeUtil.parseLocalTimeMinute("1:04.352"), 1, driverBarrichelo);

        Lap lapTwoBarrichelo = new Lap(DateTimeUtil.parseLocalTimeHour("23:50:14.860"), NumberUtil.formatNumberFloat("43,48"),
                DateTimeUtil.parseLocalTimeMinute("1:04.002"), 2, driverBarrichelo);

        Lap lapThreeBarrichelo = new Lap(DateTimeUtil.parseLocalTimeHour("23:51:18.576"), NumberUtil.formatNumberFloat("43,675"),
                DateTimeUtil.parseLocalTimeMinute("1:03.716"), 3, driverBarrichelo);

        Lap lapFourBarrichelo = new Lap(DateTimeUtil.parseLocalTimeHour("23:52:22.586"), NumberUtil.formatNumberFloat("43,474"),
                DateTimeUtil.parseLocalTimeMinute("1:04.010"), 4, driverBarrichelo);

        Lap lapOneKRaikonen = new Lap(DateTimeUtil.parseLocalTimeHour("23:49:11.075"), NumberUtil.formatNumberFloat("43,408"),
                DateTimeUtil.parseLocalTimeMinute("1:04.108"), 1, driverKRaikkonen);

        Lap lapTwoKRaikonen = new Lap(DateTimeUtil.parseLocalTimeHour("23:50:15.057"), NumberUtil.formatNumberFloat("43,493"),
                DateTimeUtil.parseLocalTimeMinute("1:03.982"), 2, driverKRaikkonen);

        Lap lapTwoMWeber = new Lap(DateTimeUtil.parseLocalTimeHour("23:49:12.667"), NumberUtil.formatNumberFloat("43,202"),
                DateTimeUtil.parseLocalTimeMinute("1:04.414"), 1, driverMWebber);


        raceMock.getLapList().add(lapOneMassa);
        raceMock.getLapList().add(lapOneBarrichelo);
        raceMock.getLapList().add(lapTwoMassa);
        raceMock.getLapList().add(lapTwoBarrichelo);
        raceMock.getLapList().add(lapThreeMassa);
        raceMock.getLapList().add(lapThreeBarrichelo);
        raceMock.getLapList().add(lapFourMassa);
        raceMock.getLapList().add(lapFourBarrichelo);
        raceMock.getLapList().add(lapOneKRaikonen);
        raceMock.getLapList().add(lapTwoKRaikonen);
        raceMock.getLapList().add(lapTwoMWeber);

        rp = new RaceProcessor();
        statisticsList = rp.getRaceStatistics(raceMock);
    }

    @Test
    public void testRaceWin() throws IOException {
        Assert.assertEquals(statisticsList.get(0).getDriver(), driverMassa);
    }

    @Test
    public void testBestLap(){
        Statistics statisctBestLap = rp.getBestLapRace(statisticsList);
        Assert.assertEquals(statisctBestLap.getBestLapTime(), DateTimeUtil.parseLocalTimeMinute("1:02.769"));
    }

    @Test
    public void testRaceLastPosition(){
        Assert.assertEquals(statisticsList.get(3).getDriver(), driverMWebber);
    }

}
