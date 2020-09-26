public class EmpWage
{ 
	static final int full_time=1;
	public static void main(String[] args) {
		int empcheck=(int)(Math.floor(Math.random() * 10) % 2);
		if(empcheck == full_time)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}
