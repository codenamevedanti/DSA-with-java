package com.demo.beans;

public class Employee {
      private int empno;
      private String ename;
      private double sal;
      private String dept;
	
      
      


	public Employee() {
		super();
	}


	public Employee(int empno, String ename, double sal, String dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
	}


	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", dept=" + dept + "]";
	}
      
      
}
