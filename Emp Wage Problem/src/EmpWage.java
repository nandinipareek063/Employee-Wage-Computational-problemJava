import java.util.ArrayList;

public class EmpWage implements ICompany{

        public static final int isPartTime=1;
        public static final int isFullTime=2;
        private ArrayList<CompanyEmpWage> companyEmpWageList;
        private int numOfCompany=0;
        //private CompanyEmpWage[] companyEmpWageArray;

        public EmpWage(){
        //companyEmpWageArray = new CompanyEmpWage[5];
        	companyEmpWageList=new ArrayList<>(); 
        }

         public void addCompanyEmpWage(String company, int empRatePerHr, int
                                        numWorkingDays, int maxHrInMonth){

        CompanyEmpWage companyEmpWage= new CompanyEmpWage(company, empRatePerHr, numWorkingDays, maxHrInMonth);
        	 
        	 companyEmpWageList.add(companyEmpWage);
        	 numOfCompany++;
       }


        public void employeeWageCompute(){
        for(int i=0; i<companyEmpWageList.size(); i++){
        	CompanyEmpWage companyEmpWage= companyEmpWageList.get(i);
        	companyEmpWage.setTotalEmpWage(this.employeeWageCompute(companyEmpWage));
        	System.out.println(companyEmpWage);
        }
        }


        public int employeeWageCompute(CompanyEmpWage companyEmpWage){


        int hour=0;
        int salary=0;
        int counter=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;

        while( totalEmpHrs < companyEmpWage.maxHrInMonth && totalWorkingDays < companyEmpWage.numWorkingDays){
       

        
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        counter+=1;
        totalWorkingDays+=1;

        switch(empCheck){
        case isFullTime:
            hour=8;
            break;
        case isPartTime:
                hour=4;
                break;
       
        default:
                hour=0;
           }

        System.out.println("Day "+counter+"  Emp Hour= "+hour+" salary is: "+(companyEmpWage.empRatePerHr)*hour);
        totalEmpHrs = totalEmpHrs+hour;
        }



        return totalEmpHrs*companyEmpWage.empRatePerHr;
        

    }


        public static void main(String args[]){
            ICompany company=new EmpWage();
        	 company.addCompanyEmpWage("Dmart",10,10,100);
        	 company.employeeWageCompute();
        	 company.addCompanyEmpWage("Big bazar",20,20,80);
        	 company.employeeWageCompute();
        }


}
