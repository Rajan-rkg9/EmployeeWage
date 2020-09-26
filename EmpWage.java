public class EmpWage{
	public static void main(String[] args) {
		int full_time = 1;
		int wage_per_hour= 20;
		int hrs = 0;
		int wage = 0;
		int empcheck =(int)( Math.floor(Math.random() * 10) % 2);
		if (empcheck == full_time)
			hrs = 8;
		else
			hrs = 0;
		wage = hrs * wage_per_hour;
			System.out.println("Employee Wage :"+wage);
	}
}
