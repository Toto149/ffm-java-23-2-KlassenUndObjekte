package org.example;

public class Person {
    String name;
    int alter;
    char geschlecht;

    public Person(){

    }

    public Person(String name, int alter, char geschlecht){
        this.alter = alter;
        this.name = name;
        this.geschlecht = geschlecht;
    }
    public Person(int alter, String name, char geschlecht){
        this.alter = alter;
        this.name = name;
        this.geschlecht = geschlecht;
    }

    public void vorstellen(){
        System.out.println("Hallo, ich bin %s und %d Jahre alt".formatted(name, alter));
    }
}
