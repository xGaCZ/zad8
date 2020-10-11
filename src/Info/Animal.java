package Info;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Animal implements Salleable
{
    private String name;
    public  final String species;
    BigDecimal weigth;
    private  boolean isAlive = true;
    Animal( String nameC, String species, BigDecimal weight)
    {
        name = nameC;
        this.species = species;
        this.weigth = weight;
    }
    Animal( String nameC, String species)
    {
        name = nameC;
        this.species = species;
        if(species == "pies")
        {
            this.weigth = new BigDecimal(10.0);
        }
        else if(species == "siwnia")
        {
            this.weigth = new BigDecimal(30.0);
        }
        else
        {
            this.weigth = new BigDecimal(5.0);
        }
    }
    public String getName()
    {
        return name;
    }
    public void setName(String nameM)
    {
        name = nameM;
    }
    public  void feed()
    {
        weigth.subtract(new BigDecimal(1));
        System.out.println("pojedzone teraz waze : " + weigth);
    }
    public void goForWalk(Double distance)
    {
        while(distance > 0)
        {
            System.out.println("przeszedlismy : " + distance);
            --distance;
            weigth = weigth.subtract(new BigDecimal(1));
            weigth = weigth.setScale(2, RoundingMode.HALF_UP);
            System.out.println(weigth);
            if(!animalState()) break;
        }
        System.out.println("Moja waga: " + weigth);
    }
    public boolean animalState()
    {
        if (weigth.doubleValue() <= 0)
        {
            System.out.println("no i se umarłem elo elo 5 2 0");
            isAlive = false;
            return false;
        }
        System.out.println("zyje se ");
        return true;
    }

    @Override
        public void Sell(Human seller, Human buyer, Double price)
        {
            if(seller.getAnimal() == this)
            {
                if(buyer.getCash() >= price)
                {
                    buyer.minusCash(price);
                    seller.plusCash(price);
                    seller.removeAnimal();
                    buyer.addAnimal(this);
                    System.out.println("jest twoje wymarzone zwierze !!!!!");
                }
                else System.out.println("nie ma zwierzaka");
            }
            else System.out.println("chyba cie na to nie stać ziomeg");
        }
    }