package com.freemeng.adapter;

/**
 * @ClassName:ForeignCenterPlayer
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月27日 上午8:42:05
 */
public class ForeignCenterPlayer {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ForeignCenterPlayer() {
		// TODO Auto-generated constructor stub
	}

	public ForeignCenterPlayer(String name) {
		this.name = name;
	}

	public void 进攻() {
		System.out.println(this.name + " 进攻");
	}

	public void 防守() {
		System.out.println(this.name + " 防守");
	}

}
