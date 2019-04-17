package org.papaCollege.serveur;


import org.papaCollege.entities.Noter;
import org.papaCollege.service.INoterMetier;
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
    	
    	INoterMetier serviceN = (INoterMetier) ctx.getBean("serviceNoter");
    	
    	
    	Noter n1 = new Noter(12, null, null);
    	serviceN.ajouter(n1);
    	
    	//System.out.println(serviceN.afficher());
    	
    }
}
