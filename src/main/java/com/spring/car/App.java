package com.spring.car;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	
    	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
          
          Car c = (Car)context.getBean("car");
          c.start();
          System.out.println("gear: "+c.changeGear(4));
          c.stop();
          
          context.close();
      }

	
}
        
