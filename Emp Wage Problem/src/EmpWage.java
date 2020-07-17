import java.util.*;
public class EmpWage
{	
	static String Emp;
	static int dailyEmpWage;
	static int wagePerHour=20;
	static int fullDayHour=8;
	public static void Attendance()
	{
		int Employee=(int)(Math.random()*2);
		if(Employee==1)
		{
			Emp="Present";
			System.out.println("Present ");
		}
		else
			System.out.println("Absent");
	}
	public static void dailyWage()
	{
		if(Emp=="Present")
		{
			 dailyEmpWage=(wagePerHour*fullDayHour);
			 System.out.println("Daily Wage of Employee is :" +dailyEmpWage);
		}
		else
		{
			dailyEmpWage=0;
			System.out.println("Daily wage of Employee is :"+ dailyEmpWage);
		}
	}
	public static void main(String[] args)
	{
		Attendance();
		dailyWage();
	}
}
