package in.co.sorting;

import java.util.Comparator;

public class OrderByCondition implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		// TODO Auto-generated method stub
		
		if(m1.firstName.equals(m2.firstName)) {
			return m1.lastName.compareTo(m2.lastName);
		
		}else {
			return m1.firstName.compareTo(m2.firstName );
		}
		
	}

}
