package org.example.Task230830;

public class Main {
    public static void main(String[] args) {
        Fahrzeug model1 = new Fahrzeug("Eimer Benz", "Müllcedes", 1968);
        Auto model2 = new Auto("Hinfort", "Lokus", 1990, 1);
        Motorrad model3 = new Motorrad("Souflaki", "Harakiri", 2019, Motorrad.style.Sportbike);

        System.out.println(model1);
        System.out.println(model2);
        System.out.println(model3);
        System.out.println(model3.getArt());
    }
}
