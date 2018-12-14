public class Bus extends PKW {
	public Bus(int baujahr, int seriennummer, String kennzeichen, 
				int leistung, int tuvtermin, int sitzplatze, int stehplatze) {
		super(baujahr, seriennummer, kennzeichen, leistung, tuvtermin, sitzplatze);
		this.stehplatze = stehplatze;
	}
	
	public int getStehplatze() {
		return stehplatze;
	}
	
	public String toString() {
		String result = " Seriennummer: " + this.seriennummer;
		result += " TuV-Termin: " + this.tuvtermin;
		result += " Baujahr: " + this.baujahr;
		result += " Kennzeichen: " + this.kennzeichen;
		result += " Sitzplatze: " + this.sitzplatze;
		result += " Stehplatze: " + this.stehplatze;
		result += " Leistung: " + this.leistung;
		return result;
	}

	private int stehplatze;
}
