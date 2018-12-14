public class Fahrzeug {

	public Fahrzeug(int seriennummer) {
		this.seriennummer = seriennummer;	
	}

	public int getSeriennummer() {
		return seriennummer;
	}

	public String toString() {
		return " Seriennummer: " + this.seriennummer;
	}

	protected int seriennummer;
}
