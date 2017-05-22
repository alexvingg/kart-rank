import br.com.kart.rank.model.Lap;
import br.com.kart.rank.model.Race;
import br.com.kart.rank.model.Statistics;
import br.com.kart.rank.processor.LogProcessor;
import br.com.kart.rank.processor.RaceProcessor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.List;

/**
 * Created by alexcosta on 20/05/17.
 */
public class LogProcessorTest {

    private LogProcessor logProcessor;
    private List<Lap> lapList;

    @Before
    public void runBeforeTestMethod() throws ParseException, IOException, URISyntaxException {
        logProcessor = new LogProcessor();
        lapList = logProcessor.logProcessor("src/main/resources/rank-kart-2.txt");
    }

    @Test
    public void testLogProcessor() {
        Assert.assertEquals(lapList.get(0).getDriverLap().getName(), "F.MASSA");
    }

    @Test
    public void testLogProcessorLap() {
        Race race = new Race();
        race.getLapList().addAll(lapList);
        RaceProcessor rp = new RaceProcessor();
        List<Statistics> statisticsList = rp.getRaceStatistics(race);
        Assert.assertEquals(statisticsList.get(0).getDriver().getName(), "F.MASSA");
    }

}
