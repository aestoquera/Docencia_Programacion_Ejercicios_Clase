
public class CircleWithStaticCount {
	
	public static int count = 0;
	public double radius = 1.0;
	
	public CircleWithStaticCount() { }
	
	public CircleWithStaticCount(int count) {
		this.count = count;	
	}
	
	public CircleWithStaticCount(int count, double radius) {
		this.count = count;
		this.radius = radius;
	}
	
	public String toString() {
		return "Count: " + this.count + " \t\t Radius: " + this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
