package org.example;

public  class Name {
private final String name;

    public String getName() {
        return name;
    }

    public Name(String name){
            this.name = name;

        }

    @Override
    public String toString() {
        return "name{" +
                "name='" + name + '\'' +
                '}';
    }
}