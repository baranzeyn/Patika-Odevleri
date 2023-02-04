
public class Main {

	public static void main(String[] args) {
		Employee emp1=new Employee("zeynep", 12000.0, 40, 2018);
		emp1.bonus=emp1.bonus(40);
		emp1.tax=emp1.tax(12000.0);
		emp1.raise=emp1.raiseSalary(2018, 12000.0);
		emp1.toSring();

	}

}
