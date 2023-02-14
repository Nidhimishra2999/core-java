package in.co.sorting;

import java.util.Comparator;

public  class OrderByfName implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		// TODO Auto-generated method stub
		return m1.firstName.compareTo(m2.firstName);
	}
	 

}
