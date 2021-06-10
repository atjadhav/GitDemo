import java.awt.List;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class AtulTest1 {

			// TODO Auto-generated method stub
		
		//Count names start with letter a
	@Test	
	public void Regular()
		{
		ArrayList<String> names= new ArrayList<String>();
		
		names.add("Abijeet");
		names.add("Ram");
		names.add("Adam");
		names.add("Don");
		names.add("Rajesh");
		int count=0;
		for (int i=0; i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			 count++;				
		}
		System.out.println(count);
	}


	
}
