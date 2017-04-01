package commons_exec;

import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;

public class ExecTest {

	/*Used to execute commands via java*/
	
	public static void main(String[] args) throws ExecuteException, IOException {
		// TODO Auto-generated method stub

		String command = "ipconfig";
		CommandLine cmd = CommandLine.parse(command);
		DefaultExecutor executor = new DefaultExecutor();
		executor.execute(cmd);
		
	}

}
