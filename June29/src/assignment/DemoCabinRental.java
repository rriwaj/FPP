package assignment;

public class DemoCabinRental {
	public static void main(String[] args) {
		CabinRental c1 = new CabinRental(1);
		int cabinNumber = c1.getCabinNumber();
		double weeklyRentalRate = c1.getWeeklyRentalRate();

		System.out.printf(
				"Cabin Rental weekly rental rate of cabin number %d is %.2f",
				cabinNumber, weeklyRentalRate);
		System.out.println();
		HolidayCabinRental h1 = new HolidayCabinRental(1);
		cabinNumber = h1.getCabinNumber();
		weeklyRentalRate = h1.getWeeklyRentalRate();
		System.out
				.printf("Holiday Cabin Rental weekly rental rate of cabin number %d is %.2f",
						cabinNumber, weeklyRentalRate);
	}
}
