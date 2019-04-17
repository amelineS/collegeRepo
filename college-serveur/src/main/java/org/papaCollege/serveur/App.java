package org.papaCollege.serveur;

import org.papaCollege.service.IDepartementMetier;
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
       
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	
    	IDepartementMetier serviceD = (IDepartementMetier) ctx.getBean("serviceDepartement");
    	
    	
    }
}
