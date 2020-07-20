import java.util.*;
public class EmpWage
{	
	static String Emp;
	static int dailyEmpWage;
	static int partTimeEmpWage;
	static int wagePerHour=20;
	static int fullDayHour=8;
	static int partTime=4;
	static int empWage;
	static int empHours;
	static int totalWage;
	static int workingDays=0;
	static int totalHours=0;
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
	public static void check()
	{
		int available=(int)(Math.random()*3);
		if(available==1)
		{
			if(Emp=="Present")
			{	 
				 
				 dailyEmpWage=(wagePerHour*fullDayHour);
				 System.out.println("Daily Wage of Employee is :" +dailyEmpWage);
				 empWage=dailyEmpWage;
			}
			else
			{
				dailyEmpWage=0;
				System.out.println("Daily wage of Employee is :"+ dailyEmpWage);
			}
			empWage=dailyEmpWage;
		}
		else if(available==2)
		{
			if(Emp=="Present")
			{	
				 partTimeEmpWage=(wagePerHour*partTime);
				 System.out.println("Part time Wage of Employee is :" +partTimeEmpWage);
				 empWage=partTimeEmpWage;
			}
			else
			{
				partTimeEmpWage=0;
				System.out.println("Part time wage of Employee is :"+ partTimeEmpWage);
			}
			empWage=partTimeEmpWage;
		}
		else
			System.out.println("Absent");
			empWage=0;
		
	}
	public static void empComputation(){
		if(Emp=="Present")
		{
			while (totalHours<=100 && workingDays<20)
			{
				workingDays++;
				int ch=(int)Math.floor(Math.random()*10)%3;
				{
		
					switch(ch)
					{
						case 1:
							empHours=8;
							break;
				
						case 2:
							empHours=4;
							break;
						default:
							empHours=0;
					}
					totalHours+=empHours;
					empWage=empHours*wagePerHour;
					System.out.println("Day: "+workingDays+" empWage:"+empWage);
				}	
			}
			totalWage=totalHours*wagePerHour;
			System.out.println("total employee wage"+totalWage);
		}
	}

	public static void main(String[] args)
	{
		
		Attendance();
		check();
		EmpWage obj=new EmpWage();
		obj.empComputation();
	}
}