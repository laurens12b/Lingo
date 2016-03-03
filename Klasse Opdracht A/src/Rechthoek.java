
public class Rechthoek {
	private double width;
	private double height;
	private double omtrek;
	
	Rechthoek() {
	}
	
	public void setRechthoek(double width, double height) {
		this.width = width;
		this.height = height;
		this.omtrek = 2 * (width + height);
	}
	
	public String toString() {
		return "De omtrek is: " + omtrek;
	}
}
