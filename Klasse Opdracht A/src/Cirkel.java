
public class Cirkel {
	private double straal;
	private double omtrek;
	
	public Cirkel() {
	}
	
	public Cirkel(double straal) {
		this.straal = straal;
		this.omtrek = straal * 2 * Math.PI;
	}
	
	
	public void setStraal(double straal) {
		this.straal = straal;
		this.omtrek = straal * 2 * Math.PI;
	}
	
	public String toString() {
		return "De omtrek is: " + omtrek;
	}
}
