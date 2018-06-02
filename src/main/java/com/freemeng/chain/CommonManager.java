package com.freemeng.chain;

/**
 * @ClassName:CommonManager
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年9月19日 上午9:18:15
 */
public class CommonManager extends Manager {

	/**
	 * @param name
	 */
	public CommonManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年9月19日 上午9:18:15
	 */

	@Override
	public void RequestApplication(Request request) {
		if (request.getRequestType() == "请假" && request.getNum() <= 2) {
			System.out.println(name + ":" + request.getRequestContent() + " 数量：" + request.getNum() + "被批准！");
		} else {
			if (null != superior) {
				superior.RequestApplication(request);
			}
		}
	}
}
