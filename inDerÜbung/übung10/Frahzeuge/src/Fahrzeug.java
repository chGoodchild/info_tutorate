public class Fahrzeug {

    public Fahrzeug(int seriennummer, int baujahr) {
        this.seriennummer = seriennummer;
        this.baujahr = baujahr;
    }

    public int getSeriennummer() {
        return seriennummer;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public String toString() {
        return " Seriennummer: " + this.seriennummer + " Baujahr: " + this.baujahr;
    }

    protected int seriennummer;
    protected int baujahr;
}
