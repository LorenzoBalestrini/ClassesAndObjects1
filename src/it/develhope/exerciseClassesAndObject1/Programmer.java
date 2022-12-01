package it.develhope.exerciseClassesAndObject1;

public class Programmer {

    public String name;
    public int age;
    public boolean wearGlasses;

    public static void drinkCoffee (){
        System.out.println("Espresso is the secret!");
    }

    public void printDetails (){
        System.out.println(this.name + " is a " + this.age + "-yo programmer");
    }

    public void hasGlasses(){
        System.out.println("Is " + this.name + " wearing glasses? - " + wearGlasses);
    }
}
