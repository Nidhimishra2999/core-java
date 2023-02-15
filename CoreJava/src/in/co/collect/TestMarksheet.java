package in.co.collect;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestMarksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();

		MarkSheet m1 = new MarkSheet("01", "Nidhi", 80, 85, 90);
		MarkSheet m2 = new MarkSheet("02", "Darshan", 90, 85, 80);
		MarkSheet m3 = new MarkSheet("03", "Shaswat", 90, 85, 95);

		// HashMap map = new HashMap();
		// map.put(m2, "Darshan");
		// System.out.println(map.get(m2));

		l.add(m1);
		l.add(m2);

		Iterator it = l.iterator();
		while (it.hasNext()) {
			MarkSheet m = (MarkSheet) it.next();

			System.out.println(m.getName() + " " + " ");
			System.out.println(m.getRoll() + " " + " ");
			System.out.println(m.getPhysic() + " " + " ");
			System.out.println(m.getChemistry() + " " + " ");
			System.out.println(m.getMaths() + " " + " ");

		}

	}

}
