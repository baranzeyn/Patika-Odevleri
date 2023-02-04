
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	double tax = 0.0;
	int bonus = 0;
	double raise = 0;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax(double salary) {
		if (salary < 1000) {
			return 0.0;
		} else {
			tax = salary * 0.30;
			return tax;
		}
	}

	public int bonus(int workHours1) {
		int bonusHours = workHours1 - 40;
		if (bonusHours > 0) {
			int bonus = (30 * bonusHours);
			return bonus;
		}

		else {
			return 0;
		}
	}

	public double raiseSalary(int hireYear, double salary) {
		int thisYear = 2021, workYears;
		workYears = thisYear - hireYear;
		if (workYears > 0 && workYears < 10) {
			raise =(salary * 0.05);
			return  raise;
		} else if (workYears > 9 && workYears < 20) {
			raise = (salary * 0.10);
			return  raise;
		} else if (workYears > 19) {
			raise = (salary * 0.15);
			return  raise;
		} else {
			System.out.println("Hatalı tuşlama yaptınız");
			return 0;
		}

	}

	public void toSring() {
		System.out.println("Çalışanın adı : " + this.name);
		System.out.println("Çalışanın maaşı : " + this.salary);
		System.out.println("Çalışanın çalışma saatleri : " + this.workHours);
		System.out.println("Çalışanın başlangıç yılı : " + this.hireYear);
		System.out.println("Çalışanın alacağı vergi : " + this.tax);
		System.out.println("Çalışanın alacağı bonus : " + this.bonus);
		System.out.println("Çalışanın maaş artışı : " + this.raise);
		salary += (tax + bonus);
		System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + this.salary);
		System.out.println("Çalışanın yeni maaşı : " + (this.salary + this.raise));
	}

}
