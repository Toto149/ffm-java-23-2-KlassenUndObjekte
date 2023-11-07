package org.example;

public class Auto {

    String marke;
    String modell;
    String farbe;
    int baujahr;
    int gefahreneKilometer;
    int maximaleGeschwindigkeit;
    int anzahlReifen;

    int ps;

    public Auto(){

    }

    public Auto(String marke, String modell, String farbe, int baujahr, int gefahreneKilometer,
                int maximaleGeschwindigkeit, int anzahlReifen, int ps){
        this.marke = marke;
        this.modell = modell;
        this.farbe = farbe;
        this.baujahr = baujahr;
        this.gefahreneKilometer = gefahreneKilometer;
        this.maximaleGeschwindigkeit = maximaleGeschwindigkeit;
        this.anzahlReifen = anzahlReifen;
    }

    public void startet(){
        System.out.println("Dieses Auto ist gestartet und kann jetzt losfahren");
    }


}
