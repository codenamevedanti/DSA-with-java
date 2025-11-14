package com.demo.beans;

public class EmployeeSort {
  private int empid;
  private int sal;
  private String ename;
//   private int arr[] emp;
 
  public EmployeeSort() {
	super();
  }
public EmployeeSort(int empid, int sal, String ename) {
	super();
	this.empid = empid;
	this.sal = sal;
	this.ename = ename;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
@Override
public String toString() {
	return "EmployeeSort [empid=" + empid + ", sal=" + sal + ", ename=" + ename + "]";
}
  
public void display() {
	 System.out.println("ID: " + empid + ", Name: " + ename + ", Salary: " + sal);
}
  
  
  
}
