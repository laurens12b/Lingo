package vormenC;

public class Kubus extends Vorm {
	
	public Kubus(double side) {
		super(side, side, side);
	}
	
	public String toString() {
		return "Kubus: \\n" + "\n" + "Oppervlakte: " + super.oppervlakte + "\n" + "Inhoud: " +  super.volume + "\n";
	}
}
