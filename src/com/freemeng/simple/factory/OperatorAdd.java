package com.freemeng.simple.factory;

/**
 * @ClassName:OperatorAdd
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年5月24日 上午8:48:52
 */
public class OperatorAdd extends Operator {

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年5月24日 上午8:48:52
	 */

	@Override
	public Double getResult() {

		return FirstParameter + SecondParameter;
	}

}
