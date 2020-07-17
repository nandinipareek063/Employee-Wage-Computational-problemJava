import java.util.*;
public class EmpWage {
	public static void Attendance()
	{
		int Employee=(int)(Math.random()*2);
		if(Employee==1)
		{
			System.out.println("Present ");
		}
		else
			System.out.println("Absent");
	}
	public static void main(String[] args)
	{
		Attendance();
	}
}
