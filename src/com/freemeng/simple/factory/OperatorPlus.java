package com.freemeng.simple.factory;

/**
 * @ClassName:OperatorPlus
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年5月24日 上午8:58:20
 */
public class OperatorPlus extends Operator {

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年5月24日 上午9:02:51
	 */

	@Override
	public Double getResult() {

		return FirstParameter - SecondParameter;
	}

}
