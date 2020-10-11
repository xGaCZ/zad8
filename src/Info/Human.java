package Info;

import Devices.Car;
import Devices.Phone;

public class Human implements Salleable
{
    private static double salary;
    private Phone number;
    private String name;
    private Animal pet;
    private Car car;
    private Double salary = 24550.0;
    private  Double cash;

    public Human(String nameC){name = nameC;}
    public Human(String nameC, double salary)
    {name = nameC;this.salary = salary;}
    public Human(String nameC,Animal animal)
    {
        name = nameC;
        pet = animal;
    }
    public Human(String nameC,Car car)
    {
        name = nameC;
        this.car = car;
    }
    public Human(String nameC, Car car, Animal pet)
    {
        name = nameC;
        this.car = car;
        this.pet = pet;
    }

    public  Human(String name, Car car, Double cash)
    {
        this.name = name;
        this.car = car;
        this.cash = cash;
    }

    public static Object getSalary() {
        return salary;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String nameM)
    {
        name = nameM;
    }
    public Car getCar()
    {
        return car;
    }
    public Double getCash() {return  cash;}
    public Animal getAnimal(){return  pet;}
    public void removeAnimal()
    {
        this.pet = null;
    }
    public  void addAnimal(Animal animal)
    {
        this.pet = animal;
    }
    public  void minusCash(Double toPay)
    {
        this.cash = this.cash - toPay;
    }
    public  void plusCash(Double toGet)
    {
        this.cash = this.cash + toGet;
    }
    public void removeCar(Car soldCar)
    { this.car = null;    }

    public void addCar(Car boughtCar)
    {        this.car = boughtCar;    }

    public void setCar(Car car)
    {
        if(car.getPrice() < salary)
        {
            System.out.println("nowa furka jest posiadana !");
            this.car = car;
        }
        else if(car.getPrice() <= salary * 12)
        {
            System.out.println("na kreche możesz kupić");
            this.car = car;
        }
        else
        {
            System.out.println("idz być biedakiem gdzie indziej.");
        }
    }

    public  void setSalary(double newSalary)
    {
        if(newSalary < 0)
        {
            System.out.println("sinako musi byc na +");
        }
        else
        {
            System.out.println("wypisuje informacje o tym, że nowe dane zostały wysłane do systemu księgowego ");
            System.out.println("wypisuje informację o konieczności odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("wypisuje info, że ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu ");
            this.salary = newSalary;
        }
    }

    @Override
    public String toString() {
        return "notDevices.Human{" +
                "name='" + name + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                ", cash=" + cash +
                '}';
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price)
    {
        System.out.println("niestety już nie można kupować ludzi ");
    }

    public void removePhone(Phone sold)
    {
        this.number = null;
    }

    public  void addPhone(Phone bought)
    {
        this.number = bought;
    }

    public Phone getNumber() {
        return null;
    }
}