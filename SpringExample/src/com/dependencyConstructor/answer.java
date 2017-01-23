package com.dependencyConstructor;


	import org.springframework.beans.factory.BeanFactory;  
	import org.springframework.beans.factory.xml.XmlBeanFactory;  
	import org.springframework.core.io.ClassPathResource;  
	import org.springframework.core.io.Resource;  
	  
	public class answer {  
	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("constctr.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Question q=(Question)factory.getBean("q");  
	    q.displayInfo();  
	      
	}  
	}  

