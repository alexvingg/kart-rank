package br.com.kart.rank.model;

import java.time.LocalTime;

/**
 * Created by alexcosta on 19/05/17.
 */
public class Statistics {

    private Driver driver;

    private LocalTime totalRaceTime;

    private int lapCompleted;

    private LocalTime bestLapTime;

    private Float speedAverage;

    public Statistics(Driver driver, LocalTime totalRaceTime, int lapCompleted, LocalTime bestLapTime, Float speedAverage) {
        this.driver = driver;
        this.totalRaceTime = totalRaceTime;
        this.lapCompleted = lapCompleted;
        this.bestLapTime = bestLapTime;
        this.speedAverage = speedAverage;
    }

    public LocalTime getTotalRaceTime() {
        return totalRaceTime;
    }

    public void setTotalRaceTime(LocalTime totalRaceTime) {
        this.totalRaceTime = totalRaceTime;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getLapCompleted() {
        return lapCompleted;
    }

    public void setLapCompleted(int lapCompleted) {
        this.lapCompleted = lapCompleted;
    }

    public LocalTime getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(LocalTime bestLapTime) {
        this.bestLapTime = bestLapTime;
    }

    public Float getSpeedAverage() {
        return speedAverage;
    }

    public void setSpeedAverage(Float speedAverage) {
        this.speedAverage = speedAverage;
    }
}
