import java.util.*;
public class EmpWage implements InterfaceEmpWage
{
	
	public static final int part_time = 1;
	public static final int full_time = 2;
	
	
	public List<CompanyEmpWage> list;
	
	public EmpWage()
	{
        list = new ArrayList<>();		
	}
	public void addCompanyWage(String company, int wage_per_hour, int working_days, int max_hours) {
		CompanyEmpWage obj = new CompanyEmpWage( company,  wage_per_hour,  working_days, max_hours);
		list.add(obj);
	}
	public void computeEmpWage() {
		for(int i = 0; i < list.size(); i++) {
			CompanyEmpWage obj = list.get(i);
			obj.setTotalWage(this.computeEmpWage(obj));
			System.out.println(obj);
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
