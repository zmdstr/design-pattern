package com.freemeng.facade;

/**
 * @ClassName:EncryptApp
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月15日 下午2:17:04
 */
public class EncryptApp {
	public static void main(String[] args) {
		EncryptFacade facade = new EncryptFacade();
		facade.encry("D:\\test.txt", "D:\\test_a.txt");
	}
}
