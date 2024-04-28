package mysqlhibernate;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	@Id @Column (name="empId") @GeneratedValue(strategy = GenerationType.IDENTITY) private int empId;
	@Column (name="empName") private String empName;
	@Column (name="dept") private String dept;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee(int empId, String empName, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}