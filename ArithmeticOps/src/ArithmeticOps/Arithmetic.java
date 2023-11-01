package ArithmeticOps;
public class Arithmetic {

	public static void main(String[] args) {
		Add a = new Add();
		Division d = new Division();
		Multiply m = new Multiply();
		Subract s = new Subract();
		System.out.println("Addition = "+a.add(10,20));
		System.out.println("Addition = "+d.div(10,20));
		System.out.println("Addition = "+m.mul(10,20));
		System.out.println("Addition = "+s.sub(10,20));
	}

}
