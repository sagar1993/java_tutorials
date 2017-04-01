package commons_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class IOUtils {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		InputStream in = new URL("http://commons.apache.org").openStream();
		try {
			InputStreamReader inR = new InputStreamReader(in);
			BufferedReader buf = new BufferedReader(inR);
			String line;
			while ((line = buf.readLine()) != null) {
				//System.out.println(line);
			}
		} finally {
			in.close();
		}
		
		//FileUtils
		
		LineIterator it = FileUtils.lineIterator(new File("database.properties"), "UTF-8");
		 try {
		   while (it.hasNext()) {
		     String line = it.nextLine();
		     System.out.println(line);
		   }
		 } finally {
		   LineIterator.closeQuietly(it);
		 }
		 
		 //FileSystemUtils
		 long freeSpace = FileSystemUtils.freeSpace("C:/");
		 System.out.println(freeSpace);
	}

}
