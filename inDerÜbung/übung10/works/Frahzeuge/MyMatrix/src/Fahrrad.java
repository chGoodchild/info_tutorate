public class Fahrrad extends Fahrzeug {
	public Fahrrad(int baujahr, int seriennummer, int rahmengrosse) {
		super(seriennummer);
		this.baujahr = baujahr;
		this.rahmengrosse = rahmengrosse;
	}
	
	public int getBaujahr() {
		return baujahr;
	}
	
	public int getRahmengrosse() {
		return rahmengrosse;
	}
	
	public String toString() {
		String result = " Seriennummer: " + seriennummer;
		result += " Baujahr: " + baujahr;
		result += " Rahmengrosse: " + rahmengrosse;
		return result;
	}
	
	private int baujahr;
	private int rahmengrosse;
}