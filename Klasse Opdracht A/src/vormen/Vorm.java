package vormen;

public abstract class Vorm {
	
	protected double width;
	protected double height;
	protected double omtrek;
	
	public double omtrek() {
		return omtrek;
	}

	public String toString() {
		return "De omtrek is: " + omtrek;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getOmtrek() {
		return omtrek;
	}

	public void setOmtrek(double omtrek) {
		this.omtrek = omtrek;
	}
}
