import java.util.*;
public class EmpWage
{	
	static String Emp;
	static int dailyEmpWage;
	static int partTimeEmpWage;
	static int wagePerHour=20;
	static int fullDayHour=8;
	static int partTime=4;
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
	public static void partTimeWage()
	{
		if(Emp=="Present")
		{
			 partTimeEmpWage=(wagePerHour*partTime);
			 System.out.println("Part time Wage of Employee is :" +partTimeEmpWage);
		}
		else
		{
			partTimeEmpWage=0;
			System.out.println("Part time wage of Employee is :"+ partTimeEmpWage);
		}
	}
	public static void main(String[] args)
	{
		Attendance();
		dailyWage();
		partTimeWage();
	}
}
