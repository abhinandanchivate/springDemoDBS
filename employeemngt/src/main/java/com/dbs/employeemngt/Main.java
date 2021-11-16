package com.dbs.employeemngt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dbs.employeemngt.config.Config;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// do we need that service / repository object?
		ApplicationContext applicationContext = new 
				AnnotationConfigApplicationContext(Config.class);
		// informing that we are using java based annotation strategy to 
		// create the spring env.  
		
		

	}

}
