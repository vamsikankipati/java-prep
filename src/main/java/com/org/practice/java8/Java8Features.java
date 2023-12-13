package com.org.practice.java8;

import com.org.interview.Person;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Java8Features {
    public void streamOp(List<Person> persons) {

        persons.sort(Comparator.comparing(Person::getFirstName));

        // internal iteration
        persons.stream().sorted(Comparator.comparing(Person::getFirstName)).toList();

        // sequential processing - uses single core
        persons.stream().filter(per -> per.getSalary() > 5000).toList();

        // parallel processing - uses multi core
        persons.parallelStream().filter(per -> per.getSalary() > 5000).toList();

        persons.parallelStream().filter(per -> {
            // block of code - defer the execution of below block of code.
            if (per.getSalary() > 1000) {
                return false;
            } else {
                return true;
            }
        }).toList();

        // Behaviour Parameterization - block of code passed as an argument to another method.

        // Anonymous Classes - Before Java 8

        // Lambdas - Concise code
        // Lambda - word originated from Lambda Calculus

        // Lambda can be used in the context of a Functional Interface
        // Predicate is a FI that has a single abstract method : test()
        // Eg: Comparator (compare()) and Runnable (run()) are FIs


    }
}
