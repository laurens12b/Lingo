
public class Vorm {
	
	public static void main(String args[]) {
		
		Vierkant vierkant = new Vierkant();
		Cirkel cirkel = new Cirkel();
		Rechthoek rechthoek = new Rechthoek();
		
		vierkant.setVierkant(5);
		System.out.println(vierkant.toString());
		
		cirkel.setStraal(5);
		System.out.println(cirkel.toString());
		
		rechthoek.setRechthoek(5, 5);
		System.out.println(rechthoek.toString());
	}
}
