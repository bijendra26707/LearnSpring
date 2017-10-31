package test;

import java.util.ResourceBundle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {

	public static void main(String[]args){
		
		//By using core container(Bean factory) using Pojo class,Without load on start up(Lazy container)
		//Bean factory container will create instance at the time of user requests but Advance context creates instance at the time of loading xml.and y default beans scope will be Singleton
		
		/*Resource r= new ClassPathResource("resources/spring.xml");
		BeanFactory factory = new XmlBeanFactory(r) ;
		Object o = factory.getBean("t");
		Object o1 = factory.getBean("t");
		Object o2 = factory.getBean("t");
		Object o3 = factory.getBean("t");
		Test test = (Test)o;
		test.hello();
		
	*/
		//By Advance container(Application container can be said eager container )
		ApplicationContext ap=new FileSystemXmlApplicationContext("C:\\Users\\Bijendra_Kumar\\workspace\\LearnSpring\\src\\resources\\Spring.xml");
		Object eager = ap.getBean("t");
		Object eager1 = ap.getBean("t");
		Object eager2 = ap.getBean("t");
		Object eager3 = ap.getBean("t");
		Test testEager = (Test)eager;
		testEager.hello();
		
	}
}
