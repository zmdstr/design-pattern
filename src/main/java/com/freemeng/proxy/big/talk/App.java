package com.freemeng.proxy.big.talk;

/**
 * @ClassName:App
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月29日 上午9:04:15
 */
public class App {
	public static void main(String[] args) {
		SchoolGirl schoolGirl = new SchoolGirl();
		schoolGirl.setName("女神");
		Proxy daili = new Proxy(schoolGirl);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChoolate();
	}
}
