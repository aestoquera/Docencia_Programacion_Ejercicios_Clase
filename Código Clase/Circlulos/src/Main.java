
public class Main {

	public static void main(String[] args) {
				
		CircleWithStaticCount c1 = new CircleWithStaticCount();
		CircleWithStaticCount c2 = new CircleWithStaticCount(2);
		System.out.println("Nuevo C2: " + c2);
		CircleWithStaticCount c3 = new CircleWithStaticCount(3, 3.0);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
