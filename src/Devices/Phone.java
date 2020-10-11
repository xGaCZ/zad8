package Devices;

import Info.Human;

public class Phone extends Device
{
    private Integer number;
    private  boolean turnedOn = false;

    public Phone(String model, String producer, Integer yearOfProduction)
    {
        super(model, producer, yearOfProduction);
    }


    @Override
    public void turnOn()
    {
        turnedOn = true;
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price)
    {
        if(seller.getNumber() == this)
        {
            if(buyer.getCash() >= price)
            {
                buyer.minusCash(price);
                seller.plusCash(price);
                seller.removePhone(this);
                buyer.addPhone( this);
                System.out.println("jest komora");
            }
            else System.out.println("nie ma komory.");
        }
        else System.out.println("chyba cie na to nie stać ziomeg");
    }
}