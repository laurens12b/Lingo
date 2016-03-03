
public class Vierkant {
	private double side;
	private double omtrek;
	
	Vierkant() {
	}
	
	public double getWidth() {
		return side;
	}
	
	public double getHeight() {
		return side;
	}
	
	public void setVierkant(double side) {
		this.side = side;
		this.omtrek = side * 4;
	}
	
	public String toString() {
		return "De omtrek is: " + omtrek;
	}
}
