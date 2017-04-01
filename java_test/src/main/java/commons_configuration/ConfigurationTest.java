package commons_configuration;

import java.io.File;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.convert.DefaultListDelimiterHandler;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class ConfigurationTest {

	public static void main(String[] args) throws ConfigurationException {
		// TODO Auto-generated method stub

		Configurations configs = new Configurations();
		Configuration config = configs.properties(new File("database.properties"));

		System.out.println(config.getString("database.hostname"));

		
		
		/* Method 2 */

		Parameters params = new Parameters();

		/*
		 * .setListDelimiterHandler(new DefaultListDelimiterHandler(',')) To set
		 * list dilimeter by default disabled
		 */

		FileBasedConfigurationBuilder<FileBasedConfiguration> builder = new FileBasedConfigurationBuilder<FileBasedConfiguration>(
				PropertiesConfiguration.class)
						.configure(params.properties().setFileName("database.properties")
								.setListDelimiterHandler(new DefaultListDelimiterHandler(',')));

		Configuration config1 = builder.getConfiguration();

		String[] colors = config1.getStringArray("colors.pie");
		for (String color : colors) {
			System.out.println(color);
		}

		config1.setProperty("database.hostname", "ME");
		//builder.save();

		System.out.println(config1.getString("database.hostname"));
	}

}
