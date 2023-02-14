package in.co.io;

import java.io.FileWriter;
import java.io.IOException;

public class ss {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(" D:\\xyz\\xyz.java");
		fw.write('a');
		// fw.write('/n');
		fw.write("hello");
		fw.write("java");
		fw.close();
		System.out.println("D:\\xyz\\xyz");

	}

}
