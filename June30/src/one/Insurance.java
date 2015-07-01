package one;

public abstract class Insurance {
	double monthlyPrice;
	private String insuranceType;

	public Insurance(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public double getMonthlyPrice() {
		return monthlyPrice;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public abstract void setCost();

	public abstract String display();
}
