package com.freemeng.proxy;

/**
 * @ClassName:Proxy
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月29日 上午9:00:17
 */
public class Proxy implements IGiveGift {

	private SchoolGirl schoolGirl;
	private Pursuit pursuit;

	public SchoolGirl getSchoolGirl() {
		return schoolGirl;
	}

	public void setSchoolGirl(SchoolGirl schoolGirl) {
		this.schoolGirl = schoolGirl;
	}

	public Pursuit getPursuit() {
		return pursuit;
	}

	public void setPursuit(Pursuit pursuit) {
		this.pursuit = pursuit;
	}

	public Proxy() {
	}

	public Proxy(SchoolGirl schoolGirl) {
		pursuit = new Pursuit(schoolGirl);
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月29日 上午9:00:35
	 */

	@Override
	public void giveDolls() {
		this.pursuit.giveDolls();
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月29日 上午9:00:35
	 */

	@Override
	public void giveFlowers() {
		this.pursuit.giveFlowers();
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月29日 上午9:00:35
	 */

	@Override
	public void giveChoolate() {
		this.pursuit.giveChoolate();
	}

}
