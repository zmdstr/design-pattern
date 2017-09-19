package com.freemeng.decorator;

/**
 * @ClassName:Finery
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年7月6日 上午8:25:43
 */
public class Finery extends Person {

	private Person person;

	public void decorate(Person person) {
		this.person = person;
	}

	public void show() {
		if (null != person) {
			person.show();
		}
	}
}
