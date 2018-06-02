package com.freemeng.observer;

/**
 * @ClassName:Observer
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月21日 上午8:34:52
 */
public abstract class Observer {
	protected String name;
	protected Subject sub;

	public Observer(String name,Subject sub) {
		this.name = name;
		this.sub = sub;
	}
	public abstract void update();
}
