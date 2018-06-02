package com.freemeng.proxy.big.talk;

/**
 * @ClassName:Pursuit
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月29日 上午8:52:16
 */
public class Pursuit implements IGiveGift {
	private SchoolGirl schoolGirl;

	public Pursuit() {
	}

	public Pursuit(SchoolGirl schoolGirl) {
		this.schoolGirl = schoolGirl;
	}
	
	public SchoolGirl getSchoolGirl() {
		return schoolGirl;
	}

	public void setSchoolGirl(SchoolGirl schoolGirl) {
		this.schoolGirl = schoolGirl;
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月29日 上午8:52:17
	 */

	@Override
	public void giveDolls() {
		System.out.println(this.schoolGirl.getName()+"give dolls");
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月29日 上午8:52:17
	 */

	@Override
	public void giveFlowers() {
		System.out.println(this.schoolGirl.getName()+"give flowers");
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年6月29日 上午8:52:17
	 */

	@Override
	public void giveChoolate() {
		System.out.println(this.schoolGirl.getName()+"give Choolate");
	}

}
