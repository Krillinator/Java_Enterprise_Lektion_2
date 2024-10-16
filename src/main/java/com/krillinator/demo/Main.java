package com.krillinator.demo;

import com.krillinator.demo.zoo.*;

public class Main {
    public static void main(String[] args) {


        /* Important */
        // Override Equals & Hash for a thorough, concise and clear implementation
        Student benny = new Student("benny"); // No ToString() override

        System.out.println(benny); // DEFAULT FUNC: Result = Memory Address


        // TODO - Test Equals Function
        Student student = new Student("Benny");
        Student2 student2 = new Student2("Benny");
        Student test1 = new Student("");
        Student test2 = new Student("");
        NormalStudent normalStudent1 = new NormalStudent("");
        NormalStudent normalStudent2 = new NormalStudent("");

        // WITH OVERRIDE
        System.out.println("---DEBUGGING---");
        System.out.println(test1.equals(test2));    // TRUE
        System.out.println(test2.equals(test1));    // TRUE
        System.out.println("---DEBUGGING---");

        // WITHOUT OVERRIDE
        System.out.println("---DEBUGGING W/O Override---");
        System.out.println(normalStudent1.equals(normalStudent2));    // FALSE
        System.out.println(normalStudent2.equals(normalStudent1));    // FALSE
        System.out.println("---DEBUGGING W/O Override---");

        System.out.println(student.equals(student2));   // TRUE, A: False
        System.out.println(student2.equals(student));   // TRUE, A: False
        System.out.println(student.equals(student));    // TRUE, A: True


        // TODO - Experiment 2 - Override
        Student frida = new Student("Frida");
        Student lennart = new Student("Lennart");

        System.out.println(frida.equals(lennart));  // Checks for name as well! FALSE

        // TODO - EXPERIMENT 3 - Records
        Student2 rLennart = new Student2("Thomas");
        Student2 rThomas = new Student2("Thomas");

        System.out.println("---Experiment 3---");
        System.out.println(rLennart.equals(rThomas));

        // TODO - EXPERIMENT 4 - Records (different names)
        Student2 rBenny = new Student2("Benny");
        Student2 rFrida = new Student2("Frida");

        System.out.println("---Experiment 4---");
        System.out.println(rBenny.equals(rFrida));






    }

    public static void handleAnimal(IAnimal animal) {

        // Instantiate AFTER instanceof check - feature!
        if (animal instanceof Cat cat) {
            cat.sayMeow();
            System.out.println("It's a mammal");
            // animal.sayMeow()
        }

        if (animal instanceof Lizard reptile) {
            reptile.sayHiss();
            System.out.println("It's a reptile");
        }

    }
}
