package com.demo.test;
import com.demo.solution.*;

public class SingleDimesionalArrayTest {
	public static void main(String[] args) {
	SingleDimesionalArrayOperations ob=new SingleDimesionalArrayOperations();
	System.out.println("Capacity:" +ob.getCapacity());
	ob.addindividual(12);
	ob.addindividual(5);
	ob.addindividual(23);
	System.out.println(ob);
	
	ob.findFactorials();
	System.out.println(ob);
	
	ob.printFactorials();
//	System.out.println(ob);
	}
}
