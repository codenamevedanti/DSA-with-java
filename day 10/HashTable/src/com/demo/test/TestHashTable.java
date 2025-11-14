package com.demo.test;
import com.demo.hash.*;

public class TestHashTable {

	public static void main(String[] args) {
		MyHashTable mt=new MyHashTable();
		mt.insertData(12);
		mt.insertData(23);
		mt.insertData(45);
		mt.insertData(20);
		mt.insertData(23);
		mt.displaytdata();
	}

}
