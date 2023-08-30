package org.example.Task230830;

public class Motorrad extends Fahrzeug{
    protected enum style {Chopper, Sportbike, Cruiser};
    protected style art;
    public Motorrad(String hersteller, String modell, int baujahr, style art) {
        super(hersteller, modell, baujahr);
        this.art = art;
    }

    public String getArt() {
        return art.name();
    }

    public void setArt(style art) {
        this.art = art;
    }

    @Override
    public String toString() {
        return "\nAuto: " +
                "Hersteller='" + hersteller + '\'' +
                ", Modell='" + modell + '\'' +
                ", Baujahr=" + baujahr +
                ", Art=" + art;
    }
}
