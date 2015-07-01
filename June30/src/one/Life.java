package one;

public class Life extends Insurance {
	public Life(String insuranceType) {
		super(insuranceType);
	}

	public void setCost() {
		monthlyPrice = 36;
	}
	public String display() {
		String output = "You chose Life Insurance\n";
		output += String.format("Monthly Fee: %.2f", super.getMonthlyPrice());
		return output;
	}
}