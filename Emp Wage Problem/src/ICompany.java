
public interface ICompany {
	public void addCompanyEmpWage(String company, int empRatePerHour,int numWorkingDays,int maxHrInMonth);
	public void employeeWageCompute();
	int getTotalWage(String company);

	}
