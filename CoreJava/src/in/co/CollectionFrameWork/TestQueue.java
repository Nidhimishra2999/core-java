package in.co.CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;

public class TestQueue {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.offer("Darshan");
		l.offer("shaswat");
		l.offer(12345);
		l.offer(2020.20);
		l.add(null);

		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
