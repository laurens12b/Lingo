
public class Vierkant {
	private double width;
	private double height;
	private double omtrek;
	
	Vierkant() {
		width = 0;
		height = 0;
		omtrek = 0;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setVierkant(double zijde) {
		width = zijde;
		height = zijde;
	}
	
	public String toString() {
		omtrek = 2*(width+height);
		String omtrekString = String.valueOf(omtrek);
		return "De omtrek is " + omtrekString;
	}
}
