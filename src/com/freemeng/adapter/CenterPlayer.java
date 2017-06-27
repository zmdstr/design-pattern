package com.freemeng.adapter;

/**
 * @ClassName:CenterPlayer
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月27日 上午8:29:02
 */
public class CenterPlayer extends Player {

	public CenterPlayer(String name) {
		super(name);
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月27日 上午8:29:02
	 */

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(super.name + " center attack");
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月27日 上午8:29:02
	 */

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println(super.name + " center defense");
	}

}
