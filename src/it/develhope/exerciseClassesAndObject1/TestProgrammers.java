package it.develhope.exerciseClassesAndObject1;

public class TestProgrammers {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer("Lorenzo", 26, true);


        Programmer programmer2 = new Programmer("Luca", 30, false);


        System.out.println(programmer1.drinkCoffee());
        System.out.println(programmer1.printDetails());

        System.out.println(programmer2.printDetails());
        System.out.println(programmer2.hasGlasses());
    }
}
