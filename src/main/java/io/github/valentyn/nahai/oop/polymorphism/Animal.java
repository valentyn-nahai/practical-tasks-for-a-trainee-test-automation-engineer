package io.github.valentyn.nahai.oop.polymorphism;

public abstract class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public abstract void move();
    public abstract void makeSound();
    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
