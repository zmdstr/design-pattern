package com.freemeng.decorator;

/**
 * @ClassName:Person
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年7月6日 上午8:22:47
 */
public class Person {
	private String name;
	public Person(){
		
	}
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("装扮的" + this.name);
	}
}
