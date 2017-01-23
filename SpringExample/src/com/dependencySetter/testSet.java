package com.dependencySetter;


	  
	import org.springframework.beans.factory.BeanFactory;  
	import org.springframework.beans.factory.xml.XmlBeanFactory;  
	import org.springframework.core.io.*;  
	 
	public class testSet {
	 
	    public static void main(String[] args)
	    {  
	          
	        Resource r=new ClassPathResource("setter.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	          
	        Employee e=(Employee)factory.getBean("obj");  
	        e.display();  
	          
	    }  
	}  


