public class CompanyEmpWage {
	
	public final String company;
	public final int wage_per_hour;
	public final int working_days;
	public final int max_hours;
	public int totalWage;
	
	public CompanyEmpWage(String company, int wage_per_hour, int working_days, int max_hours) {
		this.company = company;
		this.wage_per_hour = wage_per_hour;
		this.working_days =working_days;
		this.max_hours = max_hours;
	}
	
	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
	
	@Override
	public String toString() {
		return "Total Employee Wage for Company: " +company+" is: " +totalWage;
	}
}

