package it.develhope.exerciseClassesAndObject1;

public class TestProgrammers {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer();
        programmer1.name = "Lorenzo";
        programmer1.age = 26;
        programmer1.wearGlasses = true;

        Programmer programmer2 = new Programmer();
        programmer2.name = "Luca";
        programmer2.age = 30;
        programmer2.wearGlasses = false;

        programmer1.drinkCoffee();
        programmer1.printDetails();

        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}
