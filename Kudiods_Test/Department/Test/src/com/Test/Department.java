package com.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Department {

	public static void main(String[] args) {
		
		HashMap<String, String> emp = new HashMap();
		
		List<String> dept = new ArrayList<String>();
		
		dept.add("Computer");
		dept.add("E&Tc");
		dept.add("Civil");
		dept.add("Mechanical");
		dept.add("AI");
		
		emp.put("Ketan","computer");
		emp.put("Sneha","E&TC");
		emp.put("Puja","Civil");
		emp.put("Rakesh","Mechanical");
		emp.put("Kunal","AI");
		System.out.println(emp);
		System.out.println(dept);
	}

}
