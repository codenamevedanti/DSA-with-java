package com.demo.test;
import com.demo.beans.Employee;

import cpm.demo.linkedlist.EmployeeSinglyList;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeSinglyList elsit=new EmployeeSinglyList();
		System.out.println("This is the employee linked list:");
		elsit.addnode(new Employee(12,"rajas",200,"accounts"));
		elsit.addnode(new Employee(13,"mahesh",5600,"HR"));
		elsit.addnode(new Employee(14,"rajan",900,"accounts"));
		elsit.addnode(new Employee(15,"rajan",9000,"Manager"));
		elsit.addnode(new Employee(16,"gauri",9000,"sales"));
		elsit.addnode(new Employee(18,"raju",900,"hr"));
		elsit.addnode(new Employee());
		elsit.displaydata();

		elsit.addByPosition(2, new Employee(20,"Girish",989898,"Marketing"));
		elsit.displaydata();
		
		elsit.modifySalById(13, 4450000);
		elsit.displaydata();
	}

}
