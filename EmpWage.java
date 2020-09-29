public class EmpWage
{
	
	public static final int part_time = 1;
	public static final int full_time = 2;
	public int noOfCompany =0;
	
	public CompanyEmpWage wageArray[];
	
	public EmpWage()
	{
        wageArray = new CompanyEmpWage[5];		
	}
	public void addCompanyWage(String company, int wage_per_hour, int working_days, int max_hours) {
		wageArray[noOfCompany] = new CompanyEmpWage(company, wage_per_hour, working_days, max_hours);
		noOfCompany++;
	}
	public void computeEmpWage() {
		for(int i = 0; i < noOfCompany; i++) {
			wageArray[i].setTotalWage(this.computeEmpWage(wageArray[i]));
			System.out.println(wageArray[i]);
		}
	}
	public int computeEmpWage(CompanyEmpWage obj) {
		
		int hrs = 0;
		int totalHrs = 0;
		int totalDays = 0;
		
		for (; totalHrs <= obj.max_hours && totalDays < obj.working_days;) 
		    {
			totalDays++;
			int empcheck =(int)( Math.floor(Math.random() * 10) % 3);
			switch(empcheck) {
			case part_time:
				hrs = 4;
				break;
			case full_time:
				hrs = 8;
				break;
			default:
				hrs = 0;
			
		}
			totalHrs = totalHrs + hrs;
			System.out.println("Day: " + totalDays + " Employee Hours: " + hrs);
			
		}
		int totalWage = totalHrs * obj.wage_per_hour;
			System.out.println("Total Employee Wage :"+totalWage);
			return totalWage;
	}
	public static void main(String[] args) {
		EmpWage obj = new EmpWage();
		obj.addCompanyWage("DMart", 20, 2, 10);
		obj.addCompanyWage("Reliancemart",10 , 4, 20);
		obj.computeEmpWage();
	}
}
