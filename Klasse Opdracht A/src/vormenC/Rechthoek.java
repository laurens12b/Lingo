package vormenC;

public class Rechthoek extends Vorm {
	
	public Rechthoek(double width, double height) {
		super(width, height);
	}
	
	public String toString() {
		return "Rechthoek: " + "\n" + "De oppervlakte is: " + super.oppervlakte + "\n";
	}

}
