package one;

public class Health extends Insurance {
	public Health(String insuranceType) {
		super(insuranceType);
	}

	public void setCost() {
		monthlyPrice = 196;
	}

	public String display() {
		String output = "You chose Health Insurance\n";
		output = output
				+ String.format("Monthly Fee: %.2f", super.getMonthlyPrice());
		return output;
	}
}
