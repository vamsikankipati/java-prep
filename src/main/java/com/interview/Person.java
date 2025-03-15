package com.interview;

class Person {
    private String name;
    private int age;
    private String city;
    private boolean isEmployed;
    private double salary;

    public Person(String name, int age, String city, boolean isEmployed, double salary) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.isEmployed = isEmployed;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", isEmployed=" + isEmployed +
                ", salary=" + salary +
                '}';
    }
}