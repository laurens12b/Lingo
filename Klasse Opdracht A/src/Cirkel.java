
public class Cirkel {
	private double straal;
	private double omtrek;
	
	public Cirkel() {
		straal = 0;
	}
	
	public void setStraal(double straal) {
		this.straal = straal;
	}
	
	public String toString() {
		omtrek = 2*Math.PI*straal;
		String omtrekString = String.valueOf(omtrek);
		return "De omtrek is " + omtrekString;
	}
}
