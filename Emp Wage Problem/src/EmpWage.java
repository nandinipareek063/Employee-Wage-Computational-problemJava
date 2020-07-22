import java.util.Random;
public class EmpWage implements ICompany{

        public static final int isPartTime=1;
        public static final int isFullTime=2;

        private int numOfCompany=0;
        private CompanyEmpWage[] companyEmpWageArray;

        public EmpWage(){
        companyEmpWageArray = new CompanyEmpWage[5];
        }

         public void addCompanyEmpWage(String company, int empRatePerHr, int
                                        numWorkingDays, int maxHrInMonth){

        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHr, numWorkingDays, maxHrInMonth);
        numOfCompany++;
       }


        public void employeeWageCompute(){
        for(int i=0; i<numOfCompany; i++){
            companyEmpWageArray[i].setTotalEmpWage(this.employeeWageComputation(companyEmpWageArray[i]));
        System.out.println(companyEmpWageArray[i]);
        }
        }


        public int employeeWageComputation(CompanyEmpWage companyEmpWage){


        int hour=0;
        int salary=0;
        int counter=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;

        while( totalEmpHrs < companyEmpWage.maxHrInMonth && totalWorkingDays < companyEmpWage.numWorkingDays){
       
        Random rand = new Random();

        
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
        	ICompany I1=new EmpWage();
        I1.addCompanyEmpWage("Dmart",10,10,100);
        I1.addCompanyEmpWage("Big bazar",20,20,80);
        I1.employeeWageCompute();

        }


}
