package commons_cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/* -help -t test
 * */

public class CliTest {
	// create Options object
	static Options options = new Options();

	public static void main(String [] argv) throws ParseException{
		

		// add t option
		// 2nd argument add argument if false it just checks for option
		
		options.addOption("t", true, "command line arg test");
		options.addOption("h", "help", false, "command line arg test");
		
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse(options, argv);
		
		// check for value
		
		if(cmd.hasOption("t")) {
			   String value = cmd.getOptionValue("t");
			   System.out.println(value);
			}
		
		if(cmd.hasOption("h")) {
		   help();
		}
		
	}

	private static void help() {
		
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("Main", options);
		
	}
}
