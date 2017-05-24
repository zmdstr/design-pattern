package com.freemeng.simple.factory;

/**
 * @ClassName:OperatorFactory
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年5月24日 上午8:53:49
 */
public class OperatorFactory {
	public Operator getOperator(String operator){
		switch (operator) {
		case "+":
				return new OperatorAdd();
		default:
			return null;
		}
	}
}
