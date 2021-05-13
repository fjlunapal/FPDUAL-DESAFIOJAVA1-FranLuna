package variables;

public class Developer {
	
	/**
	 * Variables
	 */
	private final String company = "Everis";
	private String name;
	private static byte employees_amount=0;
	private int employee_id;
	private int holidays = 21;
	
	/** Método constructor*/
	public Developer(String name) {
		this.name = name;
		Developer.employees_amount++;
		employee_id=employees_amount;
	}

	public static byte getEmployees_amount() {
		return employees_amount;
	}

	public static void setEmployees_amount(byte employees_amount) {
		Developer.employees_amount = employees_amount;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getHolidays() {
		return holidays;
	}

	public void setHolidays(int holidays) {
		this.holidays = holidays;
	}

	public int reduceHolidays(int days) {
		int res;

		if (this.getHolidays() >= days && days > 0) {
			res = getHolidays() - days;
			setHolidays(res);
		} else {
			res = getHolidays();
			System.out
			.println("You surpassed the limit of holidays");
		}

		return res;

	}

}
