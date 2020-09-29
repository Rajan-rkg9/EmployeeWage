public class EmpWage
{
	
	public static final int part_time = 1;
	public static final int full_time = 2;
	public  String company ;
	public  int wage_per_hour,working_days,max_hours;
	public EmpWage(String company , int wage_per_hour , int working_days , int max_hours)
	{
		this.company=company;
		this.max_hours=max_hours;
		this.wage_per_hour=wage_per_hour;
		this.working_days=working_days;
	}
	
	public int computeEmpWage() {
		
		int hrs = 0;
		int totalHrs = 0;
		int totalDays = 0;
		
		for (; totalHrs <= max_hours && totalDays < working_days;) 
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
		int totalWage = totalHrs * wage_per_hour;
			System.out.println("Total Employee Wage :"+totalWage);
			return totalWage;
	}
	public static void main(String[] args) {
		EmpWage obj1 = new EmpWage("DMart" , 20 , 2 , 10);
		obj1.computeEmpWage();
		EmpWage obj2 = new EmpWage("RelianceMart" , 10 , 4 , 20);
		obj2.computeEmpWage();
	}
}
