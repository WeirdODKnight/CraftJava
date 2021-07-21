package craft.java.packageone;

class Employee {
	//Fields
		private String name;
		private String number;
		private String hireDate;
		
	//Constructor
		public Employee(String name, String number, String hireDate)
		{
			this.name = name;
			this.number = number;
			this.hireDate = hireDate;
		}
		
	//Getters/Setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getHireDate() {
			return hireDate;
		}
		public void setHireDate(String hireDate) {
			this.hireDate = hireDate;
		}

		
		
	}

class ProductionWorker extends Employee{
	//fields
	private int shift;
	private double hourlyPay;
	
	//constructor
	public ProductionWorker(String name, String number, String hireDate) {
		super(name, number, hireDate);
	}
	
	//getters/setters
	public String getShift() {
		if (shift == 1)
			return "Day";
		else if (shift == 2)
			return "Night";
		else
			return "INVALID SHIFT";
	}
	public void setShift(int shift) {
		this.shift = shift;
	}
	public double getHourlyPay() {
		return hourlyPay;
	}
	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	

}

public class InheritanceExample {

	public static void main(String[] args) {
		//set worker1
				ProductionWorker worker1 = new ProductionWorker("Abebe", "423-G", "10/10/10");
				worker1.setShift(1);
				worker1.setHourlyPay(25.63);
				
				//set worker2
				ProductionWorker worker2 = new ProductionWorker("Shegitu", "322-B", "2/5/04");
				worker2.setShift(2);
				worker2.setHourlyPay(26.12);
				
				//display worker1
				System.out.println("Name: " + worker1.getName());
				System.out.println("Number: " + worker1.getNumber());
				System.out.println("Hired: " + worker1.getHireDate());
				System.out.println("Shift: " + worker1.getShift());
				System.out.printf("Hourly Pay: $%.2f\n\n", worker1.getHourlyPay());
				
				//display worker2
				System.out.println("Name: " + worker2.getName());
				System.out.println("Number: " + worker2.getNumber());
				System.out.println("Hired: " + worker2.getHireDate());
				System.out.println("Shift: " + worker2.getShift());
				System.out.printf("Hourly Pay: $%.2f", worker2.getHourlyPay());
				
			}

		}