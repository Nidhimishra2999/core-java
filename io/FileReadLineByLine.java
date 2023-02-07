package in.co.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class FileReadLineByLine {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\\\\\\\Users\\\\\\\\admin\\\\\\\\Desktop\\\\\\\\IO\\\\\\\\read.txt ");
		BufferedReader in = new BufferedReader(file);

		String line = in.readLine();
		while (line != null) {
			System.out.println(line);
			line = in.readLine();
		}
		in.close();

	}

}
