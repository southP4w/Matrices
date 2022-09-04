public class Main
{
	public static void main(String[] args) {
		Matrix a = new Matrix(5, 5);
		System.out.println("A\n" + a);
		Matrix b = new Matrix(5, 5);
		System.out.println("B\n" + b);
		System.out.println("A + B");
		System.out.println(Matrix.add(a, b));
		System.out.println("A + A");
		System.out.println(Matrix.add(a, a));
		System.out.println("B + B");
		System.out.println(Matrix.add(b, b));
		Matrix c = new Matrix(5, 3);
		System.out.println("C\n" + c);
		Matrix d = new Matrix(3, 5);
		System.out.println("D\n" + d);
		System.out.println("C * D");
		System.out.println(Matrix.multiply(c, d));
		System.out.println("D * C");
		System.out.println(Matrix.multiply(d, c));
	}
}