package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personid;
	private Certi certi;
	private List<String> list;
	public Person(String name, int personid,Certi certi,List<String> list) {
		this.name = name;
		this.personid = personid;
		this.certi=certi;
		this.list=list;
	}
	@Override
	public String toString() {
		return name+" : "+personid+" { "+this.certi.name+" }"+"\n"+list;
	}
	
}
