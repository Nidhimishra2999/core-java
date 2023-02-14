package in.co.CollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Nidhi");
		set.add(9999);
		set.add(20.20);
		set.add("Nidhi");
		set.add(null);
		set.add(null);
		//System.out.println(set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
