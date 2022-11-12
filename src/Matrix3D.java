import java.util.Random;

class Matrix3D
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
		for (int row = 0; row < rows; row++)
			for (int col = 0; col < columns; col++)
				for (int dpth = 0; dpth < depth; dpth++)
					cube[row][col][dpth] = rand.nextInt(1, 10);
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public int getDepth() {
		return depth;
	}

	public static Matrix3D add(Matrix3D matrixA, Matrix3D matrixB) {
//		if (matrixA) {
//
//		}
		if (matrixA.rows != matrixB.columns || matrixA.rows != matrixB.depth) {

		}
		Matrix3D sum = new Matrix3D(matrixA.rows, matrixA.columns, matrixA.depth);

		return sum;
	}

}