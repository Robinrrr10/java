

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaReflectionExample {
	
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Student std = new Student();
		
		Class cls = std.getClass();
		
		System.out.println("Class name is:" + cls.getName());
		
		//Constructor constructor = std.ge
		Constructor[] constructors = cls.getConstructors();
		for(Constructor constructor : constructors) {
		System.out.println("Constructor name:" + constructor.getName());
		}
		
		Method[] methods = cls.getMethods();
		for(Method method : methods) {
			System.out.println("Methods are:" + method.getName());
		}
		
		Method methodCall = cls.getDeclaredMethod("age", int.class);
		methodCall.invoke(std, 3);
		
		Method methodCall2 = cls.getDeclaredMethod("grade", String.class);
		System.out.println(methodCall2.invoke(std, "details"));
		
		Field field1 = cls.getDeclaredField("name");
		field1.setAccessible(true);
		field1.set(std, "Ram");
		
		methodCall.invoke(std, 6);
		
		Method methodCall3 = cls.getDeclaredMethod("mark");
		methodCall3.setAccessible(true);
		methodCall3.invoke(std);
		
		
	}

}
