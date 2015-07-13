package q1;

public class Marketing {
	private String employeeName;
	private String productName;
	private double salesAmount;

	public Marketing(String employeeName, String productName, double salesAmount) {
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmount = salesAmount;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public String getProductName() {
		return this.productName;
	}

	public Double getSalesAmount() {
		return this.salesAmount;
	}

	@Override
	public String toString() {
		String output;
		output = String
				.format("Employee Name: \"%s\" Product Name: \"%s\", Sales Amount: \"%.2f\"",
						employeeName, productName, salesAmount);
		return output;
	}
}
