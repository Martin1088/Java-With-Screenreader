package Immobilien;

public class Wohneinheit{
    private int anzahlZimmmer;
    private double preisProQM;
    private double anzahlQM;

    public Wohneinheit(int anzahlZimmmer, double preisProQM, double anzahlQM) {
        this.anzahlZimmmer = anzahlZimmmer;
        this.preisProQM = preisProQM;
        this.anzahlQM = anzahlQM;
    }

    public double MietpreisWohneinheit() {
    ¡    if (anzahlZimmmer == 1) {
             return anzahlQM * preisProQM;
        } else {
            return anzahlQM * preisProQM + (anzahlZimmmer - 1) * 50;
        }
    }
}
