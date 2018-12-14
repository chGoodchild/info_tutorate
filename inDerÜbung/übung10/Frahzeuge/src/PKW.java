public class PKW extends Kraftfahrzeug {
    public PKW(int baujahr, int seriennummer, String kennzeichen, 
               int leistung, int tuvtermin, int sitzplatze) {
        super(seriennummer, tuvtermin, baujahr);
        //super(baujahr);
        this.kennzeichen = kennzeichen;
        this.sitzplatze = sitzplatze;
        this.leistung = leistung;
    }
	
    // public int getBaujahr() {
    // 	return baujahr;
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
	
    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }
	
    public String toString() {
        String result = " Seriennummer: " + this.seriennummer;
        result += " TuV-Termin: " + this.tuvtermin;
        result += " Baujahr: " + this.baujahr;
        result += " Kennzeichen: " + this.kennzeichen;
        result += " Sitzplatze: " + this.sitzplatze;
        result += " Leistung: " + this.leistung;
        return result;
    }
	
    //	protected int baujahr;
    protected String kennzeichen;
    protected int sitzplatze;
    protected int leistung;
}
