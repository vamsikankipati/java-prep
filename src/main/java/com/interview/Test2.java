package com.interview;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {


    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 30, "NewYork Chennai", true, 5000));
        persons.add(new Person("Sarah", 25, "London", true, 4000));
        persons.add(new Person("Mike", 40, "Chicago", false, 6000));
        persons.add(new Person("Emily", 35, "SanFrancisco Dubai", true, 7000));
        persons.add(new Person("David", 28, "Sydney Melbourne", false, 5500));

        // Filter and collect employed persons into a new list
        List<Person> employedPersons = persons.stream().filter(per -> per.isEmployed()).collect(Collectors.toList());
//        System.out.println(employedPersons.toString());

        // Map names to uppercase and collect into a new list
        List<String> personWithUc = persons.stream().map(per -> per.getName().toUpperCase()).collect(Collectors.toList());
//        System.out.println(personWithUc);

        // FlatMap cities and collect distinct values into a new list
        Set<String> distinctCities = new HashSet<>();
        persons.stream().forEach(per -> {
            if (per.getCity().contains(" ")) {
                List<String> multiCity = Arrays.stream(per.getCity().split(" ")).toList();
                multiCity.stream().forEach(city -> distinctCities.add(city));
            } else {
                distinctCities.add(per.getCity());
            }
        });
//        System.out.println(distinctCities.toString());

        // Sort persons based on age in descending order
        List<Person> sortedPersons = persons.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
//        System.out.println(sortedPersons);

        // Group persons by city and calculate the total salary for each city
        Map<String, Double> cityAndSalaryMap = persons.stream().collect(Collectors.toMap(person -> person.getCity(), person -> person.getSalary()));
//        System.out.println(cityAndSalaryMap);

        // Partition persons into two groups: employed and unemployed
        List<Person> employed = persons.stream().filter(p -> p.isEmployed()).collect(Collectors.toList());
        List<Person> unEmployed = persons.stream().filter(p -> !p.isEmployed()).collect(Collectors.toList());
        System.out.println("Employed: " + employed);
        System.out.println("Unemployed: " + unEmployed);
    }
}
