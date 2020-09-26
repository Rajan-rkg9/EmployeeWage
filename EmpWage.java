public class EmployeeWage{
	
	public static final int part_time = 1;
	public static final int full_time = 2;
	public static final int wage_per_hour = 20;
	public static final int working_days = 20;
	
	public static void main(String[] args) {
		
		int hrs = 0;
		int wage = 0;
		int totalWage = 0;
		
		for (int day = 0; day < working_days; day++)
		    {
			int empcheck =(int)(Math.floor(Math.random() * 10) % 3);
			switch (empcheck) {
			case part_time:
				hrs = 4;
				break;
			case full_time:
				hrs = 8;
				break;
			default:
				hrs = 0;
			
		}
			wage = hrs * wage_per_hour;
			totalWage = totalWage + wage;
			System.out.println("Employee Wage : "+wage);
		}
		
			System.out.println("Total Employee Wage :"+totalWage);
	}
}
