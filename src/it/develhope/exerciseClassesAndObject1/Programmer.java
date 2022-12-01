package it.develhope.exerciseClassesAndObject1;

public class Programmer {

    public String name;
    public int age;
    public boolean wearGlasses;

    public String drinkCoffee (){
        return "Espresso is the secret!";
    }

    public String printDetails (){
        return name + " is a " + age + "-yo programmer";
    }

    public String hasGlasses(){
        return "Is " + name + " wearing glasses? - " + wearGlasses;
    }

    public Programmer(String name, int age, boolean wearGlasses){
        this.name = name;
        this.age = age;
        this.wearGlasses = wearGlasses;
    }
}
