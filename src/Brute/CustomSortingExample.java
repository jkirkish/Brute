package Brute;

import java.util.Arrays;
import java.util.Comparator;

public class CustomSortingExample {

    public static void main(String[] args) {
        // Sample array of objects to be sorted
        Person[] people = {
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 22)
        };

        // Sorting array based on age using Comparator
        Arrays.sort(people, Comparator.comparingInt(Person::getAge));

        // Displaying sorted array
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
