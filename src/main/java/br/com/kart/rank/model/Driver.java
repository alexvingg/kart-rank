package br.com.kart.rank.model;

/**
 * Created by alexcosta on 19/05/17.
 */
public class Driver {

    private String name;

    private String codDriver;

    public Driver() {
    }

    public Driver(String name, String codDriver) {
        this.codDriver = codDriver;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodDriver() {
        return codDriver;
    }

    public void setCodDriver(String codDriver) {
        this.codDriver = codDriver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        return codDriver.equals(driver.codDriver);

    }

    @Override
    public int hashCode() {
        return codDriver.hashCode();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", codDriver='" + codDriver + '\'' +
                '}';
    }
}
