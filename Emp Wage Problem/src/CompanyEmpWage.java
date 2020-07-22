public class CompanyEmpWage {

	public static String company;
	public static int empRatePerHr;
	public static int numWorkingDays;
	public static int maxHrInMonth;
	public int totalSalary;

	public CompanyEmpWage(String company, int empRatePerHr, int 
					numWorkingDays, int maxHrInMonth){

		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numWorkingDays = numWorkingDays;
		this.maxHrInMonth = maxHrInMonth;
	}

	public void setTotalEmpWage(int totalSalary){

	this.totalSalary = totalSalary;
	}

	@Override
	public String toString(){
	return ("Total Emp wage for company "+ company +" is: "+ totalSalary);

	}
}