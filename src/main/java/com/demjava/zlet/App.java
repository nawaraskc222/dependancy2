package com.demjava.zlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("springxml.xml");
    	Student obj= (Student)context.getBean("idname");
    	obj.show();
    			
    	
    }
}
