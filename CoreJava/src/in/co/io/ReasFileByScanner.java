package in.co.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReasFileByScanner {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\admin\\Desktop\\read.txt ");
		Scanner sc = new Scanner(fr);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		fr.close();

	}

}
