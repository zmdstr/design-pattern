package com.freemeng.chain;

/**
 * @ClassName:App
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年9月20日 上午8:57:46
 */
public class App {
	public static void main(String[] args) {
		CommonManager commonManager = new CommonManager("经理");
		Majordomoe majordomoe = new Majordomoe("总监");
		GeneralManager generalManager = new GeneralManager("总经理");
		commonManager.setSuperior(majordomoe);
		majordomoe.setSuperior(generalManager);
		
		Request request = new Request();
		request.setRequestType("请假");
		request.setRequestContent("卡尔请假");
		request.setNum(1);
		
		commonManager.RequestApplication(request);
		
		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("卡尔请假");
		request2.setNum(4);
		
		commonManager.RequestApplication(request2);
		
		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("火女加薪");
		request3.setNum(500);
		
		commonManager.RequestApplication(request3);
		
		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setRequestContent("祈求者加薪");
		request4.setNum(1000);
		
		commonManager.RequestApplication(request4);
	}
}
