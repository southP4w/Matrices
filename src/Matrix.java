import java.util.Random;

class Matrix
{
	private final int rows, columns;
	//	private int columns;
	private final int[][] grid;

	public Matrix() {
		rows = columns = 0;
		grid = new int[rows][columns];
	}

	/**
	 * Creates a 2D Array of the specified dimensions and assigns all elements a random single-digit value [1,10)
	 * @param rows number of rows
	 * @param columns number of columns
	 */
	public Matrix(int rows, int columns) {
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

	public static Matrix add(Matrix matrixA, Matrix matrixB) {
		if (matrixA.getRows() != matrixA.getColumns()) {
			System.out.println("UNDEFINED: Matrix A is not square!");
			return null;
		}
		if (matrixB.getRows() != matrixB.getColumns()) {
			System.out.println("UNDEFINED: Matrix B is not square!");
			return null;
		}
		if (matrixA.getRows() != matrixB.getRows() || matrixA.getColumns() != matrixB.getColumns()) {
			System.out.println("UNDEFINED: Matrix A and B are not equally-sized square matrices!");
			return null;
		}
		Matrix sum = new Matrix(matrixA.getRows(), matrixA.getColumns());
		zero(sum);
		for (int row = 0; row < matrixA.getRows(); row++)
			for (int col = 0; col < matrixA.getColumns(); col++)
				sum.grid[row][col] = matrixA.grid[row][col] + matrixB.grid[row][col];

		return sum;
	}

	public static Matrix multiply(Matrix matrixA, Matrix matrixB) {
		if (matrixA.getColumns() != matrixB.getRows()) {
			System.out.println("UNDEFINED: Matrix A does not have the same number of " +
					"columns as Matrix B has rows!");
			return null;
		}
		Matrix dotProduct = new Matrix(matrixA.getRows(), matrixB.getColumns());
		zero(dotProduct);	// set the new Matrix to all 0's
		for (int row = 0; row < matrixA.rows; row++)
			for (int col = 0; col < matrixB.columns; col++)
				for (int i = 0; i < matrixB.rows; i++)
					dotProduct.grid[row][col] += matrixA.grid[row][i] * matrixB.grid[i][col];

		return dotProduct;
	}

	public static void zero(Matrix matrix) {
		for (int i = 0; i < matrix.rows; i++)
			for (int j = 0; j < matrix.columns; j++)
				matrix.grid[i][j] = 0;
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