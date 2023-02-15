package in.co.io;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;

public class ReadTxtFile {

	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader("C:\\Users\\admin\\Desktop\\IO\\read.txt");
		int ch = in.read();
		while (ch != -1) {
			System.out.print((char) ch);
			ch = in.read();

		}
		in.close();

	}

}
