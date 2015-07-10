package q1;

import java.util.Comparator;

public class CompareByName implements Comparator<Marketing> {

	@Override
	public int compare(Marketing m1, Marketing m2) {		
		return m1.getEmployeeName().compareTo(m2.getEmployeeName());
	}

}
