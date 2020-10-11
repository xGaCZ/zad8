package Devices;

import Info.Human;

public class Car extends Device
{
    private double price;
    private String type;
    private String color;
    private  boolean turnedOn = false;
    public  Car(String model, String producer, double cena, String type, Integer yearOfProduction)
    {
        super(model, producer, yearOfProduction);
        price = cena;
        this.type = type;
    }
    public  Car(String model, String producer, double cena, String type,String color, Integer yearOfProduction)
    {
        super(model, producer, yearOfProduction);
        price = cena;
        this.type = type;
        this.color = color;
    }
    public double getPrice()
    {
        return  price;
    }
    public  void setPrice(double ncena)
    {
        price = ncena;
    }
    public String getType()
    {
        return  type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public String getColor()
    {
        return color;
    }
    @Override
    public String toString()
    {
        return "devices.Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", Cena=" + price +
                ", Nadwozie='" + type + '\'' +
                ", kolor=" + color +
                ", turned on = " + turnedOn + '\'' +
                '}';
    }
    @Override
    public void turnOn()
    {
        turnedOn = true;
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price)
    {
        if(seller.getCar() == this)
        {
            if(buyer.getCash() >= price)
            {
                buyer.minusCash(price);
                seller.plusCash(price);
                seller.removeCar(this);
                buyer.addCar(this);
                System.out.println("mamy tą fure ziom !!!");
            }
            else System.out.println("nie ma fury");
        }
        else System.out.println("chyba cie na to nie stać ziomeg");
    }
}