package com.freemeng.adapter;

/**
 * @ClassName:Player
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月27日 上午8:24:54
 */
public abstract class Player {
	protected String name;

	public Player(String name) {
		this.name = name;
	}

	public abstract void attack();

	public abstract void defense();
}
