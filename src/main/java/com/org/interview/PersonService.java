package com.org.interview;

import com.org.practice.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> sort(List<Person> persons) {
        List<Person> personList = new ArrayList<>();
        if (CollectionUtils.isEmpty(persons)) {
            return null;
        } else {
            personList = persons.stream().filter(person -> person.getSalary() > 5000)
                    .sorted(Comparator.comparing(Person::getFirstName)).toList();
        }
        // Save to Cassandra database
        personRepository.saveAll(personList);
        return personList;
    }
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vamsi", "K", 12000));
        personList.add(new Person("Shubham", "AA", 3000));
        personList.add(new Person("AAAA", "BBBB", 6000));

        PersonService ps = new PersonService();
        List<Person> output = ps.sort(personList);
        for (Person p : output) {
            System.out.println("Person : " + p.toString());
        }
    }

}
