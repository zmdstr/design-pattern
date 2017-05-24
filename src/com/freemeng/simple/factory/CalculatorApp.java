package com.freemeng.simple.factory;

import java.util.Scanner;

/**
 * @ClassName:CalculatorApp
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年5月24日 上午8:41:36
 */
public class CalculatorApp {
	public static void main(String[] args) {
		System.out.println("请输入第一个参数：");
		Scanner scanner = new Scanner(System.in);
		double firstParemeter = scanner.nextDouble();
		System.out.println("请输入运算符：");
		String operatorInput = scanner.next();
		System.out.println("请输入第二个参数：");
		double secondParemeter = scanner.nextDouble();
		OperatorFactory operatorFactory = new OperatorFactory();
		Operator operator = operatorFactory.getOperator(operatorInput);
		operator.setFirstParameter(firstParemeter);
		operator.setSecondParameter(secondParemeter);
		Double result = operator.getResult();
		System.out.println("运算" + result);
		scanner.close();
	}
}
