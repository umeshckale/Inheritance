
public class Employee {

	String ename;
	int eid;
	String designation;
	String address;
    double salary;	
	public String showEmployeeDetails(){
		@Override
		public String toString() {
			return "Employee [ename=" + ename + ", eid=" + eid + ", designation=" + designation + ", address=" + address
					+ ", salary=" + salary + "]";
		}
	
	}	
		
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	
	
	
	
}
