package vormenC;

public class Balk extends Vorm {

	public Balk(double width, double height, double depth) {
		super(width, height, depth);
	}
	
	public String toString() {
		return "Balk: " + "\n" + "Oppervlakte: " + super.oppervlakte + "\n" + "Inhoud: " +  super.volume + "\n";
	}
}
