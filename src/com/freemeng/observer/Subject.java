package com.freemeng.observer;

/**
 * @ClassName:Subject
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月21日 上午8:31:56
 */
public interface Subject {

	void attach(Observer observer);

	void detach(Observer observer);

	void myNotify();
	
}
