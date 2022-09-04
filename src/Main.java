public class Main
{
	public static void main(String[] args) {
		Matrix c = new Matrix(5, 3);
		System.out.println("Matrix C\n" + c);

		Matrix d = new Matrix(3, 5);
		System.out.println("Matrix D\n" + d);

		System.out.println("\nC * D");
		System.out.println(Matrix.multiply(c, d));
		System.out.println("\nD * C");
		System.out.println(Matrix.multiply(d, c));
	}
}