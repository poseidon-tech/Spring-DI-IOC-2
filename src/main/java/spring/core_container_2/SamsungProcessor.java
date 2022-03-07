package spring.core_container_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary//makes it primary preference
@Component("spr")
public class SamsungProcessor implements Processor {

	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Snapdragon 102934");
	}

	public void rank() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

	
	

}
