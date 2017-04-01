package serialization;

import java.io.Serializable;

public class Person implements Serializable{
	public String name;
	
	/*when transient keyword is used property wont get serialized*/
	transient public Integer age;
	
	Person(){};
	Person(String name, Integer age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
