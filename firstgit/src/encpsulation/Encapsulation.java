package encpsulation;

public class Encapsulation {
	
	private int empid;
	private int empssn;
	private String empname;
	

	public static void main(String[] args) {
		Encapsulation obj =new Encapsulation();
		obj.setEmpid(19);
		obj.setEmpssn(123456);
		obj.setEmpname("Amarender");
		
		System.out.println("Employee id=" +obj.getEmpid());
		System.out.println("Employee name=" +obj.getEmpname());
		System.out.println("Employee ssn="+obj.getEmpssn());

	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public int getEmpssn() {
		return empssn;
	}


	public void setEmpssn(int empssn) {
		this.empssn = empssn;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}

}
