public class EmployeeWage{
	public static void main(String[] args) {
		int full_time = 2;
		int part_time = 1;
		int wage_per_hour = 20;
		int hrs = 0;
		int wage = 0;
		int empcheck =(int)( Math.floor(Math.random() * 10) % 3);
		if (empcheck == full_time)
			hrs = 8;
		else if(empcheck == part_time)
			hrs = 4;
		Wage = hrs * wage_per_hour;
			System.out.println("Employee Wage :"+Wage);
		}
}
