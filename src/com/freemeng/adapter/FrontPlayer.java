package com.freemeng.adapter;

/**
 * @ClassName:FrontPlayer
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月27日 上午8:28:15
 */
public class FrontPlayer extends Player {

	public FrontPlayer(String name) {
		super(name);
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月27日 上午8:28:16
	 */

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(super.name + " frongt attack");
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月27日 上午8:28:16
	 */

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println(super.name + " front defense");
	}

}
