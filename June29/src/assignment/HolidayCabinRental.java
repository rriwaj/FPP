package assignment;

public class HolidayCabinRental extends CabinRental {
	public HolidayCabinRental(int cabinNumber) {
		// call parent class constructor to set value for cabinNumber
		super(cabinNumber);
		// add 150 to regular weekly rental rate in summer
		weeklyRentalRate = super.getWeeklyRentalRate() + 150;
	}
}
