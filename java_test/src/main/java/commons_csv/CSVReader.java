package commons_csv;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CSVReader {

	/*https://commons.apache.org/proper/commons-csv/user-guide.html
*/	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Reader in = new FileReader("file.csv");
		Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
		

	}

}
