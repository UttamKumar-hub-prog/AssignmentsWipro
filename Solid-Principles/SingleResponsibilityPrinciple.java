class Employee{
	private String name;
    
	public Employee(String name) {
		this.name=name;
	}
	public String getDetails() {
		return "Employee Name: "+name;
	}
}

class EmployeePrinter {
    public void print(Employee emp) {
        System.out.println(emp.getDetails());
    }
}

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        Employee e = new Employee("Uttam");
        EmployeePrinter printer = new EmployeePrinter();
        printer.print(e);
    }

}

// Employee Name: Uttam