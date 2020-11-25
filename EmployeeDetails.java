package employeeDetails;

public class EmployeeGetSet {
private int EmpID;
private String EmpName;
private int EmpAge;
private String EmpAddress;
private String EmpEmail;
private int YearOfJoin;

public int getEmpId() {
	return EmpID;
	}

public void setEmpId(int EmpID) {
	this.EmpID=EmpID;
	}

public String getEmpname() {
	return EmpName;
	}

public void setEmpname(String EmpName) {
	this.EmpName=EmpName;
	}

public int getEmpage() {
	return EmpAge;
	}

public void setEmpage(int EmpAge) {
	this.EmpAge=EmpAge;
	}

public String getEmpaddress() {
	return EmpAddress;
	}

public void setEmpaddress(String EmpAddress) {
	this.EmpAddress=EmpAddress;
	}

public String getEmpemail() {
	return EmpEmail;
	}

public void setEmpemail(String EmpEmail) {
	this.EmpEmail=EmpEmail;
	}

public int getYear() {
	return YearOfJoin;
	}

public void setEmpYear(int YearOfJoin) {
	this.YearOfJoin=YearOfJoin;
	}

}


package employeeDetails;

public class Employee {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeGetSet emp=new EmployeeGetSet();
		//System.out.println("Enter Employee name: "+emp.getEmpname());
		
		emp.setEmpId(2000);
		emp.setEmpname("Robert");
		emp.setEmpage(30);
		emp.setEmpaddress("Delhi");
		emp.setEmpemail("Robert@gamil.com");
		emp.setEmpYear(2018);
		System.out.println("\nEmployeeID: "+ emp.getEmpId()+"\nEmployee Name: "+emp.getEmpname()+"\nEmployee Age "+emp.getEmpage()+"\nEmployee Address :"+emp.getEmpaddress()+"\nEmployee Email ID: "+emp.getEmpemail()+"\nYear of Joining: "+ emp.getYear());
		
		emp.setEmpId(2001);
		emp.setEmpname("Sam");
		emp.setEmpage(31);
		emp.setEmpaddress("Hyderbad");
		emp.setEmpemail("Sam@gamil.com");
		emp.setEmpYear(2019);
		System.out.println("\nEmployeeID: "+ emp.getEmpId()+"\nEmployee Name: "+emp.getEmpname()+"\nEmployee Age "+emp.getEmpage()+"\nEmployee Address :"+emp.getEmpaddress()+"\nEmployee Email ID: "+emp.getEmpemail()+"\nYear of Joining: "+ emp.getYear());
		
		emp.setEmpId(2002);
		emp.setEmpname("John");
		emp.setEmpage(32);
		emp.setEmpaddress("Bengaluru");
		emp.setEmpemail("John@gamil.com");
		emp.setEmpYear(2020);
		
		System.out.println("\nEmployeeID: "+ emp.getEmpId()+"\nEmployee Name: "+emp.getEmpname()+"\nEmployee Age "+emp.getEmpage()+"\nEmployee Address :"+emp.getEmpaddress()+"\nEmployee Email ID: "+emp.getEmpemail()+"\nYear of Joining: "+ emp.getYear());
	}
}
