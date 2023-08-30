package org.example.Task230830;

public class Auto extends Fahrzeug{
    protected int anzahlDerTueren;

    public Auto(String hersteller, String modell, int baujahr, int anzahlDerTueren) {
        super(hersteller, modell, baujahr);
        this.anzahlDerTueren = anzahlDerTueren;
    }

    @Override
    public String toString() {
        return "\nAuto: " +
                "Hersteller='" + hersteller + '\'' +
                ", Modell='" + modell + '\'' +
                ", Baujahr=" + baujahr +
                ", Anzahl der Tueren=" + anzahlDerTueren;
    }
}
