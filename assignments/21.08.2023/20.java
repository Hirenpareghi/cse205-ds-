import java.util.Scanner;

public class MatrixFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the matrix (n): ");
        int n = scanner.nextInt();

        System.out.println("Enter the matrix elements row by row:");
        double[][] A = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextDouble();
            }
        }

        scanner.close();

        if (isInvertible(A)) {
            double[][] identity = new double[n][n];
            for (int i = 0; i < n; i++) {
                identity[i][i] = 1;
            }

            System.out.println("Matrix A is invertible. Performing factorization into elementary matrices:");
            double[][][] elementaryMatrices = factorizeIntoElementaryMatrices(A, identity);

            for (int i = 0; i < elementaryMatrices.length; i++) {
                System.out.println("Elementary Matrix " + (i + 1) + ":");
                printMatrix(elementaryMatrices[i]);
            }
        } else {
            System.out.println("Matrix A is not invertible.");
        }
    }

    public static boolean isInvertible(double[][] matrix) {
        // Check if matrix is invertible (e.g., using determinant or other methods)
        // Return true if invertible, false otherwise
        // Implement your logic here
        return true; // Replace with actual logic
    }

    public static double[][][] factorizeIntoElementaryMatrices(double[][] A, double[][] identity) {
        // Perform factorization into elementary matrices using your method of choice
        // Return an array of elementary matrices
        // Implement your logic here
        return new double[][][]{}; // Replace with actual logic
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
