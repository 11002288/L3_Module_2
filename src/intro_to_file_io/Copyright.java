package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

public class Copyright {
public static void main(String[] args) {
//	Filewriter 
	try {
		FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);
		
		/*
		NOTE: To append to a file that already exists, add true as a second parameter when calling the
		      FileWriter constructor.
		      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
		*/
		
		fw.write("\nCopyright © 2017 by Bill Jobs");
			
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
