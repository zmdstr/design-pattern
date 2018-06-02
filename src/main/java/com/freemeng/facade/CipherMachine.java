package com.freemeng.facade;

/**
 * @ClassName:CipherMachine
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月15日 下午1:54:23
 */
public class CipherMachine {
	public String encrypt(String text) {
		String es = "";
		char[] chars = text.toCharArray();
		for (char ch : chars) {
			String c = (ch % 7) + "";
			es += c;
		}
		return es;
	}
}
