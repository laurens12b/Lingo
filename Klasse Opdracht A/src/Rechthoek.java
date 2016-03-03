
public class Rechthoek {
	private double width;
	private double height;
	private double omtrek;
	
	Rechthoek() {
		width = 0;
		height = 0;
		omtrek = 0;
	}
	
	public void setRechthoek(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		omtrek = 2*(width+height);
		String omtrekString = String.valueOf(omtrek);
		return "De omtrek is " + omtrekString;
	}
}
