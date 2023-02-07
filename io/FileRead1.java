package in.co.io;

import java.io.FileReader;
import java.io.IOException;

public class FileRead1 {

	public static void main(String[] args) throws Exception {
	 
		try( FileReader in = new FileReader("C:\\\\Users\\\\admin\\\\Desktop\\\\IO\\\\read.txt ")){
			int ch= in.read();
				while(ch!=-1)
				{
					System.out.println((char)ch);
					ch= in.read();
				}
	}
	}
}

				
			
			


