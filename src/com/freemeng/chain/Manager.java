package com.freemeng.chain;

/**
 * @ClassName:Manager
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年9月19日 上午9:11:48
 */
public abstract class Manager {
	protected String name;
	protected Manager superior;

	public Manager(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Manager getSuperior() {
		return superior;
	}

	public void setSuperior(Manager superior) {
		this.superior = superior;
	}
	abstract public void RequestApplication(Request request);
}
