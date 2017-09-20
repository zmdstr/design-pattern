package com.freemeng.chain;

/**
 * @ClassName:Majordomoe
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年9月20日 上午8:37:01
 */
public class Majordomoe extends Manager {

	/**
	 * @param name
	 */
	public Majordomoe(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Description:TODO
	 * @author: zhangzhenyang
	 * @time:2017年9月20日 上午8:37:02
	 */

	@Override
	public void RequestApplication(Request request) {
		if (request.getRequestType() == "请假" && request.getNum() <= 5) {
			String string = String.format("%s : %s 数量 %s 被批准", name, request.getRequestContent(), request.getNum());
			System.out.println(string);
		} else {
			if (null != superior) {
				superior.RequestApplication(request);
			}
		}
	}

}
