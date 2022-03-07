package spring.core_container_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("rm")
public class RedmiPhone implements Phone {
	@Autowired
	@Qualifier("redmiProcessor")
	Processor rp;
	
	public void brand() {
		// TODO Auto-generated method stub
		System.out.println("Redmi from china");
	}

	public void rank() {
		// TODO Auto-generated method stub
       System.out.println("3");
	}

	public void noofmodels() {
		// TODO Auto-generated method stub
		System.out.println("10");
	}

	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("average cost is 10000rs");
	}
	
		public void processor()
	{
		rp.name();
	}
	

}
