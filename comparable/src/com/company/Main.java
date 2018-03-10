package com.company;

import java.util.*;

class Person implements Comparable <Person> {

    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public  int compareTo(Person p) {
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + '}';
    }

}

public class Main {

    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(new Person(7));
        set.add(new Person(5));
        set.add(new Person(9));
        set.add(new Person(11));
        set.add(new Person(4));
        for(Object o : set) {
            System.out.println(o);
        }
    }
}
