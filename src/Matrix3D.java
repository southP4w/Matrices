import java.util.Random;

public class Matrix3D
{
	private final int rows, columns, depth;
	private final int[][][] cube;

	public Matrix3D() {
		rows = columns = depth = 0;
		cube = new int[rows][columns][depth];
	}

	public Matrix3D(int rows, int columns, int depth) {
		Random rand = new Random();
		cube = new int[this.rows = rows][this.columns = columns][this.depth = depth];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				for (int dep = 0; dep < depth; dep++) {
					cube[row][col][dep] = rand.nextInt(1, 10);
				}
			}
		}
	}

	public static Matrix3D add(Matrix3D matrixA, Matrix3D matrixB) {
		if (matrixA.rows != matrixA.depth || matrixA.columns != matrixA.depth) {
			System.out.println("UNDEFINED: Matrix A is not a cube!");
			return null;
		}
		if (matrixB.rows != matrixB.depth || matrixB.columns != matrixB.depth) {
			System.out.println("UNDEFINED: Matrix B is not a cube!");
			return null;
		}
		if (matrixA.rows != matrixB.rows) {
			System.out.println("UNDEFINED: Matrix A and Matrix B are not equally-sized cubic matrices!");
			return null;
		}
		Matrix3D sum = new Matrix3D(matrixA.rows, matrixA.columns, matrixA.depth);
		zero(sum);
		for (int row = 0; row < matrixA.rows; row++)
			for (int col = 0; col < matrixA.columns; col++)
				for (int dep = 0; dep < matrixA.depth; dep++)
					sum.cube[row][col][dep] = matrixA.cube[row][col][dep] + matrixB.cube[row][col][dep];

		return sum;
	}

	public static void zero(Matrix3D matrix) {
		for (int i = 0; i < matrix.rows; i++) {
			for (int j = 0; j < matrix.columns; j++) {
				for (int k = 0; k < matrix.depth; k++) {
					matrix.cube[i][j][k] = 0;
				}
			}
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder().append("{\n");
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				for (int dep = 0; dep < depth; dep++) {
					sb.append("[").append(row).append(", ").append(col).append(", ").append(dep).append("] = ").append(cube[row][col][dep]).append('\n');
				}
			}
		}
		sb.append('}');

		return sb.toString();
	}
}
