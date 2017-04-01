package commons_beanutil;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class BeanUtils_Test {

	
	
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		Field [] fields = person.getClass().getDeclaredFields();
		
		for(Field field : fields){
			System.out.println(field.getName());
			BeanUtils.setProperty(person, field.getName(), "1");
			String property = BeanUtils.getProperty(person, field.getName());
			System.out.println(property);
		}

	}

}
