package com.freemeng.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:Boss
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月21日 上午8:40:02
 */
public class Boss implements Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private String action;

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月21日 上午8:40:28
	 */

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月21日 上午8:40:28
	 */

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月21日 上午8:40:28
	 */

	@Override
	public void myNotify() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
