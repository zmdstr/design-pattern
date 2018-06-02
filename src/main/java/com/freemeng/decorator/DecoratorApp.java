package com.freemeng.decorator;

/**
 * @ClassName:DecoratorApp
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年7月6日 上午8:32:01
 */
public class DecoratorApp {
	public static void main(String[] args) {
		Person person = new Person("卡尔");
		BigTrouser bigTrouser = new BigTrouser();
		TShirts tShirts = new TShirts();
		System.out.println("第一种装扮：");
		
		tShirts.decorate(person);
		bigTrouser.decorate(tShirts);
		bigTrouser.show();
		System.out.println("第二种装扮：");
		
		bigTrouser.decorate(person);
		tShirts.decorate(bigTrouser);
		tShirts.show();
		
		
	}
}
