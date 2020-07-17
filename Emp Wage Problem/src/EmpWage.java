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
	static int totalWage;
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
			 empWage=dailyEmpWage;
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
			 empWage=partTimeEmpWage;
		}
		else
		{
			partTimeEmpWage=0;
			System.out.println("Part time wage of Employee is :"+ partTimeEmpWage);
		}
	}
	public static void check()
	{
		int available=(int)(Math.random()*3);
		if(available==1)
		{
			dailyWage();
			empWage=dailyEmpWage;
		}
		else if(available==2)
		{
			partTimeWage();
			empWage=partTimeEmpWage;
		}
		else
			empWage=0;
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Attendance();
		dailyWage();
		partTimeWage();
		if(Emp=="Present")
		{
			System.out.println("1.Daily Employee wage ");
			System.out.println("2. Part Time Employee wage ");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice)
    		{
    			case 1:
    				dailyWage();
    				break;
    				
    			case 2:
    				partTimeWage();
    				break;
    			default:
    				break;
    		}	
			
			System.out.println("Total wage: ");
			for(int i=1;i<=20;i++)
			{
				check();
				totalWage+=empWage;
			}
			System.out.println("Total wage for a month: "+totalWage);
		}
	}
}
