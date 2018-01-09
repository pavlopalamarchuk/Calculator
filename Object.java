package com.company;
class Toys
{
    int price;
    String brand;
    String type;
    String colour;
    String name;


    void ToyName(String newValue)
    {
        name = newValue;
    }

    void ToyPrice(int newValue)
    {
        price = newValue;
    }

    void ToyBrand(String newValue)
    {
        brand = newValue;
    }

    void ToyType(String newValue)
    {
        type = newValue;
    }

    void ToyColour(String newValue)
    {
        colour = newValue;
    }


    void printStates()
    {
        System.out.println("name:"+name+" price:"+price+" brand:"+brand+" type:"+type+" colour:"+colour);
    }



}

class ToyBear
{
    public static void main(String[] args)
    {
        Toys Ted_Bear = new Toys();
        Toys Rob_Bear = new Toys();

        Ted_Bear.ToyName("Ted");
        Ted_Bear.ToyPrice(50);
        Ted_Bear.ToyBrand("Buddy toys");
        Ted_Bear.ToyType("soft toy");
        Ted_Bear.ToyColour("brown");
        Ted_Bear.printStates();

        Rob_Bear.ToyName("Ted");
        Rob_Bear.ToyPrice(100);
        Rob_Bear.ToyBrand("Star toys");
        Rob_Bear.ToyType("hard toy");
        Rob_Bear.ToyColour("white");
        Rob_Bear.printStates();
    }
}
class ToyCar
{
    public static void main(String[] args)
    {
        Toys Ferrary = new Toys();
        Toys Ford = new Toys();

        Ferrary.ToyName("Ferarry");
        Ferrary.ToyPrice(150);
        Ferrary.ToyBrand("Hotwheels");
        Ferrary.ToyType("model toy");
        Ferrary.ToyColour("red");
        Ferrary.printStates();

        Ford.ToyName("Ford");
        Ford.ToyPrice(120);
        Ford.ToyBrand("Star toys");
        Ford.ToyType("hard toy");
        Ford.ToyColour("black");
        Ford.printStates();
    }
}

