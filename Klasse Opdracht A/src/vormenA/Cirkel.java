package vormenA;

public class Cirkel extends Vorm {
		
	public Cirkel(double straal) {
		super.omtrek = straal * 2 * Math.PI;
		super.width = 2 * straal;
		super.height = 2 * straal;
	}
}
