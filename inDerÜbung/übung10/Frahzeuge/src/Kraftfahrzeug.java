public class Kraftfahrzeug extends Fahrzeug {
    public Kraftfahrzeug(int seriennummer, int tuvtermin, int baujahr) {
        super(seriennummer, baujahr);
        //super(baujahr);
        this.tuvtermin = tuvtermin;
    }
	
    public int getTuvtermin() {
        return tuvtermin;
    }
	
    public void setTuvtermin(int tuvtermin) {
        this.tuvtermin = tuvtermin;
    }
	
    public String toString() {
        String result = " Seriennummer: " + seriennummer;
        result += " TuV-Termin " + tuvtermin;
        return result;
    }
	
    protected int tuvtermin;
}
