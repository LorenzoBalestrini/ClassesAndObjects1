package it.develhope.exerciseClassesAndObject1;

public class Programmer {

    public String name;
    public int age;
    public boolean wearGlasses;

    public void drinkCoffee (){
        System.out.println("Espresso is the secret!");
    }

    public String printDetails (){
        return name + " is a " + age + "-yo programmer";
    }

    public String hasGlasses(){
        return "Is " + name + " wearing glasses? - " + wearGlasses;
    }
}
