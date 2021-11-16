package com.dbs.employeemngt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// spring application related all objects which are commonly reqd 
// we will declare them here
// we will provide the base pacakge name & it will help spring to 
// create other objects for service , repo etc.
@Configuration
@ComponentScan(basePackages = "com.dbs.employeemngt")
public class Config {

}
