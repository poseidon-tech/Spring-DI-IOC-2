package spring.core_container_2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("samsung")
@Scope("singleton")
public class SamsungPhone implements Phone {

	Processor sp;
	
	@Autowired //Annotation based constructor injection
	public SamsungPhone(@Qualifier("spr")Processor sp)
	{
		this.sp=sp;
		
	}
	
	public void processor()
	{
		sp.name();
	}

	public void brand() {
		// TODO Auto-generated method stub
    System.out.println("Samsung");
	}

	public void rank() {
		// TODO Auto-generated method stub
    System.out.println("2");
	}

	public void noofmodels() {
		// TODO Auto-generated method stub
	System.out.println("More than 100");
	}

	public void cost() {
		// TODO Auto-generated method stub
	System.out.println("Average cost is 15000rs");	
	}
	
	@PostConstruct
	public void start()
	{
	System.out.println("init method must not contain any arguments");	
	}
	@PreDestroy
	public void stop()
	{
	System.out.println("Destroy method called");
	}

}
