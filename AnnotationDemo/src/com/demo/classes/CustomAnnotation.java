package com.demo.classes;

import java.lang.reflect.Method;

public class CustomAnnotation {

	@com.demo.implementation.CustomAnnotation(id=200,desc="Kamal")
	public void setUp() {
		
	}
	
	public CustomAnnotation() {
		
	}
	public static void main(String[] args) {
		try {
			Class classObj=Class.forName("com.demo.classes.CustomAnnotation");
			Method methods[] = classObj.getDeclaredMethods();
			for(Method method : methods) {
				System.out.println(method);
				if(method.getName().equals("setUp")){
					com.demo.implementation.CustomAnnotation customAnnotation = method.getAnnotation(com.demo.implementation.CustomAnnotation.class);
					System.out.println(customAnnotation.desc());
					System.out.println(customAnnotation.id());
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
