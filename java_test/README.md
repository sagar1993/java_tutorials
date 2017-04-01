# java_tutorials
Simple use cases for java API and libraries.


# BeanUtils
Direct-easy access to java classes that follows java beanstructure by providing wrapper around java.lang.reflect and java.beans.

public class Person{
	String name;
	
	public void getName(){
		return this.name;
	}
	public void setName(String Name){
		this.name = Name;
	}
}

public static void main(String [] args){
	Person person = new Person();
	
	// get all fields using reflection API
	Field [] fields = person.getClass().getDeclaredFields();

	for(Field field : fields){
		System.out.println(field.getName());
		
		BeanUtils.setProperty(person, field.getName(), <value>);
	
		String property = BeanUtils.getProperty(person, field.getName());
	}
}


# JavaBean

Encapsulates many components, easy maintenance
It is a class which follows following conventions
no arg constructor
getter setter method
Serializable

# Serialization 
Process of converting object into byte-stream. Travel object’s state via network marshelling.

# Java.io.serialization
Marker interface, String and Wrapper classes are by default serializable
ObjectOutPutStream class
Class used to write object to outputstream
ObjectInputStream class
Class to get object from in stream


# Transient keyword

Used when we dont want to serialize certain data member from class.

Class Person implements Serializable{

	Person(){};
	
	String name;
	transient String age;
}


# Commons Chain

Commons chain is library used to run chain of commands
The basic units are

Chain
Command
Filter
Catalog
Context

# Commons Compress
Api for working with compressed files



# Commons Configuration
https://commons.apache.org/proper/commons-configuration/userguide/howto_properties.html

The apache commons configuration provide api to read and write constant data from configuration files.

database.properties
database.host=abcd
database.port=123

Reading from configuration file

Configurations configs = new Configurations();
Configuration config = configs.properties(new File(“path”));



Accessing configs

String host = config.getString(“database.host”);

Updating Config
config.setProperty(“database.host”, value);

Save configurations 
Make use of configuration builders


# Commons CSV

https://commons.apache.org/proper/commons-csv/user-guide.html

To work with csv files

# Commons Exec

To execute commands via java

String line = “-----command----”
CommandLine cmd = CommandLine.parse(line);
DefaultExecutor executor = new DefaultExecutor();
executor.execute(cmd);


# Commons IO

IOUtils
Method to read write and copy works with InputStream OutputStream

FileUtils
FileSystemUtils

# Commons CLI

Used to parse command line options

Options options = new Options();
options.addOption(“t”, true, “description”)

CommandLineParser parser = new DefaultParser();
CommandLine cmd = parser.parse(options, argv);
boolean value = cmd.hasOption(“t”);
String value = cmd.getOptionValue(“t”)


# Commons Collection

Utility classes for java collections


# Commons Text

# Commons Lang

Provides helper utility for java.lang.API

org.apache.commons.lang3.StrinUtils
All methods are static

# Commons Imaging

Library to play with image data.
https://commons.apache.org/proper/commons-imaging/sampleusage.html


# Commons Validator
To validate xml


# Commons Email

To send email 
EmailAttachment attachement = new EmailAttachment();

MultiPartEmail email = new MultiPartEmail();
.
. configs
.
email.attach(attachment)
email.send();


