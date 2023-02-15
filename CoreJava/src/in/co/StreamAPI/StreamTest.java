package in.co.StreamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class StreamTest {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Darshan");
		list.add("Shaswat");
		list.add("Nidhi");
		list.add("Shubham");
		list.add("Aniket");
		list.add("Pojja");
		list.add("Darshan Jain");

		System.out.println(list);

		list.stream().sorted().forEach(e -> {
			System.out.println(e);

		});

	}

}
