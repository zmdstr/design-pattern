package com.freemeng.adapter;

/**
 * @ClassName:App
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月27日 上午8:29:26
 */
public class App {
	
	public static void main(String[] args) {
		Player playerA = new FrontPlayer("卡尔");
		Player playerB = new CenterPlayer("刚背");
		playerA.attack();
		playerB.defense();
		// 引入外籍中锋
		Player playerC = new PlayerAdapter("姚明");
		playerC.attack();
	}
}
