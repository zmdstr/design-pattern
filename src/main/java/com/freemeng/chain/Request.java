package com.freemeng.chain;

/**
 * @ClassName:Request
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年9月19日 上午9:16:12
 */
public class Request {
	private String requestType;
	private String requestContent;
	private int Num;
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getRequestContent() {
		return requestContent;
	}
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	
}
