package UC1_Employee_Wage;

import java.util.Random;

public class EmployeePresentAbsent {

	public static void main(String[] args) {
		int isPresent = 1;
		int isAbsent = 0;
		
		Random random = new Random();
		
		int randomNumber = random.nextInt(2);
		
		if(randomNumber == isPresent)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}

	}

}
