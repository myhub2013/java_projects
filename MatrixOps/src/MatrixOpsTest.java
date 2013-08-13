	// Brian 
	// MatrixOpsTest

public class MatrixOpsTest {

	public static void main(String[] args) {
		MatrixOps obj1, obj2, obj3, obj4;

		// Arrays to populate matrix objects
		double[] arr = { 9.9, 5.8, 3, 4, 5 };
		double[] arr2 = { 5, 6, 7, 8, 9, 4, 3.7 };
		double[] arr3 = { 9 };
		double[][] arr4 = { { 5.5, 0.2 }, { 2.5, 7.8, 9.9, 4.6, 3.3 },
				{ 2.6, 8.0, 1.4 }, { 4.4, 3.2, 5.0, 3.3 }, { 5.5, 8.8, 9.9 },
				{ 5.4, 2.2, 3.0 } };

		obj1 = new MatrixOps();		// no parameter constructor
		obj2 = new MatrixOps(5);	// passing number of rows
		obj3 = new MatrixOps(5, 5); // passing in number of rows, columns
		obj4 = new MatrixOps(arr4); // passing in matrix

		obj1.setMatrix(arr4);
		System.out.println("Matrix 1 created with setMatrix method\n" + obj1);
		System.out.println("Matrix 1 sum: " + obj1.sum());
		System.out.println("Matrix 1 max: " + obj1.findMax());
		System.out.println("Matrix 1 min: " + obj1.findMin());
		System.out.println();

		obj2.setRow(0, arr);
		obj2.setRow(1, arr2);
		obj2.setRow(2, arr3);
		obj2.setRow(3, arr2);
		obj2.setRow(4, arr);
		System.out.println("Matrix 2 created by setting each row\n" + obj2);
		System.out.println("Matrix 2 sum: " + obj2.sum());
		System.out.println("Matrix 2 max: " + obj2.findMax());
		System.out.println("Matrix 2 min: " + obj2.findMin());
		System.out.println();

		for (int i = 0; i < 5; i++) {
			obj3.setRow(i, arr);
		}
		System.out.println("Matrix 3 created by setting each row with loop\n"
				+ obj3);
		System.out.println("Matrix 3 sum: " + obj3.sum());
		System.out.println("Matrix 3 max: " + obj3.findMax());
		System.out.println("Matrix 3 min: " + obj3.findMin());
		System.out.println();

		System.out.println("Matrix 4 constructed from two dimensional array\n"
				+ obj4);
		System.out.println("Matrix 4 sum: " + obj4.sum());
		System.out.println("Matrix 4 max: " + obj4.findMax());
		System.out.println("Matrix 4 min: " + obj4.findMin());
		System.out.println(obj1.getElement(0, 0));
		

	}

}
