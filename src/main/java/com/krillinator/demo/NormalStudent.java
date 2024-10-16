package com.krillinator.demo;

import java.util.Objects;

public class NormalStudent {

    private final String name;

    public NormalStudent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

}
