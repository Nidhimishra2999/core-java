package in.co.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileLineByLine {
	
	public static void main(String[] args) throws IOException {
		
		FileReader file= new FileReader("");
		BufferedReader b = new BufferedReader(file);
		
		String line= b.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line=b.readLine();
		}
		b.close();
		
		
		
		
	}

}
