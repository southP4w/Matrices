public class Main
{
	public static void main(String[] args) {
		Matrix m1 = new Matrix(5, 5);
		System.out.println(m1);
		Matrix m2 = new Matrix(5, 5);
		System.out.println(m2);
		System.out.println(Matrix.add(m1, m2));
	}
}