package com.freemeng.adapter;

/**
 * @ClassName:PlayerAdapter
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月27日 上午8:45:12
 */
public class PlayerAdapter extends Player {
	private ForeignCenterPlayer foreignCenterPlayer = new ForeignCenterPlayer();

	public PlayerAdapter(String name) {
		super(name);
		foreignCenterPlayer.setName(name);
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月27日 上午8:45:12
	 */

	@Override
	public void attack() {
		foreignCenterPlayer.进攻();
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月27日 上午8:45:12
	 */

	@Override
	public void defense() {
		foreignCenterPlayer.防守();
	}

}
