package vormen;

public class Rechthoek extends Vorm {
	
	public Rechthoek(double width, double height) {
		super.width = width;
		super.height = height;
		super.omtrek = 2 * (width + height);
	}
	
}
