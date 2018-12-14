public class LKW extends Kraftfahrzeug {
    public LKW(int baujahr, int seriennummer, String kennzeichen,
               int leistung, int tuvtermin, int sitzplatze, int zuladung) {
        super(seriennummer, tuvtermin, baujahr);
        // super(baujahr);
        this.kennzeichen = kennzeichen;
        this.sitzplatze = sitzplatze;
        this.leistung = leistung;
        this.zuladung = zuladung;
    }
	
    // public int getBaujahr() {
    //     return baujahr;
    // }
    public String getKennzeichen() {
        return kennzeichen;
    }
    public int getSitzplatze() {
        return sitzplatze;
    }
    public int getLeistung() {
        return leistung;
    }
    public int getZuladung() {
        return zuladung;
    }
	
    public String toString() {
        String result = " Seriennummer: " + this.seriennummer;
        result += " TuV-Termin: " + this.tuvtermin;
        result += " Baujahr: " + this.baujahr;
        result += " Kennzeichen: " + this.kennzeichen;
        result += " Sitzplatze: " + this.sitzplatze;
        result += " Leistung: " + this.leistung;
        result += " Zuladung: " + this.zuladung;
        return result;
    }
	
    //    private int baujahr;
    private String kennzeichen;
    private int sitzplatze;
    private int leistung;
    private int zuladung;
}
