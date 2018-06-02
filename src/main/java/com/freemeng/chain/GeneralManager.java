package com.freemeng.chain;

/**
 * @ClassName:GeneralManager
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年9月20日 上午8:47:06
 */
public class GeneralManager extends Manager {

	/**
	 * @param name
	 */
	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年9月20日 上午8:47:06
	 */

	@Override
	public void RequestApplication(Request request) {
		if (request.getRequestType() == "请假") {
			String string = String.format("%s:%s 数量 %s 被批准！", name, request.getRequestContent(), request.getNum());
			System.out.println(string);
		} else if (request.getRequestType() == "加薪" && request.getNum() <= 500) {
			String string = String.format("%s:%s 数量 %s 被批准！", name, request.getRequestContent(), request.getNum());
			System.out.println(string);
		} else if(request.getRequestType()=="加薪"&& request.getNum()>500){
			String string = String.format("%s:%s 数量 %s 在考虑一下吧！", name,request.getRequestContent(),request.getNum());
			System.out.println(string);
			
		}
	}

}
