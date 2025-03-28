package org.example;

import javax.naming.Name;

public class Tester {
    private String name;
    private String surname;
    private String expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, String expirienceInYears, String englishLevel, double salary) {
        this(name,surname,expirienceInYears);
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, String expirienceInYears) {
        this(expirienceInYears);
        this.name = name;
        this.surname = surname;

    }
    public Tester(String expirienceInYears){
        this.expirienceInYears = expirienceInYears;
    }

    public void info(int i){
        System.out.println(i);
    }
    public void info(){
        System.out.println(surname);
    }
    public void info(int i, int s){
        System.out.println(i+s);
    }
    @Override
    public String toString(){
     return name;
    }
    public void info(int i, int s, int e){
        System.out.println(i+s+e);
    }

    public static void pupa(){
        System.out.println("Был вызван статический метод");
    }// статический метод не может взаимодействовать с обычными полями
}

