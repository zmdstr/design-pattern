package com.freemeng.simple.factory;

/**
 * @ClassName:Operator
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年5月24日 上午8:43:51
 */
public abstract class Operator {
	public Double FirstParameter;
	public Double SecondParameter;
	public Double getFirstParameter() {
		return FirstParameter;
	}
	public void setFirstParameter(Double firstParameter) {
		FirstParameter = firstParameter;
	}
	public Double getSecondParameter() {
		return SecondParameter;
	}
	public void setSecondParameter(Double secondParameter) {
		SecondParameter = secondParameter;
	}
	public abstract Double getResult();
}
