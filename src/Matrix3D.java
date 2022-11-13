import java.util.Random;

public class Matrix3D
{
	private final int x, y, z;
	private final int[][][] cube;

	public Matrix3D() {
		x = y = z = 0;
		cube = new int[x][y][z];
	}

	public Matrix3D(int x, int y, int z) {
		Random rand = new Random();
		cube = new int[this.x = x][this.y = y][this.z = z];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				for (int k = 0; k < z; k++) {
					cube[i][j][k] = rand.nextInt(1, 10);
				}
			}
		}
	}

	public static Matrix3D add(Matrix3D matrixA, Matrix3D matrixB) {
		if (matrixA.x != matrixA.y || matrixA.x != matrixA.z || matrixA.y != matrixA.z) {
			System.out.println("UNDEFINED: Matrix A is not a cube!");
			return null;
		}
		if (matrixB.x != matrixB.y || matrixB.x != matrixB.z || matrixB.y != matrixB.z) {
			System.out.println("UNDEFINED: Matrix B is not a cube!");
			return null;
		}
		if (matrixA.x != matrixB.x || matrixA.y != matrixB.y || matrixA.z != matrixB.z) {
			System.out.println("UNDEFINED: Matrix A and Matrix B are not equally-sized cubic matrices!");
			return null;
		}
		Matrix3D sum = new Matrix3D(matrixA.x, matrixA.y, matrixA.z);
		zero(sum);
		for (int i = 0; i < matrixA.x; i++)
			for (int j = 0; j < matrixA.y; j++)
				for (int k = 0; k < matrixA.z; k++)
					sum.cube[i][j][k] = matrixA.cube[i][j][k] + matrixB.cube[i][j][k];

		return sum;
	}

	public static void zero(Matrix3D matrix) {
		for (int i = 0; i < matrix.x; i++) {
			for (int j = 0; j < matrix.y; j++) {
				for (int k = 0; k < matrix.z; k++) {
					matrix.cube[i][j][k] = 0;
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				for (int k = 0; k < z; k++) {
					sb.append(cube[i][j][k]).append(' ');
				}
				sb.append("|\n");
			}
			sb.append('\n');
		}

		return sb.toString();
	}
}
