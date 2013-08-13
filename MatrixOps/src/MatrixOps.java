/**
 * @author Brian Nava CIT245 Assignment1
 */

// import java.util.Arrays;

public class MatrixOps {

	private double[][] matrix;

	/** Constructor for matrix object */
	public MatrixOps() {
		setMatrix(new double[0][0]);
	}

	/**
	 * Constructor for matrix object
	 * 
	 * @param rows
	 *            Number of rows
	 */
	public MatrixOps(int rows) {
		if (rows < 0) {
			throw new IllegalArgumentException(
					"Number of rows cannot be negative");
		} else
			setMatrix(new double[rows][]);
	}

	/**
	 * Constructor for matrix object
	 * 
	 * @param rows
	 *            number of rows
	 * @param cols
	 *            number of columns
	 */
	public MatrixOps(int rows, int cols) {
		if (rows < 0 || cols < 0) {
			throw new IllegalArgumentException(
					"Number of rows or columns cannot be negative");
		} else
			setMatrix(new double[rows][cols]);
	}

	/**
	 * Constructor for matrix object
	 * 
	 * @param matrix
	 */
	public MatrixOps(double[][] matrix) {
		this.matrix = matrix;
	}

	/**
	 * @param matrix
	 *            the matrix to set
	 */
	public void setMatrix(double[][] matrix) {
		this.matrix = matrix;
	}

	/**
	 * Gets the matrix
	 * 
	 * @return the matrix
	 */
	public double[][] getMatrix() {
		return matrix;
	}

	/**
	 * Sets matrix row with given values
	 * 
	 * @param row
	 *            row to set
	 * @param rowVals
	 *            array of values
	 */
	public void setRow(int row, double[] rowVals) {
		if (row < 0)
			throw new IllegalArgumentException("Row number cannot be negative");
		else
			matrix[row] = rowVals;
	}

	/**
	 * Gets a matrix row
	 * 
	 * @param row
	 *            the row to get
	 * @return the specified row
	 */
	public double[] getRow(int row) {
		return matrix[row];
	}

	/**
	 * Sets the element at specified index to the given value
	 * 
	 * @param row
	 *            row index
	 * @param col
	 *            column index
	 * @param value
	 *            the given value
	 */
	public void setElement(int row, int col, double value) {
		try {
			matrix[row][col] = value;
		} catch (Exception e) {
			System.err.println("Could not set element [" + row + ", " + col
					+ "]: " + e.toString());
		}

	}

	/**
	 * Gets the element at specified index
	 * 
	 * @param row
	 *            the matrix row
	 * @param col
	 *            the matrix column
	 * @return matrix
	 */
	public double getElement(int row, int col) {
		return matrix[row][col];
	}

	/**
	 * @return Sum of all values
	 */
	public double sum() {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			double[] row = matrix[i];
			for (int j = 0; j < row.length; j++) {
				sum += matrix[i][j];
			}
		}
		return sum;
	}

	/**
	 * Gets greatest matrix value
	 * 
	 * @return Greatest value
	 */
	public double findMax() {
		double max = 0;
		int length = matrix.length;
		for (int i = 0; i < length; i++) {
			int row = matrix[i].length;
			for (int j = 0; j < row; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		return max;
	}

	/**
	 * Gets lowest matrix value
	 * 
	 * @return Minimum value
	 */
	public double findMin() {
		double min = matrix[0][0];
		int length = matrix.length;
		for (int i = 0; i < length; i++) {
			int row = matrix[i].length; // Length of current row
			for (int j = 0; j < row; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}
		}
		return min;
	}

	/**
	 * Display matrix as string
	 * 
	 * @return The objects state
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < matrix.length; i++) {
			double[] row = this.getRow(i);
			for (int j = 0; j < row.length; j++) {
				sb.append(this.getElement(i, j) + "\t");
			}
			sb.append("\n");
		}
		// alternate toString method uses enhanced
		// for loop to append each row as array
		/*
		 * for (double[] m : matrix) { sb.append(Arrays.toString(m) + "\n"); }
		 */
		return sb.toString();
	}

}