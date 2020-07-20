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
	
	public static void check()
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

	private static final int fullTime = 1;
	private static final int partTime1 = 2;

	private static String company;
	private static int dayPerMonth;

	EmpWage( String company, int wagePerHour, int fullDayHour, int totalHours, int dayPerMonth) {
		this.company=company;
		this.wagePerHour = wagePerHour;
		this.fullDayHour = fullDayHour;
		this.totalHours = totalHours;
		this.dayPerMonth = dayPerMonth;
	}

	private static void employeeMonthlyWage() {
		
		int dailyWage = 0;
		int dailyHours;
		int monthlyWage = 0;
		int hours = 0;
		int day = 0;
		
		while ( hours <= totalHours && day < dayPerMonth )
		{
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case fullTime:
					dailyHours = fullDayHour;
					break;
				case partTime1:
					dailyHours = partTime;
					break;
				default:
					dailyHours = 0;
					break;
			}
			
			day++;
			dailyWage = wagePerHour * dailyHours;
			monthlyWage += dailyWage;
			System.out.println("Day: "+day+" empWage:"+dailyWage);
      }
		System.out.println("Monthly Wage of "+company+" is: "+monthlyWage);
	}

	public static void main(String[] args)
	{
		//check();
		//EmpWage.empComputation();
		EmpWage company1 = new EmpWage("Jio", 30, 8, 120, 20);
		company1.employeeMonthlyWage();
		EmpWage company2 = new EmpWage("infosys", 20, 8, 100, 20);
		company2.employeeMonthlyWage();  
	}

}