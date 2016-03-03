package vormenC;

public class Vierkant extends Vorm {
	
	public Vierkant(double side) {
		super(side, side);
	}
	
	public String toString() {
		return "Vierkant: " + "\n" + "De oppervlakte is: " + super.oppervlakte + "\n";
	}

}
