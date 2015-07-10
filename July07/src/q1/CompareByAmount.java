package q1;

import java.util.Comparator;

public class CompareByAmount implements Comparator<Marketing> {

	@Override
	public int compare(Marketing m1, Marketing m2) {		
		return m1.getSalesAmount().compareTo(m2.getSalesAmount());
	}
}