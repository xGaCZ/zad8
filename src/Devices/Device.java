package Devices;

import Info.Salleable;

public abstract class Device implements Salleable
{
    public final String model;
    public final String producer;
    protected Integer yearOfProduction;
    public Device(String model, String producer, Integer yearOfProduction)
    {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }
    @Override
    public String toString()
    {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
    public abstract void turnOn();
}