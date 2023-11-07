package org.example;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.startet();
        Auto auto1 = new Auto(23);
        auto1.beschleunigt();
        System.out.println(auto1.geschwindigkeit);

        Person person = new Person("Hans", 23, 'M');
        person.vorstellen();

    }
}