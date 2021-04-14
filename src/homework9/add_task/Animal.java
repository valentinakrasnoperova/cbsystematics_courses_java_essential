package homework9.add_task;

import homework9.task2.Monitor;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", tail: " + tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        if ((name != animal.name) || (age != animal.age) || (tail != animal.tail)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 99;
        result = 11 * 99 + (name == null ? 0 : name.hashCode());
        result = 11 * 99 + (int) age;
        result = 11 * 99 + (tail ? 1 : 0);
        return result;
    }
}
