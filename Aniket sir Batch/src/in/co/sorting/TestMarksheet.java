package in.co.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestMarksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList Marksheet= new ArrayList();
		
		Marksheet.add(new Marksheet("01A", "Nidhi", "Mishra", 85));
		Marksheet.add(new Marksheet("02B", "Darshan", "Jain", 87));
		Marksheet.add(new Marksheet("03C", "Shaswat", "Mandre", 89));
		Marksheet.add(new Marksheet("04D", "Aniket", "Kumawat", 90));
		
		
		Collections.sort(Marksheet, new OrderByCondition());
		for (Object o : Marksheet) {
			System.out.println(o);
			
		}
		
		
		
		
		
		
		
		
		

	}

}
