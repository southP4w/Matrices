import java.util.Random;

class Matrix
{
	private int rows, columns;
	private int[][] grid;

	public Matrix() {
		rows = columns = 0;
		grid = new int[rows][columns];
	}

	public Matrix(int rows, int columns) {
		Random rand = new Random();
		grid = new int[this.rows = rows][this.columns = columns];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				grid[i][j] = rand.nextInt(1, 5);
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
		for (int i = 0; i < matrixA.getRows(); i++)
			for (int j = 0; j < matrixA.getColumns(); j++)
				sum.grid[i][j] = matrixA.grid[i][j] + matrixB.grid[i][j];

		return sum;
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