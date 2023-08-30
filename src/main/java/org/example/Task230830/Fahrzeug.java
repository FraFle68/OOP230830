package org.example.Task230830;

public class Fahrzeug {
    protected String hersteller;
    protected String modell;
    protected int baujahr;


    public Fahrzeug(String hersteller, String modell, int baujahr) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    @Override
    public String toString() {
        return "\nFahrzeug: " +
                "Hersteller='" + hersteller + '\'' +
                ", Modell='" + modell + '\'' +
                ", Baujahr=" + baujahr;
    }
}
