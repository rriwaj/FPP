package assignment;

public class CabinRental {

	private int cabinNumber;
	double weeklyRentalRate;

	public CabinRental(int cabinNumber) {
		this.cabinNumber = cabinNumber;
		if (this.cabinNumber >= 1 && this.cabinNumber <= 3) {
			weeklyRentalRate = 950;
		} else {
			weeklyRentalRate = 1100;
		}
	}

	public int getCabinNumber() {
		return cabinNumber;
	}

	public double getWeeklyRentalRate() {
		return weeklyRentalRate;
	}

}
