import java.util.*;
public class EmpWage
{
	
	static int wagePerHour=20;
	static int fullDayHour=8;
	static int partTime=4;
	static int empWage;
	static int empHours;
	static int monthlyWage;
	static int totalHours=0;
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
			//System.out.println("Day: "+day+" empWage:"+dailyWage);
      }
		//System.out.println("Monthly Wage of "+company+" is: "+monthlyWage);
	}
	@Override
	public String toString(){
		
		return "Total emp wage for "+company + " is " +monthlyWage;
		
	}
	public static void main(String[] args)
	{
		EmpWage company1 = new EmpWage("Jio", 30, 8, 120, 20);
		company1.employeeMonthlyWage();
		System.out.println(company1);
		EmpWage company2 = new EmpWage("infosys", 20, 8, 100, 20);
		company1.employeeMonthlyWage();
		System.out.println(company2); 
	}

}
