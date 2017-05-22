package br.com.kart.rank.processor;

import br.com.kart.rank.AppMain;
import br.com.kart.rank.model.Driver;
import br.com.kart.rank.model.Lap;
import br.com.kart.rank.util.Constants;
import br.com.kart.rank.util.DateTimeUtil;
import br.com.kart.rank.util.NumberUtil;
import sun.rmi.runtime.Log;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by alexcosta on 20/05/17.
 */
public class LogProcessor {

    public List<Lap> logProcessor(String path) throws IOException, URISyntaxException {

        Stream<String> fileLines = Files.lines(Paths.get(path));
        List<List<String>> logLines = new ArrayList<>();
        fileLines.skip(1).forEach(line -> {
            logLines.add(Arrays.stream(line.split("[\\s]"))
                    .filter(column -> column.trim().length() > 0)
                    .map(String::trim)
                    .collect(Collectors.toList()));
        });
        return logLines.stream().map(LogProcessor::lapsProcessor).filter( lap -> lap != null).collect(Collectors.toList());
    }

    public static Lap lapsProcessor(List<String> line) {
        try {
            LocalTime hourStartLap = DateTimeUtil.parseLocalTimeHour(line.get(Constants.COLUMN_HOUR));
            Float speedAvarageLap = NumberUtil.formatNumberFloat(line.get(Constants.COLUMN_SPEED_AVERAGE));
            LocalTime timeLap = DateTimeUtil.parseLocalTimeMinute(line.get(Constants.COLUMN_LAP_TIME));
            Integer numberLap = Integer.parseInt(line.get(Constants.COLUMN_NUMBER_LAP));
            Driver driverLap = new Driver(line.get(Constants.COLUMN_DRIVER), line.get(Constants.COLUMN_NUMBER_DRIVER));
            return new Lap(hourStartLap, speedAvarageLap, timeLap, numberLap, driverLap);
        } catch (Exception e) {
            return null;
        }
    }
}
