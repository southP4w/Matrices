public class Main
{
	public static void main(String[] args) {
//		Matrix2D a = new Matrix2D(5, 5);
//		System.out.println("A\n" + a);
//		Matrix2D b = new Matrix2D(5, 5);
//		System.out.println("B\n" + b);
//		System.out.println("A + B");
//		System.out.println(Matrix2D.add(a, b));
//		System.out.println("A + A");
//		System.out.println(Matrix2D.add(a, a));
//		System.out.println("B + B");
//		System.out.println(Matrix2D.add(b, b));
//		Matrix2D c = new Matrix2D(5, 3);
//		System.out.println("C\n" + c);
//		Matrix2D d = new Matrix2D(3, 5);
//		System.out.println("D\n" + d);
//		System.out.println("C * D");
//		System.out.println(Matrix2D.multiply(c, d));
//		System.out.println("D * C");
//		System.out.println(Matrix2D.multiply(d, c));

		Matrix3D m1 = new Matrix3D(5, 6, 5);
		Matrix3D m2 = new Matrix3D(6, 6, 6);
		System.out.println("M1\n" + m1 + '\n');
		System.out.println("M2\n" + m2);
		System.out.println("M1 + M2\n" + Matrix3D.add(m1, m2));
	}
}