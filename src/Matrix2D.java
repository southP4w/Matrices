import java.util.Random;

class Matrix2D
{
	private final int rows, columns;
	private final int[][] grid;

	public Matrix2D() {
		rows = columns = 0;
		grid = new int[rows][columns];
	}

	/**
	 * Creates a 2D Array of the specified dimensions and assigns each element a random single-digit value [1,10)
	 *
	 * @param rows    number of rows
	 * @param columns number of columns
	 */
	public Matrix2D(int rows, int columns) {
		Random rand = new Random();
		grid = new int[this.rows = rows][this.columns = columns];
		for (int row = 0; row < rows; row++)
			for (int col = 0; col < columns; col++)
				grid[row][col] = rand.nextInt(1, 10);
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public static Matrix2D add(Matrix2D matrixA, Matrix2D matrixB) {
		if (matrixA.rows != matrixA.columns) {
			System.out.println("UNDEFINED: Matrix A is not square!");
			return null;
		}
		if (matrixB.rows != matrixB.columns) {
			System.out.println("UNDEFINED: Matrix B is not square!");
			return null;
		}
		if (matrixA.rows != matrixB.rows) {
			System.out.println("UNDEFINED: Matrix A and B are not equally-sized square matrices!");
			return null;
		}
		Matrix2D sum = new Matrix2D(matrixA.rows, matrixA.columns);
		zero(sum);
		for (int row = 0; row < matrixA.rows; row++)
			for (int col = 0; col < matrixA.columns; col++)
				sum.grid[row][col] = matrixA.grid[row][col] + matrixB.grid[row][col];

		return sum;
	}

	public static Matrix2D multiply(Matrix2D matrix2DA, Matrix2D matrix2DB) {
		if (matrix2DA.columns != matrix2DB.rows) {
			System.out.println("UNDEFINED: Matrix A does not have the same number of " +
					"columns as Matrix B has rows!");
			return null;
		}
		Matrix2D dotProduct = new Matrix2D(matrix2DA.rows, matrix2DB.columns);
		zero(dotProduct);    // set the new Matrix to all 0's
		for (int row = 0; row < matrix2DA.rows; row++)
			for (int col = 0; col < matrix2DB.columns; col++)
				for (int i = 0; i < matrix2DB.rows; i++)
					dotProduct.grid[row][col] += matrix2DA.grid[row][i] * matrix2DB.grid[i][col];

		return dotProduct;
	}

	public static void zero(Matrix2D matrix2D) {
		for (int i = 0; i < matrix2D.rows; i++)
			for (int j = 0; j < matrix2D.columns; j++)
				matrix2D.grid[i][j] = 0;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++)
				sb.append(grid[i][j]).append(' ');
			sb.append('\n');
		}

		return sb.toString();
	}
}