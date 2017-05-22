package br.com.kart.rank;

import br.com.kart.rank.model.Race;
import br.com.kart.rank.model.Statistics;
import br.com.kart.rank.processor.LogProcessor;
import br.com.kart.rank.processor.RaceProcessor;
import br.com.kart.rank.util.DateTimeUtil;

import java.util.List;

/**
 * Created by alexcosta on 21/05/17.
 */
public class AppMain {

    public static void main(String[] args){

        if(args.length != 0){
            System.out.println("Error ! Please enter the path.");
        }else{
            LogProcessor lP = new LogProcessor();
            RaceProcessor rp = new RaceProcessor();
            try {
                Race race = new Race();
                race.getLapList().addAll(lP.logProcessor(args[0]));
                List<Statistics> statisticsList = rp.getRaceStatistics(race);
                System.out.println("----------------------------------------------------------------------------------");
                statisticsList.forEach(System.out::println);
                Statistics statisctBestLap = rp.getBestLapRace(statisticsList);
                System.out.println("Best Race Lap: " + DateTimeUtil.getFormatDateTimeHour(statisctBestLap.getBestLapTime())
                        + " " + statisctBestLap.getDriver().getCodDriver() + " - " + statisctBestLap.getDriver().getName());
                System.out.println("----------------------------------------------------------------------------------");
            } catch (Exception e) {
                System.out.println("Error, please check the race log.");
            }
        }
    }
}
