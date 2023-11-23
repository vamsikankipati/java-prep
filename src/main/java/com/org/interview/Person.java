package com.org.interview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Objects;

@Data
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Person {
    String firstName;
    String lastname;
    Integer Salary;
}
