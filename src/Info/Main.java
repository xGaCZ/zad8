package Info;

import Devices.Car;
import Devices.Phone;
import Info.Human;
import java.io.File;

import static Info.Human.*;

public class Main
{
    public static void main(String[] args)
    {
        Animal doggo = new Animal("Puszek", new File("somedog.jpg"), "Blablador");
        var mojfon = new Phone("nikia", "jA", 9999888);
        doggo.feed();
        doggo.goForWalk(5.0);
        var mycar = new Car("golf", "vw", 730.0, "heczbek", 1915);
        Human.setCar(mycar);

        getSalary();

        Human.setSalary(-5000);
        Human.setSalary(5000);
        getSalary();
        var expensiveCar = new Car("Aventador", "Lamborghini", 730.0, "double wishbone rear suspension", 250000.0, 2017);
        var ja = new Human("karol", "maszka", 115.0, 99999, new Phone("dobry", "ja", 2002));
        ja.setSalary(140000);
        ja.setCar(expensiveCar);
        var otherExpensiveCar = new Car("b5", "Pasat starego SA.", 151730.0, "sportbek", "gren", 2019);
        var daro = new Human("daro", otherExpensiveCar, 10000.0);
        var pszemo = new Human("pszemo", expensiveCar, 30000.0);

        System.out.println("daro: " + daro.toString() + "\ndaro: " + daro.toString());
        otherExpensiveCar.Sell(daro, pszemo, 29000.0);
        System.out.println("pszemo " + pszemo.toString() + "\ndaro: " + pszemo.toString());
    }
}
