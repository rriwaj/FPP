package assignment;

//On page 99, there is table 3-8.  We will only use the top three rows.
//Create a two dimensional table with  3  rows and  6  columns.
//Put the data from the top 3 rows of table 3-8 into your table.
//
//a) Print out the average of each row.
//b) Print out the average of each column.
public class TwoDimensional {

	public static void main(String args[]) {
		final int InterestRate = 10;
		final int Year = 3; // row
		final int Rate = 6; // column
		double avgRow = 0;
		double balance[][] = new double[Year][Rate];
		// input 10000 in all columns of row 1
		for (int j = 0; j < Rate; j++) {
			balance[0][j] = 10000;
		}
		double interestRate[] = new double[Rate];
		// for rate in decimal
		for (int j = 0; j < Rate; j++) {
			interestRate[j] = (InterestRate + j) / 100.0;
		}
		// finding interest
		for (int i = 1; i < Year; i++) {
			for (int j = 0; j < Rate; j++) {
				double oldBalance = balance[i - 1][j];
				double interest = oldBalance * interestRate[j];
				balance[i][j] = oldBalance + interest;
			}
		}
		// print interest rates in header
		for (double rate : interestRate) {
			System.out.printf("%9.0f%%", 100 * rate);
		}
		System.out.println();
		// print table values
		for (double[] row : balance) {
			for (double r : row) {
				System.out.printf("%10.2f", r);
			}
			System.out.println();
		}
		System.out.println();
		double[] colSum = new double[balance[0].length];
		for (int i = 0; i < Year; i++) {
			for (int j = 0; j < Rate; j++) {
				avgRow = avgRow + balance[i][j];
				colSum[j] += balance[i][j];
			}
			int a = i + 1;
			System.out.printf("Average of row %d = %.2f \n", a, avgRow / Rate);
			avgRow = 0;
		}
		System.out.println();
		for (int k = 0; k < colSum.length; k++) {
			System.out.printf("Average of column %d =  %.2f \n", (k + 1),
					colSum[k] / 3);
			
		}
	}
}