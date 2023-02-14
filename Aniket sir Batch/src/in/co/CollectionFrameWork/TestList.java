package in.co.CollectionFrameWork;

import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Nidhi");
		list.add("Mishra");
		list.add(12345);
		list.add("hello");
		list.add(20.02);
		System.out.println(list);
		System.out.println(list.get(0));

	}

}
