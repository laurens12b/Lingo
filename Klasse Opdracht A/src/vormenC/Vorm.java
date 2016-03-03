package vormenC;

public abstract class Vorm {
	
	protected double width;
	protected double height;
	protected double depth;
	protected double oppervlakte;
	protected double volume;
	
	public Vorm(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.volume = width * height * depth;
		this.oppervlakte = 2 * (width * height + depth * height + depth * width); 
	}
	
	public Vorm(double width, double height) {
		this.width = width;
		this.height = height;
		this.oppervlakte = width * height;
	}
	
	public double inhoud() {
		return volume;		
	}
	
	public double oppervlakte() {
		return oppervlakte;
	}
}
