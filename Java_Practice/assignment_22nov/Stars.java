package assignment_22nov;

import java.time.LocalDate;
import java.util.Date;

public class Stars {
	LocalDate dob;
	
	
	
	public Stars(LocalDate dob) {
		this.dob = dob;
	}



	public static void main(String[] args)
	{
		LocalDate d=LocalDate.of(2019, 11, 26);
		Stars st=new Stars(d);
		
	
	System.out.println(st.dob);
	}

}
