package com.freemeng.observer;

/**
 * @ClassName:StockObserver
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月21日 上午8:46:09
 */
public class StockObserver extends Observer {

	/**
	 * @param name
	 * @param sub
	 */
	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月21日 上午8:46:09
	 */

	@Override
	public void update() {
		System.out.println(name + "关闭股票行情，继续工作");
	}

}
