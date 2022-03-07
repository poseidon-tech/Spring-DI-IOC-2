package spring.core_container_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ApplePhone implements Phone {
	Processor ap;
	
	public void brand() {
		// TODO Auto-generated method stub
		System.out.println("Apple");
	}

	public void rank() {
		// TODO Auto-generated method stub
    System.out.println("1");
	}

	public void noofmodels() {
		// TODO Auto-generated method stub
	System.out.println("15");
	}

	public void cost() {
		// TODO Auto-generated method stub
	System.out.println("Average Cost is 50000rs");
	}
	
	public void processor() 
	{
		ap.name();
	}
	
	@Autowired   //Annotation based method injection
	@Qualifier("appleProcessor") 
	public void appleProcessor(Processor ap)
	{
		this.ap=ap;
	}

}
